package com.ruoyi.system.service.impl;

import java.util.Date;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.Part;
import com.ruoyi.system.domain.PartClient;
import com.ruoyi.system.mapper.PartClientMapper;
import com.ruoyi.system.mapper.PartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PartOrderMapper;
import com.ruoyi.system.domain.PartOrder;
import com.ruoyi.system.service.IPartOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订货Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Service
public class PartOrderServiceImpl implements IPartOrderService 
{
    @Autowired
    private PartOrderMapper partOrderMapper;
    @Autowired
    private PartClientMapper partClientMapper;
    @Autowired
    private PartMapper partMapper;
    /**
     * 查询订货
     * 
     * @param id 订货主键
     * @return 订货
     */
    @Override
    public PartOrder selectPartOrderById(Long id)
    {
        return partOrderMapper.selectPartOrderById(id);
    }

    /**
     * 查询订货列表
     * 
     * @param partOrder 订货
     * @return 订货
     */
    @Override
    public List<PartOrder> selectPartOrderList(PartOrder partOrder)
    {
        List<PartOrder> partOrders = partOrderMapper.selectPartOrderList(partOrder);
        for (PartOrder order : partOrders) {

            // 需求量
            Integer demandNum = order.getDemandNum();
            PartClient partClient = new PartClient();
            partClient.setClientName(order.getPartUserName());
            // 欠款时间
            Date clientDebtTime = partClientMapper.selectPartClientList(partClient).get(0).getClientDebtTime();
            Part part = new Part();
            part.setPartName(partOrder.getPartName());
            // 零件库存量
            Integer partInventory = partMapper.selectPartList(part).get(0).getPartInventory();
            // 当前日期
            Date nowDate = DateUtils.getNowDate();

            int i = DateUtils.differentDaysByMillisecond(clientDebtTime, nowDate);
            if (i<=30){
                if (demandNum>partInventory){
                    order.setOrderShouldWay("先按库存量发货，进货后再补发");
                }else {
                    order.setOrderShouldWay("立即发货");
                }
            }else if (i>30 && i<=100){
                if (demandNum>partInventory){
                    order.setOrderShouldWay("不发货");
                }else {
                    order.setOrderShouldWay("先付款再发货");
                }
            }else if (i>100){
                order.setOrderShouldWay("要求先付款");
            }else {
                order.setOrderShouldWay("未知情况");
            }
        }
        return partOrders;
    }

    /**
     * 新增订货
     * 
     * @param partOrder 订货
     * @return 结果
     */
    @Override
    public int insertPartOrder(PartOrder partOrder)
    {
        partOrder.setCreateTime(DateUtils.getNowDate());
        return partOrderMapper.insertPartOrder(partOrder);
    }

    /**
     * 修改订货
     * 
     * @param partOrder 订货
     * @return 结果
     */
    @Override
    public int updatePartOrder(PartOrder partOrder)
    {
        return partOrderMapper.updatePartOrder(partOrder);
    }

    /**
     * 批量删除订货
     * 
     * @param ids 需要删除的订货主键
     * @return 结果
     */
    @Override
    public int deletePartOrderByIds(String ids)
    {
        return partOrderMapper.deletePartOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订货信息
     * 
     * @param id 订货主键
     * @return 结果
     */
    @Override
    public int deletePartOrderById(Long id)
    {
        return partOrderMapper.deletePartOrderById(id);
    }
}
