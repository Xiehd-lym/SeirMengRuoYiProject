package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PartOrder;

/**
 * 订货Service接口
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public interface IPartOrderService 
{
    /**
     * 查询订货
     * 
     * @param id 订货主键
     * @return 订货
     */
    public PartOrder selectPartOrderById(Long id);

    /**
     * 查询订货列表
     * 
     * @param partOrder 订货
     * @return 订货集合
     */
    public List<PartOrder> selectPartOrderList(PartOrder partOrder);

    /**
     * 新增订货
     * 
     * @param partOrder 订货
     * @return 结果
     */
    public int insertPartOrder(PartOrder partOrder);

    /**
     * 修改订货
     * 
     * @param partOrder 订货
     * @return 结果
     */
    public int updatePartOrder(PartOrder partOrder);

    /**
     * 批量删除订货
     * 
     * @param ids 需要删除的订货主键集合
     * @return 结果
     */
    public int deletePartOrderByIds(String ids);

    /**
     * 删除订货信息
     * 
     * @param id 订货主键
     * @return 结果
     */
    public int deletePartOrderById(Long id);
}
