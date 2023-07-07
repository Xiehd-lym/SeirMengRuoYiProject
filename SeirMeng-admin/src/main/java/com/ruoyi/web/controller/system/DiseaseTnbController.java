package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.utils.StringUtils;
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
import com.ruoyi.system.domain.DiseaseTnb;
import com.ruoyi.system.service.IDiseaseTnbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 糖尿病Controller
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Controller
@RequestMapping("/system/tnb")
public class DiseaseTnbController extends BaseController
{
    private String prefix = "system/tnb";

    @Autowired
    private IDiseaseTnbService diseaseTnbService;


    @GetMapping()
    public String tnb()
    {
        return prefix + "/tnb";
    }

    /**
     * 查询糖尿病列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseTnb diseaseTnb)
    {
        startPage();
        List<DiseaseTnb> list = diseaseTnbService.selectDiseaseTnbList(diseaseTnb);
        return getDataTable(list);
    }

    /**
     * 导出糖尿病列表
     */

    @Log(title = "糖尿病", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseTnb diseaseTnb)
    {
        List<DiseaseTnb> list = diseaseTnbService.selectDiseaseTnbList(diseaseTnb);
        ExcelUtil<DiseaseTnb> util = new ExcelUtil<DiseaseTnb>(DiseaseTnb.class);
        return util.exportExcel(list, "糖尿病数据");
    }

    /**
     * 新增糖尿病
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存糖尿病
     */

    @Log(title = "糖尿病", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseTnb diseaseTnb)
    {
        String connectNumber = diseaseTnb.getConnectNumber();
        String connectPhone = diseaseTnb.getConnectPhone();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseTnbService.insertDiseaseTnb(diseaseTnb));
    }

    /**
     * 修改糖尿病
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseTnb diseaseTnb = diseaseTnbService.selectDiseaseTnbById(id);
        mmap.put("diseaseTnb", diseaseTnb);
        return prefix + "/edit";
    }

    /**
     * 修改保存糖尿病
     */

    @Log(title = "糖尿病", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseTnb diseaseTnb)
    {
        String connectNumber = diseaseTnb.getConnectNumber();
        String connectPhone = diseaseTnb.getConnectPhone();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseTnbService.updateDiseaseTnb(diseaseTnb));
    }

    /**
     * 删除糖尿病
     */

    @Log(title = "糖尿病", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseTnbService.deleteDiseaseTnbByIds(ids));
    }
}
