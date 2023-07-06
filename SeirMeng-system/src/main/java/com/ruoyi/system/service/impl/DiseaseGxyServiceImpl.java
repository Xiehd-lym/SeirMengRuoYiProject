package com.ruoyi.system.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.ruoyi.common.utils.IDCardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseGxyMapper;
import com.ruoyi.system.domain.DiseaseGxy;
import com.ruoyi.system.service.IDiseaseGxyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 高血压Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-04
 */
@Service
public class DiseaseGxyServiceImpl implements IDiseaseGxyService 
{
    @Autowired
    private DiseaseGxyMapper diseaseGxyMapper;

    /**
     * 查询高血压
     * 
     * @param id 高血压主键
     * @return 高血压
     */
    @Override
    public DiseaseGxy selectDiseaseGxyById(Long id)
    {
        return diseaseGxyMapper.selectDiseaseGxyById(id);
    }

    /**
     * 查询高血压列表
     * 
     * @param diseaseGxy 高血压
     * @return 高血压
     */
    @Override
    public List<DiseaseGxy> selectDiseaseGxyList(DiseaseGxy diseaseGxy)
    {
        return diseaseGxyMapper.selectDiseaseGxyList(diseaseGxy);
    }

    /**
     * 新增高血压
     * 
     * @param diseaseGxy 高血压
     * @return 结果
     */
    @Override
    public int insertDiseaseGxy(DiseaseGxy diseaseGxy)
    {

        String birthday = IDCardUtil.getBirthday(diseaseGxy.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseGxy.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseGxy.setGenerate(IDCardUtil.getSex(diseaseGxy.getCardNo()));

        return diseaseGxyMapper.insertDiseaseGxy(diseaseGxy);
    }

    /**
     * 修改高血压
     * 
     * @param diseaseGxy 高血压
     * @return 结果
     */
    @Override
    public int updateDiseaseGxy(DiseaseGxy diseaseGxy)
    {

        String birthday = IDCardUtil.getBirthday(diseaseGxy.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseGxy.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseGxy.setGenerate(IDCardUtil.getSex(diseaseGxy.getCardNo()));
        return diseaseGxyMapper.updateDiseaseGxy(diseaseGxy);
    }

    /**
     * 批量删除高血压
     * 
     * @param ids 需要删除的高血压主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseGxyByIds(String ids)
    {
        return diseaseGxyMapper.deleteDiseaseGxyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高血压信息
     * 
     * @param id 高血压主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseGxyById(Long id)
    {
        return diseaseGxyMapper.deleteDiseaseGxyById(id);
    }
}
