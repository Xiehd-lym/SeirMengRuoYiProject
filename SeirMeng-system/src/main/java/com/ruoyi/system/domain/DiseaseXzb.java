package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 心脏性猝死对象 disease_xzb
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public class DiseaseXzb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String genarter;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birday;

    /** 身份证件类型 */
    @Excel(name = "身份证件类型")
    private String cardType;

    /** 身份证件号 */
    @Excel(name = "身份证件号")
    private String cardNo;

    /** 民族 */
    @Excel(name = "民族")
    private String minzu;

    /** 国籍 */
    @Excel(name = "国籍")
    private String guojia;

    /** 学历 */
    @Excel(name = "学历")
    private String edu;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String marrey;

    /** 职业类型 */
    @Excel(name = "职业类型")
    private String jobType;

    /** 工作单位名称 */
    @Excel(name = "工作单位名称")
    private String workUnitName;

    /** 联系人 */
    @Excel(name = "联系人")
    private String connectorName;

    /** 联系人/监护人与本人关系 */
    @Excel(name = "联系人/监护人与本人关系")
    private String connectorGuanxi;

    /** 联系电话(手机) */
    @Excel(name = "联系电话(手机)")
    private String connectorPhone;

    /** 联系电话(座机) */
    @Excel(name = "联系电话(座机)")
    private String connectorLandline;

    /** 现住址类型 */
    @Excel(name = "现住址类型")
    private String addressType;

    /** 现住址(编码) */
    @Excel(name = "现住址(编码)")
    private String addressCode;

    /** 现住详细地址 */
    @Excel(name = "现住详细地址")
    private String nowDetailedAddress;

    /** 本县区居住6个月以上 */
    @Excel(name = "本县区居住6个月以上")
    private String sexAddressFlag;

    /** 户籍地址类型 */
    @Excel(name = "户籍地址类型")
    private String registeredResidenceAddressType;

    /** 户籍地址(编码) */
    @Excel(name = "户籍地址(编码)")
    private String registeredResidenceAddressCode;

    /** 户籍详细地址 */
    @Excel(name = "户籍详细地址")
    private String registeredDetailAddress;

    /** 疾病icd */
    @Excel(name = "疾病icd")
    private String icd;

    /** 首次诊断日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "首次诊断日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstDiagnosisDate;

    /** 确诊时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "确诊时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date diagnosisTime;

    /** 住院号 */
    @Excel(name = "住院号")
    private String admissionNumber;

    /** 门诊号 */
    @Excel(name = "门诊号")
    private String outpatientNumber;

    /** 是否首次发病 */
    @Excel(name = "是否首次发病")
    private String firstOnsetOfDiseaseFlag;

    /** 死亡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "死亡日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deathDate;

    /** 死亡原因 */
    @Excel(name = "死亡原因")
    private String deathCause;

    /** 具体死亡原因 */
    @Excel(name = "具体死亡原因")
    private String deathCauseDetail;

    /** 诊断依据 */
    @Excel(name = "诊断依据")
    private String diagnosticBasis;

    /** 最高诊断单位 */
    @Excel(name = "最高诊断单位")
    private String highestDiagnosticUnit;

    /** 报告医师 */
    @Excel(name = "报告医师")
    private String reportingPhysician;

    /** 家族史 */
    @Excel(name = "家族史")
    private String familyHistory;

    /** 与患者关系 */
    @Excel(name = "与患者关系")
    private String relationshipWithPatients;

    /** 病情转归 */
    @Excel(name = "病情转归")
    private String outcomeOfTheCondition;

    /** 治疗地区(编码) */
    @Excel(name = "治疗地区(编码)")
    private String treatmentAreaCode;

    /** 治疗机构(编码) */
    @Excel(name = "治疗机构(编码)")
    private String treatmentUnitCode;

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
    public void setGenarter(String genarter) 
    {
        this.genarter = genarter;
    }

    public String getGenarter() 
    {
        return genarter;
    }
    public void setBirday(Date birday) 
    {
        this.birday = birday;
    }

    public Date getBirday() 
    {
        return birday;
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
    public void setMinzu(String minzu) 
    {
        this.minzu = minzu;
    }

    public String getMinzu() 
    {
        return minzu;
    }
    public void setGuojia(String guojia) 
    {
        this.guojia = guojia;
    }

    public String getGuojia() 
    {
        return guojia;
    }
    public void setEdu(String edu) 
    {
        this.edu = edu;
    }

    public String getEdu() 
    {
        return edu;
    }
    public void setMarrey(String marrey) 
    {
        this.marrey = marrey;
    }

    public String getMarrey() 
    {
        return marrey;
    }
    public void setJobType(String jobType) 
    {
        this.jobType = jobType;
    }

    public String getJobType() 
    {
        return jobType;
    }
    public void setWorkUnitName(String workUnitName) 
    {
        this.workUnitName = workUnitName;
    }

    public String getWorkUnitName() 
    {
        return workUnitName;
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
    public void setConnectorPhone(String connectorPhone) 
    {
        this.connectorPhone = connectorPhone;
    }

    public String getConnectorPhone() 
    {
        return connectorPhone;
    }
    public void setConnectorLandline(String connectorLandline) 
    {
        this.connectorLandline = connectorLandline;
    }

    public String getConnectorLandline() 
    {
        return connectorLandline;
    }
    public void setAddressType(String addressType) 
    {
        this.addressType = addressType;
    }

    public String getAddressType() 
    {
        return addressType;
    }
    public void setAddressCode(String addressCode) 
    {
        this.addressCode = addressCode;
    }

    public String getAddressCode() 
    {
        return addressCode;
    }
    public void setNowDetailedAddress(String nowDetailedAddress) 
    {
        this.nowDetailedAddress = nowDetailedAddress;
    }

    public String getNowDetailedAddress() 
    {
        return nowDetailedAddress;
    }
    public void setSexAddressFlag(String sexAddressFlag) 
    {
        this.sexAddressFlag = sexAddressFlag;
    }

    public String getSexAddressFlag() 
    {
        return sexAddressFlag;
    }
    public void setRegisteredResidenceAddressType(String registeredResidenceAddressType) 
    {
        this.registeredResidenceAddressType = registeredResidenceAddressType;
    }

    public String getRegisteredResidenceAddressType() 
    {
        return registeredResidenceAddressType;
    }
    public void setRegisteredResidenceAddressCode(String registeredResidenceAddressCode) 
    {
        this.registeredResidenceAddressCode = registeredResidenceAddressCode;
    }

    public String getRegisteredResidenceAddressCode() 
    {
        return registeredResidenceAddressCode;
    }
    public void setRegisteredDetailAddress(String registeredDetailAddress) 
    {
        this.registeredDetailAddress = registeredDetailAddress;
    }

    public String getRegisteredDetailAddress() 
    {
        return registeredDetailAddress;
    }
    public void setIcd(String icd) 
    {
        this.icd = icd;
    }

    public String getIcd() 
    {
        return icd;
    }
    public void setFirstDiagnosisDate(Date firstDiagnosisDate) 
    {
        this.firstDiagnosisDate = firstDiagnosisDate;
    }

    public Date getFirstDiagnosisDate() 
    {
        return firstDiagnosisDate;
    }
    public void setDiagnosisTime(Date diagnosisTime) 
    {
        this.diagnosisTime = diagnosisTime;
    }

    public Date getDiagnosisTime() 
    {
        return diagnosisTime;
    }
    public void setAdmissionNumber(String admissionNumber) 
    {
        this.admissionNumber = admissionNumber;
    }

    public String getAdmissionNumber() 
    {
        return admissionNumber;
    }
    public void setOutpatientNumber(String outpatientNumber) 
    {
        this.outpatientNumber = outpatientNumber;
    }

    public String getOutpatientNumber() 
    {
        return outpatientNumber;
    }
    public void setFirstOnsetOfDiseaseFlag(String firstOnsetOfDiseaseFlag) 
    {
        this.firstOnsetOfDiseaseFlag = firstOnsetOfDiseaseFlag;
    }

    public String getFirstOnsetOfDiseaseFlag() 
    {
        return firstOnsetOfDiseaseFlag;
    }
    public void setDeathDate(Date deathDate) 
    {
        this.deathDate = deathDate;
    }

    public Date getDeathDate() 
    {
        return deathDate;
    }
    public void setDeathCause(String deathCause) 
    {
        this.deathCause = deathCause;
    }

    public String getDeathCause() 
    {
        return deathCause;
    }
    public void setDeathCauseDetail(String deathCauseDetail) 
    {
        this.deathCauseDetail = deathCauseDetail;
    }

    public String getDeathCauseDetail() 
    {
        return deathCauseDetail;
    }
    public void setDiagnosticBasis(String diagnosticBasis) 
    {
        this.diagnosticBasis = diagnosticBasis;
    }

    public String getDiagnosticBasis() 
    {
        return diagnosticBasis;
    }
    public void setHighestDiagnosticUnit(String highestDiagnosticUnit) 
    {
        this.highestDiagnosticUnit = highestDiagnosticUnit;
    }

    public String getHighestDiagnosticUnit() 
    {
        return highestDiagnosticUnit;
    }
    public void setReportingPhysician(String reportingPhysician) 
    {
        this.reportingPhysician = reportingPhysician;
    }

    public String getReportingPhysician() 
    {
        return reportingPhysician;
    }
    public void setFamilyHistory(String familyHistory) 
    {
        this.familyHistory = familyHistory;
    }

    public String getFamilyHistory() 
    {
        return familyHistory;
    }
    public void setRelationshipWithPatients(String relationshipWithPatients) 
    {
        this.relationshipWithPatients = relationshipWithPatients;
    }

    public String getRelationshipWithPatients() 
    {
        return relationshipWithPatients;
    }
    public void setOutcomeOfTheCondition(String outcomeOfTheCondition) 
    {
        this.outcomeOfTheCondition = outcomeOfTheCondition;
    }

    public String getOutcomeOfTheCondition() 
    {
        return outcomeOfTheCondition;
    }
    public void setTreatmentAreaCode(String treatmentAreaCode) 
    {
        this.treatmentAreaCode = treatmentAreaCode;
    }

    public String getTreatmentAreaCode() 
    {
        return treatmentAreaCode;
    }
    public void setTreatmentUnitCode(String treatmentUnitCode) 
    {
        this.treatmentUnitCode = treatmentUnitCode;
    }

    public String getTreatmentUnitCode() 
    {
        return treatmentUnitCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("genarter", getGenarter())
            .append("birday", getBirday())
            .append("cardType", getCardType())
            .append("cardNo", getCardNo())
            .append("minzu", getMinzu())
            .append("guojia", getGuojia())
            .append("edu", getEdu())
            .append("marrey", getMarrey())
            .append("jobType", getJobType())
            .append("workUnitName", getWorkUnitName())
            .append("connectorName", getConnectorName())
            .append("connectorGuanxi", getConnectorGuanxi())
            .append("connectorPhone", getConnectorPhone())
            .append("connectorLandline", getConnectorLandline())
            .append("addressType", getAddressType())
            .append("addressCode", getAddressCode())
            .append("nowDetailedAddress", getNowDetailedAddress())
            .append("sexAddressFlag", getSexAddressFlag())
            .append("registeredResidenceAddressType", getRegisteredResidenceAddressType())
            .append("registeredResidenceAddressCode", getRegisteredResidenceAddressCode())
            .append("registeredDetailAddress", getRegisteredDetailAddress())
            .append("icd", getIcd())
            .append("firstDiagnosisDate", getFirstDiagnosisDate())
            .append("diagnosisTime", getDiagnosisTime())
            .append("admissionNumber", getAdmissionNumber())
            .append("outpatientNumber", getOutpatientNumber())
            .append("firstOnsetOfDiseaseFlag", getFirstOnsetOfDiseaseFlag())
            .append("deathDate", getDeathDate())
            .append("deathCause", getDeathCause())
            .append("deathCauseDetail", getDeathCauseDetail())
            .append("diagnosticBasis", getDiagnosticBasis())
            .append("highestDiagnosticUnit", getHighestDiagnosticUnit())
            .append("reportingPhysician", getReportingPhysician())
            .append("familyHistory", getFamilyHistory())
            .append("relationshipWithPatients", getRelationshipWithPatients())
            .append("outcomeOfTheCondition", getOutcomeOfTheCondition())
            .append("treatmentAreaCode", getTreatmentAreaCode())
            .append("treatmentUnitCode", getTreatmentUnitCode())
            .toString();
    }
}
