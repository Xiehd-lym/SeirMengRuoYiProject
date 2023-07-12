package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TAddressInfo;

/**
 * 地区编码Mapper接口
 * 
 * @author Xiehd
 * @date 2023-07-11
 */
public interface TAddressInfoMapper 
{
    /**
     * 查询地区编码
     * 
     * @param id 地区编码主键
     * @return 地区编码
     */
    public TAddressInfo selectTAddressInfoById(Long id);

    /**
     * 查询地区编码列表
     * 
     * @param tAddressInfo 地区编码
     * @return 地区编码集合
     */
    public List<TAddressInfo> selectTAddressInfoList(TAddressInfo tAddressInfo);

    /**
     * 新增地区编码
     * 
     * @param tAddressInfo 地区编码
     * @return 结果
     */
    public int insertTAddressInfo(TAddressInfo tAddressInfo);

    /**
     * 修改地区编码
     * 
     * @param tAddressInfo 地区编码
     * @return 结果
     */
    public int updateTAddressInfo(TAddressInfo tAddressInfo);

    /**
     * 删除地区编码
     * 
     * @param id 地区编码主键
     * @return 结果
     */
    public int deleteTAddressInfoById(Long id);

    /**
     * 批量删除地区编码
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTAddressInfoByIds(String[] ids);
}
