package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工资对象 wages
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public class Wages extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 工号 */
    @Excel(name = "工号")
    private String workId;

    /** 性别 */
    @Excel(name = "性别")
    private String genera;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workSDay;

    /** 是否在职 */
    @Excel(name = "是否在职")
    private String workFlag;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal jibenMoney;

    /** 考勤 */
    @Excel(name = "考勤")
    private Integer kaoqing;

    /** 补助 */
    @Excel(name = "补助")
    private BigDecimal buzhu;

    /** 扣款 */
    @Excel(name = "扣款")
    private BigDecimal koukuan;

    /** 五险一金 */
    @Excel(name = "五险一金")
    private BigDecimal wxyj;

    /** 个税 */
    @Excel(name = "个税")
    private BigDecimal geshui;

    /** 实发 */
    @Excel(name = "实发")
    private BigDecimal shifa;

    /** 结算时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结算时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date moneyDay;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setWorkId(String workId) 
    {
        this.workId = workId;
    }

    public String getWorkId() 
    {
        return workId;
    }
    public void setGenera(String genera) 
    {
        this.genera = genera;
    }

    public String getGenera() 
    {
        return genera;
    }
    public void setWorkSDay(Date workSDay) 
    {
        this.workSDay = workSDay;
    }

    public Date getWorkSDay() 
    {
        return workSDay;
    }
    public void setWorkFlag(String workFlag) 
    {
        this.workFlag = workFlag;
    }

    public String getWorkFlag() 
    {
        return workFlag;
    }
    public void setJibenMoney(BigDecimal jibenMoney) 
    {
        this.jibenMoney = jibenMoney;
    }

    public BigDecimal getJibenMoney() 
    {
        return jibenMoney;
    }
    public void setKaoqing(Integer kaoqing) 
    {
        this.kaoqing = kaoqing;
    }

    public Integer getKaoqing() 
    {
        return kaoqing;
    }
    public void setBuzhu(BigDecimal buzhu) 
    {
        this.buzhu = buzhu;
    }

    public BigDecimal getBuzhu() 
    {
        return buzhu;
    }
    public void setKoukuan(BigDecimal koukuan) 
    {
        this.koukuan = koukuan;
    }

    public BigDecimal getKoukuan() 
    {
        return koukuan;
    }
    public void setWxyj(BigDecimal wxyj) 
    {
        this.wxyj = wxyj;
    }

    public BigDecimal getWxyj() 
    {
        return wxyj;
    }
    public void setGeshui(BigDecimal geshui) 
    {
        this.geshui = geshui;
    }

    public BigDecimal getGeshui() 
    {
        return geshui;
    }
    public void setShifa(BigDecimal shifa) 
    {
        this.shifa = shifa;
    }

    public BigDecimal getShifa() 
    {
        return shifa;
    }
    public void setMoneyDay(Date moneyDay) 
    {
        this.moneyDay = moneyDay;
    }

    public Date getMoneyDay() 
    {
        return moneyDay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .append("workId", getWorkId())
            .append("genera", getGenera())
            .append("workSDay", getWorkSDay())
            .append("workFlag", getWorkFlag())
            .append("jibenMoney", getJibenMoney())
            .append("kaoqing", getKaoqing())
            .append("buzhu", getBuzhu())
            .append("koukuan", getKoukuan())
            .append("wxyj", getWxyj())
            .append("geshui", getGeshui())
            .append("shifa", getShifa())
            .append("moneyDay", getMoneyDay())
            .toString();
    }
}
