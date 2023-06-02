package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 零件对象 part
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public class Part extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 零件代码 */
    @Excel(name = "零件代码")
    private String partCode;

    /** 零件名称 */
    @Excel(name = "零件名称")
    private String partName;

    /** 零件规格 */
    @Excel(name = "零件规格")
    private String partSpecification;

    /** 零件产地 */
    @Excel(name = "零件产地")
    private String partOriginPlace;

    /** 零件生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "零件生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date partOriginTime;

    /** 零件库存量 */
    @Excel(name = "零件库存量")
    private Integer partInventory;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPartCode(String partCode) 
    {
        this.partCode = partCode;
    }

    public String getPartCode() 
    {
        return partCode;
    }
    public void setPartName(String partName) 
    {
        this.partName = partName;
    }

    public String getPartName() 
    {
        return partName;
    }
    public void setPartSpecification(String partSpecification) 
    {
        this.partSpecification = partSpecification;
    }

    public String getPartSpecification() 
    {
        return partSpecification;
    }
    public void setPartOriginPlace(String partOriginPlace) 
    {
        this.partOriginPlace = partOriginPlace;
    }

    public String getPartOriginPlace() 
    {
        return partOriginPlace;
    }
    public void setPartOriginTime(Date partOriginTime) 
    {
        this.partOriginTime = partOriginTime;
    }

    public Date getPartOriginTime() 
    {
        return partOriginTime;
    }
    public void setPartInventory(Integer partInventory) 
    {
        this.partInventory = partInventory;
    }

    public Integer getPartInventory() 
    {
        return partInventory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partCode", getPartCode())
            .append("partName", getPartName())
            .append("partSpecification", getPartSpecification())
            .append("partOriginPlace", getPartOriginPlace())
            .append("partOriginTime", getPartOriginTime())
            .append("partInventory", getPartInventory())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
