package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.Part;
import com.ruoyi.system.service.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 零件Controller
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/system/part")
public class PartController extends BaseController
{
    private String prefix = "system/part";

    @Autowired
    private IPartService partService;

//    @RequiresPermissions("system:part:view")
    @GetMapping()
    public String part()
    {
        return prefix + "/part";
    }

    /**
     * 查询零件列表
     */
//    @RequiresPermissions("system:part:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Part part)
    {
        startPage();
        List<Part> list = partService.selectPartList(part);
        return getDataTable(list);
    }

    /**
     * 导出零件列表
     */
//    @RequiresPermissions("system:part:export")
    @Log(title = "零件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Part part)
    {
        List<Part> list = partService.selectPartList(part);
        ExcelUtil<Part> util = new ExcelUtil<Part>(Part.class);
        return util.exportExcel(list, "零件数据");
    }

    /**
     * 新增零件
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存零件
     */
//    @RequiresPermissions("system:part:add")
    @Log(title = "零件", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Part part)
    {
        return toAjax(partService.insertPart(part));
    }

    /**
     * 修改零件
     */
//    @RequiresPermissions("system:part:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Part part = partService.selectPartById(id);
        mmap.put("part", part);
        return prefix + "/edit";
    }

    /**
     * 修改保存零件
     */
//    @RequiresPermissions("system:part:edit")
    @Log(title = "零件", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Part part)
    {
        return toAjax(partService.updatePart(part));
    }

    /**
     * 删除零件
     */
//    @RequiresPermissions("system:part:remove")
    @Log(title = "零件", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(partService.deletePartByIds(ids));
    }
}
