package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 慢性支气管炎对象 disease_mxzqgy
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public class DiseaseMxzqgy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String generate;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证件类型 */
    @Excel(name = "身份证件类型")
    private String cardType;

    /** 身份证件号 */
    @Excel(name = "身份证件号")
    private String cardNo;

    /** 民族 */
    @Excel(name = "民族")
    private String mingzu;

    /** 学历 */
    @Excel(name = "学历")
    private String edu;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String merry;

    /** 职业类型 */
    @Excel(name = "职业类型")
    private String workType;

    /** 联系电话(手机) */
    @Excel(name = "联系电话(手机)")
    private String connectPhone;

    /** 联系电话(座机) */
    @Excel(name = "联系电话(座机)")
    private String connectNumber;

    /** 常住址类型 */
    @Excel(name = "常住址类型")
    private String changzhuAddress;

    /** 常住址(编码) */
    @Excel(name = "常住址(编码)")
    private String changzhuAddressCode;

    /** 常住详细地址 */
    @Excel(name = "常住详细地址")
    private String changzhuDetail;

    /** 户籍地址类型 */
    @Excel(name = "户籍地址类型")
    private String hujiAddressType;

    /** 户籍地址(编码) */
    @Excel(name = "户籍地址(编码)")
    private String hujiAddressCode;

    /** 户籍详细地址 */
    @Excel(name = "户籍详细地址")
    private String hujiAddress;

    /** 疾病icd */
    @Excel(name = "疾病icd")
    private String icd;

    /** 诊断日期（确诊时间） */
    @Excel(name = "诊断日期（确诊时间）", dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date zhengduanshijian;

    /** 病情转归 */
    @Excel(name = "病情转归")
    private String guizhuan;

    /** 死亡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "死亡日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deadDate;

    /** 死亡原因 */
    @Excel(name = "死亡原因")
    private String diseaseDeadReason;

    /** 使用支气管扩张剂前：FEV1/FVC（%） */
    @Excel(name = "使用支气管扩张剂前：FEV1/FVC", readConverterExp = "%=")
    private String qian;

    /** 使用支气管扩张剂后：FEV1/FVC（%） */
    @Excel(name = "使用支气管扩张剂后：FEV1/FVC", readConverterExp = "%=")
    private String hou;

    /** 最高诊断依据 */
    @Excel(name = "最高诊断依据")
    private String zuigaoyiju;

    /** 症状 */
    @Excel(name = "症状")
    private String zhengzhuang;

    /** 诊断地区(编码) */
    @Excel(name = "诊断地区(编码)")
    private String zdAreaCode;

    /** 诊断机构(编码) */
    @Excel(name = "诊断机构(编码)")
    private String zdUnitCode;

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
    public void setGenerate(String generate) 
    {
        this.generate = generate;
    }

    public String getGenerate() 
    {
        return generate;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }
    public void setCardNo(String cardNo) 
    {
        this.cardNo = cardNo;
    }

    public String getCardNo() 
    {
        return cardNo;
    }
    public void setMingzu(String mingzu) 
    {
        this.mingzu = mingzu;
    }

    public String getMingzu() 
    {
        return mingzu;
    }
    public void setEdu(String edu) 
    {
        this.edu = edu;
    }

    public String getEdu() 
    {
        return edu;
    }
    public void setMerry(String merry) 
    {
        this.merry = merry;
    }

    public String getMerry() 
    {
        return merry;
    }
    public void setWorkType(String workType) 
    {
        this.workType = workType;
    }

    public String getWorkType() 
    {
        return workType;
    }
    public void setConnectPhone(String connectPhone) 
    {
        this.connectPhone = connectPhone;
    }

    public String getConnectPhone() 
    {
        return connectPhone;
    }
    public void setConnectNumber(String connectNumber) 
    {
        this.connectNumber = connectNumber;
    }

    public String getConnectNumber() 
    {
        return connectNumber;
    }
    public void setChangzhuAddress(String changzhuAddress) 
    {
        this.changzhuAddress = changzhuAddress;
    }

    public String getChangzhuAddress() 
    {
        return changzhuAddress;
    }
    public void setChangzhuAddressCode(String changzhuAddressCode) 
    {
        this.changzhuAddressCode = changzhuAddressCode;
    }

    public String getChangzhuAddressCode() 
    {
        return changzhuAddressCode;
    }
    public void setChangzhuDetail(String changzhuDetail) 
    {
        this.changzhuDetail = changzhuDetail;
    }

    public String getChangzhuDetail() 
    {
        return changzhuDetail;
    }
    public void setHujiAddressType(String hujiAddressType) 
    {
        this.hujiAddressType = hujiAddressType;
    }

    public String getHujiAddressType() 
    {
        return hujiAddressType;
    }
    public void setHujiAddressCode(String hujiAddressCode) 
    {
        this.hujiAddressCode = hujiAddressCode;
    }

    public String getHujiAddressCode() 
    {
        return hujiAddressCode;
    }
    public void setHujiAddress(String hujiAddress) 
    {
        this.hujiAddress = hujiAddress;
    }

    public String getHujiAddress() 
    {
        return hujiAddress;
    }
    public void setIcd(String icd) 
    {
        this.icd = icd;
    }

    public String getIcd() 
    {
        return icd;
    }
    public void setZhengduanshijian(Date zhengduanshijian) 
    {
        this.zhengduanshijian = zhengduanshijian;
    }

    public Date getZhengduanshijian() 
    {
        return zhengduanshijian;
    }
    public void setGuizhuan(String guizhuan) 
    {
        this.guizhuan = guizhuan;
    }

    public String getGuizhuan() 
    {
        return guizhuan;
    }
    public void setDeadDate(Date deadDate) 
    {
        this.deadDate = deadDate;
    }

    public Date getDeadDate() 
    {
        return deadDate;
    }
    public void setDiseaseDeadReason(String diseaseDeadReason) 
    {
        this.diseaseDeadReason = diseaseDeadReason;
    }

    public String getDiseaseDeadReason() 
    {
        return diseaseDeadReason;
    }
    public void setQian(String qian) 
    {
        this.qian = qian;
    }

    public String getQian() 
    {
        return qian;
    }
    public void setHou(String hou) 
    {
        this.hou = hou;
    }

    public String getHou() 
    {
        return hou;
    }
    public void setZuigaoyiju(String zuigaoyiju) 
    {
        this.zuigaoyiju = zuigaoyiju;
    }

    public String getZuigaoyiju() 
    {
        return zuigaoyiju;
    }
    public void setZhengzhuang(String zhengzhuang) 
    {
        this.zhengzhuang = zhengzhuang;
    }

    public String getZhengzhuang() 
    {
        return zhengzhuang;
    }
    public void setZdAreaCode(String zdAreaCode) 
    {
        this.zdAreaCode = zdAreaCode;
    }

    public String getZdAreaCode() 
    {
        return zdAreaCode;
    }
    public void setZdUnitCode(String zdUnitCode) 
    {
        this.zdUnitCode = zdUnitCode;
    }

    public String getZdUnitCode() 
    {
        return zdUnitCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("generate", getGenerate())
            .append("birthday", getBirthday())
            .append("cardType", getCardType())
            .append("cardNo", getCardNo())
            .append("mingzu", getMingzu())
            .append("edu", getEdu())
            .append("merry", getMerry())
            .append("workType", getWorkType())
            .append("connectPhone", getConnectPhone())
            .append("connectNumber", getConnectNumber())
            .append("changzhuAddress", getChangzhuAddress())
            .append("changzhuAddressCode", getChangzhuAddressCode())
            .append("changzhuDetail", getChangzhuDetail())
            .append("hujiAddressType", getHujiAddressType())
            .append("hujiAddressCode", getHujiAddressCode())
            .append("hujiAddress", getHujiAddress())
            .append("icd", getIcd())
            .append("zhengduanshijian", getZhengduanshijian())
            .append("guizhuan", getGuizhuan())
            .append("deadDate", getDeadDate())
            .append("diseaseDeadReason", getDiseaseDeadReason())
            .append("qian", getQian())
            .append("hou", getHou())
            .append("zuigaoyiju", getZuigaoyiju())
            .append("zhengzhuang", getZhengzhuang())
            .append("zdAreaCode", getZdAreaCode())
            .append("zdUnitCode", getZdUnitCode())
            .toString();
    }
}
