package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.system.domain.Part;
import com.ruoyi.system.domain.PartClient;
import com.ruoyi.system.service.IPartClientService;
import com.ruoyi.system.service.IPartService;
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
import com.ruoyi.system.domain.PartOrder;
import com.ruoyi.system.service.IPartOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订货Controller
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/system/order")
public class PartOrderController extends BaseController
{
    private String prefix = "system/order";

    @Autowired
    private IPartOrderService partOrderService;
    @Autowired
    private IPartService partService;
    @Autowired
    private IPartClientService partClientService;
//    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询订货列表
     */
//    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PartOrder partOrder)
    {
        startPage();
        List<PartOrder> list = partOrderService.selectPartOrderList(partOrder);
        return getDataTable(list);
    }

    /**
     * 导出订货列表
     */
//    @RequiresPermissions("system:order:export")
    @Log(title = "订货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PartOrder partOrder)
    {
        List<PartOrder> list = partOrderService.selectPartOrderList(partOrder);
        ExcelUtil<PartOrder> util = new ExcelUtil<PartOrder>(PartOrder.class);
        return util.exportExcel(list, "订货数据");
    }

    /**
     * 新增订货
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订货
     */
//    @RequiresPermissions("system:order:add")
    @Log(title = "订货", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PartOrder partOrder)
    {
        String partName = partOrder.getPartName();
        Part part = new Part();
        part.setPartName(partName);
        List<Part> parts = partService.selectPartList(part);
        if (parts.size()==0){
            return new AjaxResult(AjaxResult.Type.ERROR,"对不起，我们没有找到您输入的零件，请确定零件名称");
        }
        String partUserName = partOrder.getPartUserName();
        PartClient partClient = new PartClient();
        partClient.setClientName(partUserName);
        List<PartClient> partClients = partClientService.selectPartClientList(partClient);
        if (partClients.size()==0){
            return new AjaxResult(AjaxResult.Type.ERROR,"对不起，我们没有找到您输入的客户，请确定客户名称");
        }
        return toAjax(partOrderService.insertPartOrder(partOrder));
    }

    /**
     * 修改订货
     */
//    @RequiresPermissions("system:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PartOrder partOrder = partOrderService.selectPartOrderById(id);
        mmap.put("partOrder", partOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存订货
     */
//    @RequiresPermissions("system:order:edit")
    @Log(title = "订货", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PartOrder partOrder)
    {
        return toAjax(partOrderService.updatePartOrder(partOrder));
    }

    /**
     * 删除订货
     */
//    @RequiresPermissions("system:order:remove")
    @Log(title = "订货", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(partOrderService.deletePartOrderByIds(ids));
    }
}
