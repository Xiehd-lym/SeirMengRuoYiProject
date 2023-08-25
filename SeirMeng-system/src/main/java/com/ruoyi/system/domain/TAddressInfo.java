package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地区编码对象 t_address_info
 * 
 * @author Xiehd
 * @date 2023-07-11
 */
public class TAddressInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 地区编码 */
    @Excel(name = "地区编码")
    private String addressCode;

    /** 地区名称 */
    @Excel(name = "地区名称")
    private String addressName;

    /** 地区全称 */
    @Excel(name = "地区全称")
    private String addressWholeName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAddressCode(String addressCode) 
    {
        this.addressCode = addressCode;
    }

    public String getAddressCode() 
    {
        return addressCode;
    }
    public void setAddressName(String addressName) 
    {
        this.addressName = addressName;
    }

    public String getAddressName() 
    {
        return addressName;
    }
    public void setAddressWholeName(String addressWholeName) 
    {
        this.addressWholeName = addressWholeName;
    }

    public String getAddressWholeName() 
    {
        return addressWholeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("addressCode", getAddressCode())
            .append("addressName", getAddressName())
            .append("addressWholeName", getAddressWholeName())
            .toString();
    }
}
