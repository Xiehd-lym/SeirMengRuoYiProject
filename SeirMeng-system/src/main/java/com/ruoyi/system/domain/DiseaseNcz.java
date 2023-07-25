package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 脑卒中对象 disease_ncz
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public class DiseaseNcz extends BaseEntity
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

    /** 国籍 */
    @Excel(name = "国籍")
    private String guoji;

    /** 学历 */
    @Excel(name = "学历")
    private String edu;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String merry;

    /** 职业类型 */
    @Excel(name = "职业类型")
    private String workType;

    /** 工作单位名称 */
    @Excel(name = "工作单位名称")
    private String workAddress;

    /** 联系人 */
    @Excel(name = "联系人")
    private String connectorName;

    /** 联系人/监护人与本人关系 */
    @Excel(name = "联系人/监护人与本人关系")
    private String connectorGuanxi;

    /** 联系电话(手机) */
    @Excel(name = "联系电话(手机)")
    private String connectPhone;

    /** 联系电话(座机) */
    @Excel(name = "联系电话(座机)")
    private String connectNumber;

    /** 现住址类型 */
    @Excel(name = "现住址类型")
    private String changzhuAddress;

    /** 现住址(编码) */
    @Excel(name = "现住址(编码)")
    private String changzhuAddressCode;

    /** 现住详细地址 */
    @Excel(name = "现住详细地址")
    private String changzhuDetail;

    /** 本县区居住6个月以上 */
    @Excel(name = "本县区居住6个月以上")
    private String liugeyue;

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

    /** 首次诊断日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "首次诊断日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zhengduanshijian;

    /** 确诊时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "确诊时间", width = 30, dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date quezhTime;

    /** 住院号 */
    @Excel(name = "住院号")
    private String zhuyuan;

    /** 门诊号 */
    @Excel(name = "门诊号")
    private String menzheng;

    /** 是否首次发病 */
    @Excel(name = "是否首次发病")
    private String shifoushouci;

    public String getShifoushouci() {
        return shifoushouci;
    }

    public void setShifoushouci(String shifoushouci) {
        this.shifoushouci = shifoushouci;
    }

    /** 死亡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "死亡日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deadDate;

    /** 死亡原因 */
    @Excel(name = "死亡原因")
    private String diseaseDeadReason;

    /** 具体死亡原因 */
    @Excel(name = "具体死亡原因")
    private String juti;

    /** 诊断依据 */
    @Excel(name = "诊断依据")
    private String zhengzhuang;

    /** 最高诊断单位 */
    @Excel(name = "最高诊断单位")
    private String zuigaoyiju;

    /** 报告医师 */
    @Excel(name = "报告医师")
    private String yishi;

    /** 家族史 */
    @Excel(name = "家族史")
    private String jiazushi;

    /** 与患者关系 */
    @Excel(name = "与患者关系")
    private String guanxi;

    /** 病情转归 */
    @Excel(name = "病情转归")
    private String guizhuan;

    /** 治疗地区(编码) */
    @Excel(name = "治疗地区(编码)")
    private String zhiliao;

    /** 治疗机构(编码) */
    @Excel(name = "治疗机构(编码)")
    private String zhijiaojigou;

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
    public void setGuoji(String guoji) 
    {
        this.guoji = guoji;
    }

    public String getGuoji() 
    {
        return guoji;
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
    public void setWorkAddress(String workAddress) 
    {
        this.workAddress = workAddress;
    }

    public String getWorkAddress() 
    {
        return workAddress;
    }
    public void setConnectorName(String connectorName) 
    {
        this.connectorName = connectorName;
    }

    public String getConnectorName() 
    {
        return connectorName;
    }
    public void setConnectorGuanxi(String connectorGuanxi) 
    {
        this.connectorGuanxi = connectorGuanxi;
    }

    public String getConnectorGuanxi() 
    {
        return connectorGuanxi;
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
    public void setLiugeyue(String liugeyue) 
    {
        this.liugeyue = liugeyue;
    }

    public String getLiugeyue() 
    {
        return liugeyue;
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
    public void setQuezhTime(Date quezhTime) 
    {
        this.quezhTime = quezhTime;
    }

    public Date getQuezhTime() 
    {
        return quezhTime;
    }
    public void setZhuyuan(String zhuyuan) 
    {
        this.zhuyuan = zhuyuan;
    }

    public String getZhuyuan() 
    {
        return zhuyuan;
    }
    public void setMenzheng(String menzheng) 
    {
        this.menzheng = menzheng;
    }

    public String getMenzheng() 
    {
        return menzheng;
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
    public void setJuti(String juti) 
    {
        this.juti = juti;
    }

    public String getJuti() 
    {
        return juti;
    }
    public void setZhengzhuang(String zhengzhuang) 
    {
        this.zhengzhuang = zhengzhuang;
    }

    public String getZhengzhuang() 
    {
        return zhengzhuang;
    }
    public void setZuigaoyiju(String zuigaoyiju) 
    {
        this.zuigaoyiju = zuigaoyiju;
    }

    public String getZuigaoyiju() 
    {
        return zuigaoyiju;
    }
    public void setYishi(String yishi) 
    {
        this.yishi = yishi;
    }

    public String getYishi() 
    {
        return yishi;
    }
    public void setJiazushi(String jiazushi) 
    {
        this.jiazushi = jiazushi;
    }

    public String getJiazushi() 
    {
        return jiazushi;
    }
    public void setGuanxi(String guanxi) 
    {
        this.guanxi = guanxi;
    }

    public String getGuanxi() 
    {
        return guanxi;
    }
    public void setGuizhuan(String guizhuan) 
    {
        this.guizhuan = guizhuan;
    }

    public String getGuizhuan() 
    {
        return guizhuan;
    }
    public void setZhiliao(String zhiliao) 
    {
        this.zhiliao = zhiliao;
    }

    public String getZhiliao() 
    {
        return zhiliao;
    }
    public void setZhijiaojigou(String zhijiaojigou) 
    {
        this.zhijiaojigou = zhijiaojigou;
    }

    public String getZhijiaojigou() 
    {
        return zhijiaojigou;
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
            .append("guoji", getGuoji())
            .append("edu", getEdu())
            .append("merry", getMerry())
            .append("workType", getWorkType())
            .append("workAddress", getWorkAddress())
            .append("connectorName", getConnectorName())
            .append("connectorGuanxi", getConnectorGuanxi())
            .append("connectPhone", getConnectPhone())
            .append("connectNumber", getConnectNumber())
            .append("changzhuAddress", getChangzhuAddress())
            .append("changzhuAddressCode", getChangzhuAddressCode())
            .append("changzhuDetail", getChangzhuDetail())
            .append("liugeyue", getLiugeyue())
            .append("hujiAddressType", getHujiAddressType())
            .append("hujiAddressCode", getHujiAddressCode())
            .append("hujiAddress", getHujiAddress())
            .append("icd", getIcd())
            .append("zhengduanshijian", getZhengduanshijian())
            .append("quezhTime", getQuezhTime())
            .append("zhuyuan", getZhuyuan())
            .append("menzheng", getMenzheng())
            .append("deadDate", getDeadDate())
            .append("diseaseDeadReason", getDiseaseDeadReason())
            .append("juti", getJuti())
            .append("zhengzhuang", getZhengzhuang())
            .append("zuigaoyiju", getZuigaoyiju())
            .append("yishi", getYishi())
            .append("jiazushi", getJiazushi())
            .append("guanxi", getGuanxi())
            .append("guizhuan", getGuizhuan())
            .append("zhiliao", getZhiliao())
            .append("zhijiaojigou", getZhijiaojigou())
            .toString();
    }
}
