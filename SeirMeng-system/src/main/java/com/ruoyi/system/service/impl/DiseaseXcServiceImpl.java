package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseXcMapper;
import com.ruoyi.system.domain.DiseaseXc;
import com.ruoyi.system.service.IDiseaseXcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 哮喘Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Service
public class DiseaseXcServiceImpl implements IDiseaseXcService 
{
    @Autowired
    private DiseaseXcMapper diseaseXcMapper;

    /**
     * 查询哮喘
     * 
     * @param id 哮喘主键
     * @return 哮喘
     */
    @Override
    public DiseaseXc selectDiseaseXcById(Long id)
    {
        return diseaseXcMapper.selectDiseaseXcById(id);
    }

    /**
     * 查询哮喘列表
     * 
     * @param diseaseXc 哮喘
     * @return 哮喘
     */
    @Override
    public List<DiseaseXc> selectDiseaseXcList(DiseaseXc diseaseXc)
    {
        return diseaseXcMapper.selectDiseaseXcList(diseaseXc);
    }

    /**
     * 新增哮喘
     * 
     * @param diseaseXc 哮喘
     * @return 结果
     */
    @Override
    public int insertDiseaseXc(DiseaseXc diseaseXc)
    {
        return diseaseXcMapper.insertDiseaseXc(diseaseXc);
    }

    /**
     * 修改哮喘
     * 
     * @param diseaseXc 哮喘
     * @return 结果
     */
    @Override
    public int updateDiseaseXc(DiseaseXc diseaseXc)
    {
        return diseaseXcMapper.updateDiseaseXc(diseaseXc);
    }

    /**
     * 批量删除哮喘
     * 
     * @param ids 需要删除的哮喘主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseXcByIds(String ids)
    {
        return diseaseXcMapper.deleteDiseaseXcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除哮喘信息
     * 
     * @param id 哮喘主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseXcById(Long id)
    {
        return diseaseXcMapper.deleteDiseaseXcById(id);
    }
}
