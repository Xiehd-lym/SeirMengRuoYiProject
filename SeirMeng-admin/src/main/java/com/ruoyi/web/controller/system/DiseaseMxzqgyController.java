package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseMxzqgy;
import com.ruoyi.system.service.IDiseaseMxzqgyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 慢性支气管炎Controller
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Controller
@RequestMapping("/system/mxzqgy")
public class DiseaseMxzqgyController extends BaseController
{
    private String prefix = "system/mxzqgy";

    @Autowired
    private IDiseaseMxzqgyService diseaseMxzqgyService;


    @GetMapping()
    public String mxzqgy()
    {
        return prefix + "/mxzqgy";
    }

    /**
     * 查询慢性支气管炎列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseMxzqgy diseaseMxzqgy)
    {
        startPage();
        List<DiseaseMxzqgy> list = diseaseMxzqgyService.selectDiseaseMxzqgyList(diseaseMxzqgy);
        return getDataTable(list);
    }

    /**
     * 导出慢性支气管炎列表
     */

    @Log(title = "慢性支气管炎", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseMxzqgy diseaseMxzqgy)
    {
        List<DiseaseMxzqgy> list = diseaseMxzqgyService.selectDiseaseMxzqgyList(diseaseMxzqgy);
        ExcelUtil<DiseaseMxzqgy> util = new ExcelUtil<DiseaseMxzqgy>(DiseaseMxzqgy.class);
        return util.exportExcel(list, "慢性支气管炎数据");
    }

    /**
     * 新增慢性支气管炎
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存慢性支气管炎
     */

    @Log(title = "慢性支气管炎", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseMxzqgy diseaseMxzqgy)
    {
        return toAjax(diseaseMxzqgyService.insertDiseaseMxzqgy(diseaseMxzqgy));
    }

    /**
     * 修改慢性支气管炎
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseMxzqgy diseaseMxzqgy = diseaseMxzqgyService.selectDiseaseMxzqgyById(id);
        mmap.put("diseaseMxzqgy", diseaseMxzqgy);
        return prefix + "/edit";
    }

    /**
     * 修改保存慢性支气管炎
     */

    @Log(title = "慢性支气管炎", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseMxzqgy diseaseMxzqgy)
    {
        return toAjax(diseaseMxzqgyService.updateDiseaseMxzqgy(diseaseMxzqgy));
    }

    /**
     * 删除慢性支气管炎
     */

    @Log(title = "慢性支气管炎", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseMxzqgyService.deleteDiseaseMxzqgyByIds(ids));
    }
}
