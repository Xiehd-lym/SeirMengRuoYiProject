package com.ruoyi.system.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.ruoyi.common.utils.IDCardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseMzfMapper;
import com.ruoyi.system.domain.DiseaseMzf;
import com.ruoyi.system.service.IDiseaseMzfService;
import com.ruoyi.common.core.text.Convert;

/**
 * 慢阻肺Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Service
public class DiseaseMzfServiceImpl implements IDiseaseMzfService 
{
    @Autowired
    private DiseaseMzfMapper diseaseMzfMapper;

    /**
     * 查询慢阻肺
     * 
     * @param id 慢阻肺主键
     * @return 慢阻肺
     */
    @Override
    public DiseaseMzf selectDiseaseMzfById(Long id)
    {
        return diseaseMzfMapper.selectDiseaseMzfById(id);
    }

    /**
     * 查询慢阻肺列表
     * 
     * @param diseaseMzf 慢阻肺
     * @return 慢阻肺
     */
    @Override
    public List<DiseaseMzf> selectDiseaseMzfList(DiseaseMzf diseaseMzf)
    {
        return diseaseMzfMapper.selectDiseaseMzfList(diseaseMzf);
    }

    /**
     * 新增慢阻肺
     * 
     * @param diseaseMzf 慢阻肺
     * @return 结果
     */
    @Override
    public int insertDiseaseMzf(DiseaseMzf diseaseMzf)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseMzf.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseMzf.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseMzf.setGenerate(IDCardUtil.getSex(diseaseMzf.getCardNo()));

        diseaseMzf.setHujiAddress(diseaseMzf.getChangzhuAddress());
        diseaseMzf.setHujiAddressCode(diseaseMzf.getChangzhuAddressCode());
        diseaseMzf.setHujiAddressType(diseaseMzf.getChangzhuAddress());
        
        return diseaseMzfMapper.insertDiseaseMzf(diseaseMzf);
    }

    /**
     * 修改慢阻肺
     * 
     * @param diseaseMzf 慢阻肺
     * @return 结果
     */
    @Override
    public int updateDiseaseMzf(DiseaseMzf diseaseMzf)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseMzf.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseMzf.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseMzf.setGenerate(IDCardUtil.getSex(diseaseMzf.getCardNo()));

        diseaseMzf.setHujiAddress(diseaseMzf.getChangzhuAddress());
        diseaseMzf.setHujiAddressCode(diseaseMzf.getChangzhuAddressCode());
        diseaseMzf.setHujiAddressType(diseaseMzf.getChangzhuAddress());
        
        return diseaseMzfMapper.updateDiseaseMzf(diseaseMzf);
    }

    /**
     * 批量删除慢阻肺
     * 
     * @param ids 需要删除的慢阻肺主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseMzfByIds(String ids)
    {
        return diseaseMzfMapper.deleteDiseaseMzfByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除慢阻肺信息
     * 
     * @param id 慢阻肺主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseMzfById(Long id)
    {
        return diseaseMzfMapper.deleteDiseaseMzfById(id);
    }
}
