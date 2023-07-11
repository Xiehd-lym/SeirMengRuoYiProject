package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TAddressInfo;
import com.ruoyi.system.service.ITAddressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 地区编码Controller
 * 
 * @author Xiehd
 * @date 2023-07-11
 */
@Controller
@RequestMapping("/system/info")
public class TAddressInfoController extends BaseController
{
    private String prefix = "system/info";

    @Autowired
    private ITAddressInfoService tAddressInfoService;


    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询地区编码列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TAddressInfo tAddressInfo)
    {
        startPage();
        List<TAddressInfo> list = tAddressInfoService.selectTAddressInfoList(tAddressInfo);
        return getDataTable(list);
    }

    @PostMapping("/adressResource")
    @ResponseBody
    public AjaxResult adressResource(TAddressInfo tAddressInfo)
    {
        List<TAddressInfo> list = tAddressInfoService.selectTAddressInfoList(tAddressInfo);
        return AjaxResult.success(list);
    }

    /**
     * 导出地区编码列表
     */

    @Log(title = "地区编码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TAddressInfo tAddressInfo)
    {
        List<TAddressInfo> list = tAddressInfoService.selectTAddressInfoList(tAddressInfo);
        ExcelUtil<TAddressInfo> util = new ExcelUtil<TAddressInfo>(TAddressInfo.class);
        return util.exportExcel(list, "地区编码数据");
    }

    /**
     * 新增地区编码
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存地区编码
     */

    @Log(title = "地区编码", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TAddressInfo tAddressInfo)
    {
        return toAjax(tAddressInfoService.insertTAddressInfo(tAddressInfo));
    }

    /**
     * 修改地区编码
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TAddressInfo tAddressInfo = tAddressInfoService.selectTAddressInfoById(id);
        mmap.put("tAddressInfo", tAddressInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存地区编码
     */

    @Log(title = "地区编码", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TAddressInfo tAddressInfo)
    {
        return toAjax(tAddressInfoService.updateTAddressInfo(tAddressInfo));
    }

    /**
     * 删除地区编码
     */

    @Log(title = "地区编码", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tAddressInfoService.deleteTAddressInfoByIds(ids));
    }
}
