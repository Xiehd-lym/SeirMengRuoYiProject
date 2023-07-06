package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseNcz;
import com.ruoyi.system.service.IDiseaseNczService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 脑卒中Controller
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Controller
@RequestMapping("/system/ncz")
public class DiseaseNczController extends BaseController
{
    private String prefix = "system/ncz";

    @Autowired
    private IDiseaseNczService diseaseNczService;


    @GetMapping()
    public String ncz()
    {
        return prefix + "/ncz";
    }

    /**
     * 查询脑卒中列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseNcz diseaseNcz)
    {
        startPage();
        List<DiseaseNcz> list = diseaseNczService.selectDiseaseNczList(diseaseNcz);
        return getDataTable(list);
    }

    /**
     * 导出脑卒中列表
     */

    @Log(title = "脑卒中", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseNcz diseaseNcz)
    {
        List<DiseaseNcz> list = diseaseNczService.selectDiseaseNczList(diseaseNcz);
        ExcelUtil<DiseaseNcz> util = new ExcelUtil<DiseaseNcz>(DiseaseNcz.class);
        return util.exportExcel(list, "脑卒中数据");
    }

    /**
     * 新增脑卒中
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存脑卒中
     */

    @Log(title = "脑卒中", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseNcz diseaseNcz)
    {
        return toAjax(diseaseNczService.insertDiseaseNcz(diseaseNcz));
    }

    /**
     * 修改脑卒中
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseNcz diseaseNcz = diseaseNczService.selectDiseaseNczById(id);
        mmap.put("diseaseNcz", diseaseNcz);
        return prefix + "/edit";
    }

    /**
     * 修改保存脑卒中
     */

    @Log(title = "脑卒中", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseNcz diseaseNcz)
    {
        return toAjax(diseaseNczService.updateDiseaseNcz(diseaseNcz));
    }

    /**
     * 删除脑卒中
     */

    @Log(title = "脑卒中", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseNczService.deleteDiseaseNczByIds(ids));
    }
}
