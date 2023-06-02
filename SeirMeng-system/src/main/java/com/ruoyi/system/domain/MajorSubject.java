package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 * 意向专业对象 major_subject
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public class MajorSubject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String excelUserName;

    /** 序号 */
    @Excel(name = "序号")
    private Long majorNo;

    /** 门类 */
    @Excel(name = "门类")
    private String majorClass;

    /** 专业 */
    @Excel(name = "专业")
    private String majorName;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String majorCode;

    /** 专业名称 */
    @Excel(name = "专业名称" ,color = IndexedColors.BLACK)
    private String yuanyiFlag;

    /** 是否选择为意向专业 */
    @Excel(name = "是否选择为意向专业")
    private String majorSubjectClass;

    /** 学位授予门类 */
    @Excel(name = "学位授予门类")
    private String studyYear;

    /** 修业年限 */
    @Excel(name = "修业年限")
    private String createYear;

    /** 增设年度 */
    @Excel(name = "增设年度")
    private String userName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExcelUserName(String excelUserName) 
    {
        this.excelUserName = excelUserName;
    }

    public String getExcelUserName() 
    {
        return excelUserName;
    }
    public void setMajorNo(Long majorNo) 
    {
        this.majorNo = majorNo;
    }

    public Long getMajorNo() 
    {
        return majorNo;
    }
    public void setMajorClass(String majorClass) 
    {
        this.majorClass = majorClass;
    }

    public String getMajorClass() 
    {
        return majorClass;
    }
    public void setMajorName(String majorName) 
    {
        this.majorName = majorName;
    }

    public String getMajorName() 
    {
        return majorName;
    }
    public void setMajorCode(String majorCode) 
    {
        this.majorCode = majorCode;
    }

    public String getMajorCode() 
    {
        return majorCode;
    }
    public void setYuanyiFlag(String yuanyiFlag) 
    {
        this.yuanyiFlag = yuanyiFlag;
    }

    public String getYuanyiFlag() 
    {
        return yuanyiFlag;
    }
    public void setMajorSubjectClass(String majorSubjectClass) 
    {
        this.majorSubjectClass = majorSubjectClass;
    }

    public String getMajorSubjectClass() 
    {
        return majorSubjectClass;
    }
    public void setStudyYear(String studyYear) 
    {
        this.studyYear = studyYear;
    }

    public String getStudyYear() 
    {
        return studyYear;
    }
    public void setCreateYear(String createYear) 
    {
        this.createYear = createYear;
    }

    public String getCreateYear() 
    {
        return createYear;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("excelUserName", getExcelUserName())
            .append("majorNo", getMajorNo())
            .append("majorClass", getMajorClass())
            .append("majorName", getMajorName())
            .append("majorCode", getMajorCode())
            .append("yuanyiFlag", getYuanyiFlag())
            .append("majorSubjectClass", getMajorSubjectClass())
            .append("studyYear", getStudyYear())
            .append("createYear", getCreateYear())
            .append("userName", getUserName())
            .toString();
    }
}
