package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户对象 part_client
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public class PartClient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 用户代码 */
    @Excel(name = "用户代码")
    private String clientCode;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String clientName;

    /** 用户欠款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "用户欠款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date clientDebtTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setClientCode(String clientCode) 
    {
        this.clientCode = clientCode;
    }

    public String getClientCode() 
    {
        return clientCode;
    }
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientName() 
    {
        return clientName;
    }
    public void setClientDebtTime(Date clientDebtTime) 
    {
        this.clientDebtTime = clientDebtTime;
    }

    public Date getClientDebtTime() 
    {
        return clientDebtTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clientCode", getClientCode())
            .append("clientName", getClientName())
            .append("clientDebtTime", getClientDebtTime())
            .toString();
    }
}
