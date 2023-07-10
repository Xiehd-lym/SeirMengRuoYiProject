package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TAddressInfoMapper;
import com.ruoyi.system.domain.TAddressInfo;
import com.ruoyi.system.service.ITAddressInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 地区编码Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-11
 */
@Service
public class TAddressInfoServiceImpl implements ITAddressInfoService 
{
    @Autowired
    private TAddressInfoMapper tAddressInfoMapper;

    /**
     * 查询地区编码
     * 
     * @param id 地区编码主键
     * @return 地区编码
     */
    @Override
    public TAddressInfo selectTAddressInfoById(Long id)
    {
        return tAddressInfoMapper.selectTAddressInfoById(id);
    }

    /**
     * 查询地区编码列表
     * 
     * @param tAddressInfo 地区编码
     * @return 地区编码
     */
    @Override
    public List<TAddressInfo> selectTAddressInfoList(TAddressInfo tAddressInfo)
    {
        return tAddressInfoMapper.selectTAddressInfoList(tAddressInfo);
    }

    /**
     * 新增地区编码
     * 
     * @param tAddressInfo 地区编码
     * @return 结果
     */
    @Override
    public int insertTAddressInfo(TAddressInfo tAddressInfo)
    {
        return tAddressInfoMapper.insertTAddressInfo(tAddressInfo);
    }

    /**
     * 修改地区编码
     * 
     * @param tAddressInfo 地区编码
     * @return 结果
     */
    @Override
    public int updateTAddressInfo(TAddressInfo tAddressInfo)
    {
        return tAddressInfoMapper.updateTAddressInfo(tAddressInfo);
    }

    /**
     * 批量删除地区编码
     * 
     * @param ids 需要删除的地区编码主键
     * @return 结果
     */
    @Override
    public int deleteTAddressInfoByIds(String ids)
    {
        return tAddressInfoMapper.deleteTAddressInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除地区编码信息
     * 
     * @param id 地区编码主键
     * @return 结果
     */
    @Override
    public int deleteTAddressInfoById(Long id)
    {
        return tAddressInfoMapper.deleteTAddressInfoById(id);
    }
}
