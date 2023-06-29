package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Wages;
import com.ruoyi.system.service.IWagesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工资Controller
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Controller
@RequestMapping("/system/wages")
public class WagesController extends BaseController
{
    private String prefix = "system/wages";

    @Autowired
    private IWagesService wagesService;


    @GetMapping()
    public String wages()
    {
        return prefix + "/wages";
    }


    @GetMapping("/wagesList")
    public String wagesList()
    {
        return prefix + "/wagesList";
    }

    /**
     * 查询工资列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Wages wages)
    {
        startPage();
        List<Wages> list = wagesService.selectWagesList(wages);
        return getDataTable(list);
    }
    /**
     * 查询我的工资列表
     */

    @PostMapping("/mylist")
    @ResponseBody
    public TableDataInfo mylist(Wages wages)
    {
        startPage();
        String loginName = ShiroUtils.getLoginName();
        wages.setName(loginName);
        List<Wages> list = wagesService.selectWagesList(wages);
        return getDataTable(list);
    }

    /**
     * 导出工资列表
     */

    @Log(title = "工资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Wages wages)
    {
        List<Wages> list = wagesService.selectWagesList(wages);
        ExcelUtil<Wages> util = new ExcelUtil<Wages>(Wages.class);
        return util.exportExcel(list, "工资数据");
    }

    /**
     * 新增工资
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工资
     */

    @Log(title = "工资", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Wages wages)
    {
        wages.setWorkFlag("Y");
        return toAjax(wagesService.insertWages(wages));
    }

    /**
     * 修改工资
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Wages wages = wagesService.selectWagesById(id);
        mmap.put("wages", wages);
        return prefix + "/edit";
    }

    /**
     * 修改保存工资
     */

    @Log(title = "工资", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Wages wages)
    {
        return toAjax(wagesService.updateWages(wages));
    }

    /**
     * 删除工资
     */

    @Log(title = "工资", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wagesService.deleteWagesByIds(ids));
    }
}
