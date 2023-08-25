package com.ruoyi.system.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.ruoyi.common.utils.IDCardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseMxzqgyMapper;
import com.ruoyi.system.domain.DiseaseMxzqgy;
import com.ruoyi.system.service.IDiseaseMxzqgyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 慢性支气管炎Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Service
public class DiseaseMxzqgyServiceImpl implements IDiseaseMxzqgyService 
{
    @Autowired
    private DiseaseMxzqgyMapper diseaseMxzqgyMapper;

    /**
     * 查询慢性支气管炎
     * 
     * @param id 慢性支气管炎主键
     * @return 慢性支气管炎
     */
    @Override
    public DiseaseMxzqgy selectDiseaseMxzqgyById(Long id)
    {
        return diseaseMxzqgyMapper.selectDiseaseMxzqgyById(id);
    }

    /**
     * 查询慢性支气管炎列表
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 慢性支气管炎
     */
    @Override
    public List<DiseaseMxzqgy> selectDiseaseMxzqgyList(DiseaseMxzqgy diseaseMxzqgy)
    {
        return diseaseMxzqgyMapper.selectDiseaseMxzqgyList(diseaseMxzqgy);
    }

    /**
     * 新增慢性支气管炎
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 结果
     */
    @Override
    public int insertDiseaseMxzqgy(DiseaseMxzqgy diseaseMxzqgy)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseMxzqgy.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseMxzqgy.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseMxzqgy.setGenerate(IDCardUtil.getSex(diseaseMxzqgy.getCardNo()));

        diseaseMxzqgy.setHujiAddress(diseaseMxzqgy.getChangzhuDetail());
        diseaseMxzqgy.setHujiAddressCode(diseaseMxzqgy.getChangzhuAddressCode());
        diseaseMxzqgy.setHujiAddressType(diseaseMxzqgy.getChangzhuAddress());
        
        return diseaseMxzqgyMapper.insertDiseaseMxzqgy(diseaseMxzqgy);
    }

    /**
     * 修改慢性支气管炎
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 结果
     */
    @Override
    public int updateDiseaseMxzqgy(DiseaseMxzqgy diseaseMxzqgy)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseMxzqgy.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseMxzqgy.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseMxzqgy.setGenerate(IDCardUtil.getSex(diseaseMxzqgy.getCardNo()));

        diseaseMxzqgy.setHujiAddress(diseaseMxzqgy.getChangzhuAddress());
        diseaseMxzqgy.setHujiAddressCode(diseaseMxzqgy.getChangzhuAddressCode());
        diseaseMxzqgy.setHujiAddressType(diseaseMxzqgy.getChangzhuAddress());
        
        return diseaseMxzqgyMapper.updateDiseaseMxzqgy(diseaseMxzqgy);
    }

    /**
     * 批量删除慢性支气管炎
     * 
     * @param ids 需要删除的慢性支气管炎主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseMxzqgyByIds(String ids)
    {
        return diseaseMxzqgyMapper.deleteDiseaseMxzqgyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除慢性支气管炎信息
     * 
     * @param id 慢性支气管炎主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseMxzqgyById(Long id)
    {
        return diseaseMxzqgyMapper.deleteDiseaseMxzqgyById(id);
    }
}
