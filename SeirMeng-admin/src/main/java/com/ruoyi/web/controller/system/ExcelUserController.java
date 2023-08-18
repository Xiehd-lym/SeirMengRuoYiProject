package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.shiro.service.SysPasswordService;
import com.ruoyi.framework.shiro.service.SysRegisterService;
import com.ruoyi.system.domain.ExcelUser;
import com.ruoyi.system.service.IExcelUserService;
import com.ruoyi.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户表格Controller
 * 
 * @author Xiehd
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/system/excelUser")
public class ExcelUserController extends BaseController
{
    @Autowired
    private SysRegisterService registerService;
    private String prefix = "system/excelUser";

    @Autowired
    private IExcelUserService excelUserService;


    @GetMapping()
    public String excelUser()
    {
        return prefix + "/excelUser";
    }


    @GetMapping("excelDownload")
    public String excelDownload()
    {
        return prefix + "/excelDownload";
    }

    /**
     * 查询用户表格列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ExcelUser excelUser)
    {
        startPage();
        List<ExcelUser> list = excelUserService.selectExcelUserList(excelUser);
        return getDataTable(list);
    }

    /**
     * 导入
     * @param file
     * @param updateSupport
     * @return
     * @throws Exception
     */
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ExcelUser> util = new ExcelUtil<ExcelUser>(ExcelUser.class);
        List<ExcelUser> excelUserList = util.importExcel(file.getInputStream());
        for (ExcelUser excelUser : excelUserList) {
            SysUser user = new SysUser();
            user.setLoginName(excelUser.getUserName());
            user.setPassword(excelUser.getPassword());
            user.setRoleId(2l);
            user.setDeptId(100l);
            registerService.register(user);
            excelUserService.insertExcelUser(excelUser);
        }
        return AjaxResult.success();
    }

//    @PostMapping("/addStudent")
//    @ResponseBody
//    public AjaxResult addSave(@RequestParam("file") MultipartFile file, SysFileInfo fileInfo) throws IOException
//    {
//        // 上传文件路径
//        String filePath = RuoYiConfig.getUploadPath();
//        // 上传并返回新文件名称
//        String fileName = FileUploadUtils.upload(filePath, file);
//        fileInfo.setFilePath(fileName);
//        return toAjax(sysFileInfoService.insertSysFileInfo(fileInfo));
//    }

    /**
     * 导出用户表格列表
     */

    @Log(title = "用户表格", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ExcelUser excelUser)
    {
        List<ExcelUser> list = excelUserService.selectExcelUserList(excelUser);
        ExcelUtil<ExcelUser> util = new ExcelUtil<ExcelUser>(ExcelUser.class);
        return util.exportExcel(list, "用户表格数据");
    }

    /**
     * 新增用户表格
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户表格
     */

    @Log(title = "用户表格", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ExcelUser excelUser)
    {
        return toAjax(excelUserService.insertExcelUser(excelUser));
    }

    /**
     * 修改用户表格
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ExcelUser excelUser = excelUserService.selectExcelUserById(id);
        mmap.put("excelUser", excelUser);
        return prefix + "/edit";
    }

    @Autowired
    private SysPasswordService passwordService;

    @Autowired
    private ISysUserService userService;
    /**
     * 修改保存用户表格
     */

    @Log(title = "用户表格", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ExcelUser excelUser)
    {
        SysUser user = userService.selectUserByLoginName(excelUser.getUserName());
        user.setSalt(ShiroUtils.randomSalt());
        user.setPassword(passwordService.encryptPassword(user.getLoginName(), excelUser.getPassword(), user.getSalt()));
        userService.resetUserPwd(user);
        return toAjax(excelUserService.updateExcelUser(excelUser));
    }

    /**
     * 删除用户表格
     */

    @Log(title = "用户表格", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(excelUserService.deleteExcelUserByIds(ids));
    }

    /**
     * 本地资源通用下载
     */
    @GetMapping("/common/download/resource")
    public void resourceDownload(@RequestParam("fileName") String fileName, String resource, HttpServletRequest request, HttpServletResponse response)throws Exception
    {
        // 本地资源路径
        String localPath = RuoYiConfig.getProfile();
        System.out.println("localPath:-----"+localPath);
        // 数据库资源地址
//        String downloadPath = localPath + StringUtils.substringAfter(resource, Constants.RESOURCE_PREFIX);
        String downloadPath = localPath + "/"+fileName;
        System.out.println("downloadPath:-----"+downloadPath);
        // 下载名称
        String downloadName = StringUtils.substringAfterLast(downloadPath, "/");
        System.out.println("downloadName"+downloadName);
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;fileName=" + FileUtils.setFileDownloadHeader(request, downloadName));
        FileUtils.writeBytes(downloadPath, response.getOutputStream());
    }

}
