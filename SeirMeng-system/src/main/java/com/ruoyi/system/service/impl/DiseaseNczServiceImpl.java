package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseNczMapper;
import com.ruoyi.system.domain.DiseaseNcz;
import com.ruoyi.system.service.IDiseaseNczService;
import com.ruoyi.common.core.text.Convert;

/**
 * 脑卒中Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Service
public class DiseaseNczServiceImpl implements IDiseaseNczService 
{
    @Autowired
    private DiseaseNczMapper diseaseNczMapper;

    /**
     * 查询脑卒中
     * 
     * @param id 脑卒中主键
     * @return 脑卒中
     */
    @Override
    public DiseaseNcz selectDiseaseNczById(Long id)
    {
        return diseaseNczMapper.selectDiseaseNczById(id);
    }

    /**
     * 查询脑卒中列表
     * 
     * @param diseaseNcz 脑卒中
     * @return 脑卒中
     */
    @Override
    public List<DiseaseNcz> selectDiseaseNczList(DiseaseNcz diseaseNcz)
    {
        return diseaseNczMapper.selectDiseaseNczList(diseaseNcz);
    }

    /**
     * 新增脑卒中
     * 
     * @param diseaseNcz 脑卒中
     * @return 结果
     */
    @Override
    public int insertDiseaseNcz(DiseaseNcz diseaseNcz)
    {
        return diseaseNczMapper.insertDiseaseNcz(diseaseNcz);
    }

    /**
     * 修改脑卒中
     * 
     * @param diseaseNcz 脑卒中
     * @return 结果
     */
    @Override
    public int updateDiseaseNcz(DiseaseNcz diseaseNcz)
    {
        return diseaseNczMapper.updateDiseaseNcz(diseaseNcz);
    }

    /**
     * 批量删除脑卒中
     * 
     * @param ids 需要删除的脑卒中主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseNczByIds(String ids)
    {
        return diseaseNczMapper.deleteDiseaseNczByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除脑卒中信息
     * 
     * @param id 脑卒中主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseNczById(Long id)
    {
        return diseaseNczMapper.deleteDiseaseNczById(id);
    }
}
