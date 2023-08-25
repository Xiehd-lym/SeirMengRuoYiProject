package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseFqz;
import com.ruoyi.system.service.IDiseaseFqzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 肺气肿Controller
 * 
 * @author Xiehd
 * @date 2023-07-03
 */
@Controller
@RequestMapping("/system/fqz")
public class DiseaseFqzController extends BaseController
{
    private String prefix = "system/fqz";

    @Autowired
    private IDiseaseFqzService diseaseFqzService;

    @GetMapping()
    public String fqz()
    {
        return prefix + "/fqz";
    }

    /**
     * 查询肺气肿列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseFqz diseaseFqz)
    {
        startPage();
        List<DiseaseFqz> list = diseaseFqzService.selectDiseaseFqzList(diseaseFqz);
        return getDataTable(list);
    }

    /**
     * 导出肺气肿列表
     */
    @Log(title = "肺气肿", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseFqz diseaseFqz)
    {
        List<DiseaseFqz> list = diseaseFqzService.selectDiseaseFqzList(diseaseFqz);
        ExcelUtil<DiseaseFqz> util = new ExcelUtil<DiseaseFqz>(DiseaseFqz.class);
        return util.exportExcel(list, "肺气肿数据");
    }

    /**
     * 新增肺气肿
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存肺气肿
     */
    @Log(title = "肺气肿", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseFqz diseaseFqz)
    {

        return toAjax(diseaseFqzService.insertDiseaseFqz(diseaseFqz));
    }

    /**
     * 修改肺气肿
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseFqz diseaseFqz = diseaseFqzService.selectDiseaseFqzById(id);
        mmap.put("diseaseFqz", diseaseFqz);
        return prefix + "/edit";
    }

    /**
     * 修改保存肺气肿
     */
    @Log(title = "肺气肿", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseFqz diseaseFqz)
    {
        String connectNumber = diseaseFqz.getConnectNumber();
        String connectPhone = diseaseFqz.getConnectPhone();
        if (StringUtils.isBlank(connectPhone) && StringUtils.isBlank(connectNumber)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseFqzService.updateDiseaseFqz(diseaseFqz));
    }

    /**
     * 删除肺气肿
     */
    @Log(title = "肺气肿", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseFqzService.deleteDiseaseFqzByIds(ids));
    }
}
