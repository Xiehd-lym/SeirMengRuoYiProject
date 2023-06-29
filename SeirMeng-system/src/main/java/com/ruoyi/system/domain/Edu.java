package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 学生成绩对象 edu
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public class Edu extends BaseEntity
{
    private static final Long serialVersionUID = 1L;

    /**  */
    private BigDecimal id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年级 */
    @Excel(name = "年级")
    private String eduGrage;

    /** 班级 */
    @Excel(name = "班级")
    private String eduClazz;

    /** 考试科目 */
    @Excel(name = "考试科目")
    private String eduSubject;

    /** 性别 */
    @Excel(name = "性别")
    private String eduGenerate;

    /** 是否肄业 */
    @Excel(name = "是否肄业")
    private String eduStudyFlag;

    /** 客观题得分 */
    @Excel(name = "客观题得分")
    private BigDecimal eduKeguanti;

    /** 判断题得分 */
    @Excel(name = "判断题得分")
    private BigDecimal eduPduan;

    /** 主观题得分 */
    @Excel(name = "主观题得分")
    private BigDecimal eduZhuguan;

    /** 加分题得分 */
    @Excel(name = "加分题得分")
    private BigDecimal eduJiafenti;

    /** 总分 */
    @Excel(name = "总分")
    private BigDecimal eduZongfen;

    public void setEduZongfen(BigDecimal eduZongfen)
    {
        this.eduZongfen = eduZongfen;
    }

    public BigDecimal getEduZongfen()
    {
        return eduZongfen;
    }

    public void setId(BigDecimal id) 
    {
        this.id = id;
    }

    public BigDecimal getId() 
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
    public void setEduGrage(String eduGrage) 
    {
        this.eduGrage = eduGrage;
    }

    public String getEduGrage() 
    {
        return eduGrage;
    }
    public void setEduClazz(String eduClazz) 
    {
        this.eduClazz = eduClazz;
    }

    public String getEduClazz() 
    {
        return eduClazz;
    }
    public void setEduSubject(String eduSubject) 
    {
        this.eduSubject = eduSubject;
    }

    public String getEduSubject() 
    {
        return eduSubject;
    }
    public void setEduGenerate(String eduGenerate) 
    {
        this.eduGenerate = eduGenerate;
    }

    public String getEduGenerate() 
    {
        return eduGenerate;
    }
    public void setEduStudyFlag(String eduStudyFlag) 
    {
        this.eduStudyFlag = eduStudyFlag;
    }

    public String getEduStudyFlag() 
    {
        return eduStudyFlag;
    }
    public void setEduKeguanti(BigDecimal eduKeguanti) 
    {
        this.eduKeguanti = eduKeguanti;
    }

    public BigDecimal getEduKeguanti() 
    {
        return eduKeguanti;
    }
    public void setEduPduan(BigDecimal eduPduan) 
    {
        this.eduPduan = eduPduan;
    }

    public BigDecimal getEduPduan() 
    {
        return eduPduan;
    }
    public void setEduZhuguan(BigDecimal eduZhuguan) 
    {
        this.eduZhuguan = eduZhuguan;
    }

    public BigDecimal getEduZhuguan() 
    {
        return eduZhuguan;
    }
    public void setEduJiafenti(BigDecimal eduJiafenti) 
    {
        this.eduJiafenti = eduJiafenti;
    }

    public BigDecimal getEduJiafenti() 
    {
        return eduJiafenti;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("eduGrage", getEduGrage())
            .append("eduClazz", getEduClazz())
            .append("eduSubject", getEduSubject())
            .append("eduGenerate", getEduGenerate())
            .append("eduStudyFlag", getEduStudyFlag())
            .append("eduKeguanti", getEduKeguanti())
            .append("eduPduan", getEduPduan())
            .append("eduZhuguan", getEduZhuguan())
            .append("eduJiafenti", getEduJiafenti())
            .toString();
    }
}
