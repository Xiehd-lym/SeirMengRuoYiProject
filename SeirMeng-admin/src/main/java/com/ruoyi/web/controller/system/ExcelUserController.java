package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.shiro.service.SysRegisterService;
import com.ruoyi.system.domain.ExcelUser;
import com.ruoyi.system.service.IExcelUserService;
import org.apache.catalina.User;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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

    @RequiresPermissions("system:excelUser:view")
    @GetMapping()
    public String excelUser()
    {
        return prefix + "/excelUser";
    }

    @RequiresPermissions("system:excelDownload:view")
    @GetMapping("excelDownload")
    public String excelDownload()
    {
        return prefix + "/excelDownload";
    }

    /**
     * 查询用户表格列表
     */
    @RequiresPermissions("system:excelUser:list")
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

    /**
     * 导出用户表格列表
     */
    @RequiresPermissions("system:excelUser:export")
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
    @RequiresPermissions("system:excelUser:add")
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
    @RequiresPermissions("system:excelUser:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ExcelUser excelUser = excelUserService.selectExcelUserById(id);
        mmap.put("excelUser", excelUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户表格
     */
    @RequiresPermissions("system:excelUser:edit")
    @Log(title = "用户表格", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ExcelUser excelUser)
    {
        return toAjax(excelUserService.updateExcelUser(excelUser));
    }

    /**
     * 删除用户表格
     */
    @RequiresPermissions("system:excelUser:remove")
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
