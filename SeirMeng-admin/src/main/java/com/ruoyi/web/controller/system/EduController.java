package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.Edu;
import com.ruoyi.system.service.IEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生成绩Controller
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Controller
@RequestMapping("/system/edu")
public class EduController extends BaseController
{
    private String prefix = "system/edu";

    @Autowired
    private IEduService eduService;


    @GetMapping("/eduList")
    public String eduList()
    {
        return prefix + "/eduList";
    }

    @GetMapping()
    public String edu()
    {
        return prefix + "/edu";
    }

    /**
     * 查询学生成绩列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Edu edu)
    {
        startPage();
        List<Edu> list = eduService.selectEduList(edu);
        return getDataTable(list);
    }
    /**
     * 查询学生成绩列表
     */

    @PostMapping("/mylist")
    @ResponseBody
    public TableDataInfo mylist(Edu edu)
    {
        startPage();
        String loginName = ShiroUtils.getLoginName();
        edu.setName(loginName);
        List<Edu> list = eduService.selectEduList(edu);
        return getDataTable(list);
    }

    /**
     * 导出学生成绩列表
     */

    @Log(title = "学生成绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Edu edu)
    {
        List<Edu> list = eduService.selectEduList(edu);
        ExcelUtil<Edu> util = new ExcelUtil<Edu>(Edu.class);
        return util.exportExcel(list, "学生成绩数据");
    }

    /**
     * 新增学生成绩
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生成绩
     */

    @Log(title = "学生成绩", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Edu edu)
    {
        return toAjax(eduService.insertEdu(edu));
    }

    /**
     * 修改学生成绩
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Edu edu = eduService.selectEduById(id);
        mmap.put("edu", edu);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生成绩
     */

    @Log(title = "学生成绩", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Edu edu)
    {
        return toAjax(eduService.updateEdu(edu));
    }

    /**
     * 删除学生成绩
     */

    @Log(title = "学生成绩", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(eduService.deleteEduByIds(ids));
    }



    public void getTest(){

    }
}
