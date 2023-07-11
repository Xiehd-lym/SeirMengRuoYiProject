package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseMzf;
import com.ruoyi.system.service.IDiseaseMzfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 慢阻肺Controller
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Controller
@RequestMapping("/system/mzf")
public class DiseaseMzfController extends BaseController
{
    private String prefix = "system/mzf";

    @Autowired
    private IDiseaseMzfService diseaseMzfService;


    @GetMapping()
    public String mzf()
    {
        return prefix + "/mzf";
    }

    /**
     * 查询慢阻肺列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseMzf diseaseMzf)
    {
        startPage();
        List<DiseaseMzf> list = diseaseMzfService.selectDiseaseMzfList(diseaseMzf);
        return getDataTable(list);
    }

    /**
     * 导出慢阻肺列表
     */

    @Log(title = "慢阻肺", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseMzf diseaseMzf)
    {
        List<DiseaseMzf> list = diseaseMzfService.selectDiseaseMzfList(diseaseMzf);
        ExcelUtil<DiseaseMzf> util = new ExcelUtil<DiseaseMzf>(DiseaseMzf.class);
        return util.exportExcel(list, "慢阻肺数据");
    }

    /**
     * 新增慢阻肺
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存慢阻肺
     */

    @Log(title = "慢阻肺", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseMzf diseaseMzf)
    {
        String connectNumber = diseaseMzf.getConnectNumber();
        String connectPhone = diseaseMzf.getConnectPhone();
        if (StringUtils.isBlank(connectPhone) && StringUtils.isBlank(connectNumber)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseMzfService.insertDiseaseMzf(diseaseMzf));
    }

    /**
     * 修改慢阻肺
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseMzf diseaseMzf = diseaseMzfService.selectDiseaseMzfById(id);
        mmap.put("diseaseMzf", diseaseMzf);
        return prefix + "/edit";
    }

    /**
     * 修改保存慢阻肺
     */

    @Log(title = "慢阻肺", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseMzf diseaseMzf)
    {
        String connectNumber = diseaseMzf.getConnectNumber();
        String connectPhone = diseaseMzf.getConnectPhone();
        if (StringUtils.isBlank(connectPhone) && StringUtils.isBlank(connectNumber)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseMzfService.updateDiseaseMzf(diseaseMzf));
    }

    /**
     * 删除慢阻肺
     */

    @Log(title = "慢阻肺", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseMzfService.deleteDiseaseMzfByIds(ids));
    }
}
