package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DiseaseXc;
import com.ruoyi.system.service.IDiseaseXcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 哮喘Controller
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Controller
@RequestMapping("/system/xc")
public class DiseaseXcController extends BaseController
{
    private String prefix = "system/xc";

    @Autowired
    private IDiseaseXcService diseaseXcService;


    @GetMapping()
    public String xc()
    {
        return prefix + "/xc";
    }

    /**
     * 查询哮喘列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseXc diseaseXc)
    {
        startPage();
        List<DiseaseXc> list = diseaseXcService.selectDiseaseXcList(diseaseXc);
        return getDataTable(list);
    }

    /**
     * 导出哮喘列表
     */

    @Log(title = "哮喘", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseXc diseaseXc)
    {
        List<DiseaseXc> list = diseaseXcService.selectDiseaseXcList(diseaseXc);
        ExcelUtil<DiseaseXc> util = new ExcelUtil<DiseaseXc>(DiseaseXc.class);
        return util.exportExcel(list, "哮喘数据");
    }

    /**
     * 新增哮喘
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存哮喘
     */

    @Log(title = "哮喘", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseXc diseaseXc)
    {
        String connectNumber = diseaseXc.getConnectNumber();
        String connectPhone = diseaseXc.getConnectPhone();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseXcService.insertDiseaseXc(diseaseXc));
    }

    /**
     * 修改哮喘
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseXc diseaseXc = diseaseXcService.selectDiseaseXcById(id);
        mmap.put("diseaseXc", diseaseXc);
        return prefix + "/edit";
    }

    /**
     * 修改保存哮喘
     */

    @Log(title = "哮喘", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseXc diseaseXc)
    {
        String connectNumber = diseaseXc.getConnectNumber();
        String connectPhone = diseaseXc.getConnectPhone();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseXcService.updateDiseaseXc(diseaseXc));
    }

    /**
     * 删除哮喘
     */

    @Log(title = "哮喘", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseXcService.deleteDiseaseXcByIds(ids));
    }
}
