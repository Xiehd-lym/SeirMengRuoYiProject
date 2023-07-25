package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseGxy;
import com.ruoyi.system.service.IDiseaseGxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 高血压Controller
 * 
 * @author Xiehd
 * @date 2023-07-04
 */
@Controller
@RequestMapping("/system/gxy")
public class DiseaseGxyController extends BaseController
{
    private String prefix = "system/gxy";

    @Autowired
    private IDiseaseGxyService diseaseGxyService;


    @GetMapping()
    public String gxy()
    {
        return prefix + "/gxy";
    }

    /**
     * 查询高血压列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseGxy diseaseGxy)
    {
        startPage();
        List<DiseaseGxy> list = diseaseGxyService.selectDiseaseGxyList(diseaseGxy);
        return getDataTable(list);
    }

    /**
     * 导出高血压列表
     */

    @Log(title = "高血压", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseGxy diseaseGxy)
    {
        List<DiseaseGxy> list = diseaseGxyService.selectDiseaseGxyList(diseaseGxy);
        ExcelUtil<DiseaseGxy> util = new ExcelUtil<DiseaseGxy>(DiseaseGxy.class);
        return util.exportExcel(list, "高血压数据");
    }

    /**
     * 新增高血压
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高血压
     */

    @Log(title = "高血压", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseGxy diseaseGxy)
    {
        diseaseGxy.setZuigaoyiju("县区级医院");
        diseaseGxy.setIcd("I10");
        return toAjax(diseaseGxyService.insertDiseaseGxy(diseaseGxy));
    }

    /**
     * 修改高血压
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseGxy diseaseGxy = diseaseGxyService.selectDiseaseGxyById(id);
        mmap.put("diseaseGxy", diseaseGxy);
        return prefix + "/edit";
    }

    /**
     * 修改保存高血压
     */

    @Log(title = "高血压", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseGxy diseaseGxy)
    {
        return toAjax(diseaseGxyService.updateDiseaseGxy(diseaseGxy));
    }

    /**
     * 删除高血压
     */

    @Log(title = "高血压", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseGxyService.deleteDiseaseGxyByIds(ids));
    }
}
