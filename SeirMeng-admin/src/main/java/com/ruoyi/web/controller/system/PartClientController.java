package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.PartClient;
import com.ruoyi.system.service.IPartClientService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户Controller
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/system/client")
public class PartClientController extends BaseController
{
    private String prefix = "system/client";

    @Autowired
    private IPartClientService partClientService;

//    @RequiresPermissions("system:client:view")
    @GetMapping()
    public String client()
    {
        return prefix + "/client";
    }

    /**
     * 查询客户列表
     */
//    @RequiresPermissions("system:client:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PartClient partClient)
    {
        startPage();
        List<PartClient> list = partClientService.selectPartClientList(partClient);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
//    @RequiresPermissions("system:client:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PartClient partClient)
    {
        List<PartClient> list = partClientService.selectPartClientList(partClient);
        ExcelUtil<PartClient> util = new ExcelUtil<PartClient>(PartClient.class);
        return util.exportExcel(list, "客户数据");
    }

    /**
     * 新增客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
//    @RequiresPermissions("system:client:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PartClient partClient)
    {
        return toAjax(partClientService.insertPartClient(partClient));
    }

    /**
     * 修改客户
     */
//    @RequiresPermissions("system:client:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PartClient partClient = partClientService.selectPartClientById(id);
        mmap.put("partClient", partClient);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
//    @RequiresPermissions("system:client:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PartClient partClient)
    {
        return toAjax(partClientService.updatePartClient(partClient));
    }

    /**
     * 删除客户
     */
//    @RequiresPermissions("system:client:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(partClientService.deletePartClientByIds(ids));
    }
}
