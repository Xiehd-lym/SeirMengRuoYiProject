package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.utils.StringUtils;
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
import com.ruoyi.system.domain.DiseaseXzb;
import com.ruoyi.system.service.IDiseaseXzbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 心脏性猝死Controller
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Controller
@RequestMapping("/system/xzb")
public class DiseaseXzbController extends BaseController
{
    private String prefix = "system/xzb";

    @Autowired
    private IDiseaseXzbService diseaseXzbService;

    @GetMapping()
    public String xzb()
    {
        return prefix + "/xzb";
    }

    /**
     * 查询心脏性猝死列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DiseaseXzb diseaseXzb)
    {
        startPage();
        List<DiseaseXzb> list = diseaseXzbService.selectDiseaseXzbList(diseaseXzb);
        return getDataTable(list);
    }

    /**
     * 导出心脏性猝死列表
     */
    @Log(title = "心脏性猝死", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DiseaseXzb diseaseXzb)
    {
        List<DiseaseXzb> list = diseaseXzbService.selectDiseaseXzbList(diseaseXzb);
        ExcelUtil<DiseaseXzb> util = new ExcelUtil<DiseaseXzb>(DiseaseXzb.class);
        return util.exportExcel(list, "心脏性猝死数据");
    }

    /**
     * 新增心脏性猝死
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存心脏性猝死
     */
    @Log(title = "心脏性猝死", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DiseaseXzb diseaseXzb)
    {
        String connectNumber = diseaseXzb.getConnectorPhone();
        String connectPhone = diseaseXzb.getConnectorLandline();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseXzbService.insertDiseaseXzb(diseaseXzb));
    }

    /**
     * 修改心脏性猝死
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DiseaseXzb diseaseXzb = diseaseXzbService.selectDiseaseXzbById(id);
        mmap.put("diseaseXzb", diseaseXzb);
        return prefix + "/edit";
    }

    /**
     * 修改保存心脏性猝死
     */
    @Log(title = "心脏性猝死", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DiseaseXzb diseaseXzb)
    {
        String connectNumber = diseaseXzb.getConnectorPhone();
        String connectPhone = diseaseXzb.getConnectorLandline();
        if (StringUtils.isEmpty(connectPhone)||StringUtils.isEmpty(connectPhone)){
            return AjaxResult.error("对不起 ； 联系电话(手机) 联系电话(座机) 必填其一");
        }
        return toAjax(diseaseXzbService.updateDiseaseXzb(diseaseXzb));
    }

    /**
     * 删除心脏性猝死
     */
    @Log(title = "心脏性猝死", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(diseaseXzbService.deleteDiseaseXzbByIds(ids));
    }
}
