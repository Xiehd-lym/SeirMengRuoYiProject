package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.MajorSubject;
import com.ruoyi.system.service.IMajorSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 意向专业Controller
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/system/subject")
public class MajorSubjectController extends BaseController
{
    private String prefix = "system/subject";

    @Autowired
    private IMajorSubjectService majorSubjectService;

//    @RequiresPermissions("system:subject:view")
    @GetMapping()
    public String subject()
    {
        return prefix + "/subject";
    }

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestParam("file") MultipartFile file) throws IOException
    {
        ExcelUtil<MajorSubject> util = new ExcelUtil<>(MajorSubject.class);
        List<MajorSubject> majorSubjects = null;
        try {
            majorSubjects = util.importExcel(file.getInputStream());
            for (MajorSubject majorSubject : majorSubjects) {
                majorSubjectService.insertMajorSubject(majorSubject);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new AjaxResult(AjaxResult.Type.SUCCESS,"导入成功");
    }


    /**
     * 查询意向专业列表
     */
//    @RequiresPermissions("system:subject:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MajorSubject majorSubject)
    {
        startPage();
        majorSubject.setExcelUserName(ShiroUtils.getLoginName());
        List<MajorSubject> list = majorSubjectService.selectMajorSubjectList(majorSubject);
        return getDataTable(list);
    }

    /**
     * 导出意向专业列表
     */
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MajorSubject majorSubject)
    {
        majorSubject.setExcelUserName(ShiroUtils.getLoginName());
        List<MajorSubject> list = majorSubjectService.selectMajorSubjectList(majorSubject);
        ExcelUtil<MajorSubject> util = new ExcelUtil<MajorSubject>(MajorSubject.class);
        return util.exportExcel(list, "意向专业数据");
    }

    /**
     * 导ru意向专业列表
     */

    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file) throws Exception
    {
        MajorSubject majorSubject = new MajorSubject();
        majorSubject.setExcelUserName(ShiroUtils.getLoginName());
        if (majorSubjectService.selectMajorSubjectList(majorSubject).size()>0){
            return new AjaxResult(AjaxResult.Type.ERROR,"您已存在志愿数据，无法进行导入操作");
        }
//        List<MajorSubject> list = majorSubjectService.selectMajorSubjectList(majorSubject);

        ExcelUtil<MajorSubject> util = new ExcelUtil<MajorSubject>(MajorSubject.class);

        List<MajorSubject> excelUserList = util.importExcel(file.getInputStream());

        for (MajorSubject subject : excelUserList) {
            subject.setExcelUserName(ShiroUtils.getLoginName());
            majorSubjectService.insertMajorSubject(subject);
        }
        return AjaxResult.success();
    }
//
//    /**
//     * 新增意向专业
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存意向专业
//     */
//    @RequiresPermissions("system:subject:add")
//    @Log(title = "意向专业", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(MajorSubject majorSubject)
//    {
//        majorSubject.setExcelUserName(ShiroUtils.getLoginName());
//        return toAjax(majorSubjectService.insertMajorSubject(majorSubject));
//    }
//
//    /**
//     * 修改意向专业
//     */
//    @RequiresPermissions("system:subject:edit")
//    @GetMapping("/edit/{id}")
//    public String edit(@PathVariable("id") Long id, ModelMap mmap)
//    {
//        MajorSubject majorSubject = majorSubjectService.selectMajorSubjectById(id);
//        mmap.put("majorSubject", majorSubject);
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存意向专业
//     */
//    @RequiresPermissions("system:subject:edit")
//    @Log(title = "意向专业", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(MajorSubject majorSubject)
//    {
//        return toAjax(majorSubjectService.updateMajorSubject(majorSubject));
//    }
//
//    /**
//     * 删除意向专业
//     */
//    @RequiresPermissions("system:subject:remove")
//    @Log(title = "意向专业", businessType = BusinessType.DELETE)
//    @PostMapping( "/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//        return toAjax(majorSubjectService.deleteMajorSubjectByIds(ids));
//    }
}
