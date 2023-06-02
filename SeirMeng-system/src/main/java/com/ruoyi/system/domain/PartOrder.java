package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订货对象 part_order
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public class PartOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String partUserName;

    /** 零件名称 */
    @Excel(name = "零件名称")
    private String partName;

    /** 需求量 */
    @Excel(name = "需求量")
    private Integer demandNum;

    /** 订单日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 付款日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 应采取的行动 */
    @Excel(name = "应采取的行动")
    private String orderShouldWay;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPartUserName(String partUserName) 
    {
        this.partUserName = partUserName;
    }

    public String getPartUserName() 
    {
        return partUserName;
    }
    public void setPartName(String partName) 
    {
        this.partName = partName;
    }

    public String getPartName() 
    {
        return partName;
    }
    public void setDemandNum(Integer demandNum)
    {
        this.demandNum = demandNum;
    }

    public Integer getDemandNum()
    {
        return demandNum;
    }
    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setOrderShouldWay(String orderShouldWay) 
    {
        this.orderShouldWay = orderShouldWay;
    }

    public String getOrderShouldWay() 
    {
        return orderShouldWay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partUserName", getPartUserName())
            .append("partName", getPartName())
            .append("demandNum", getDemandNum())
            .append("orderTime", getOrderTime())
            .append("payTime", getPayTime())
            .append("createTime", getCreateTime())
            .append("orderShouldWay", getOrderShouldWay())
            .toString();
    }
}
