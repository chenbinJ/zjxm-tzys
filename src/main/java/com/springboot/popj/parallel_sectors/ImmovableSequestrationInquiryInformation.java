package com.springboot.popj.parallel_sectors;

import com.springboot.popj.pub_data.SJ_Qlr_Info;

import java.util.List;
//查封信息
public class ImmovableSequestrationInquiryInformation extends InquiryInformation {

    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableUnicode;            //不动产单元号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String sequestrationCertificateNo;           //查封证明号
    private String relevantCertificateNo;           //相关证号
    private String registrationDate;                //登记日期
    private String remarks;                         //备注附记

    private List<SJ_Qlr_Info> sealUpPersonVoList;     //关联的查封人数据
    private List<SJ_Qlr_Info> obligeeVoList;            //关联的权利人数据

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getImmovableUnicode() {
        return immovableUnicode;
    }

    public void setImmovableUnicode(String immovableUnicode) {
        this.immovableUnicode = immovableUnicode;
    }

    public String getImmovableSite() {
        return immovableSite;
    }

    public void setImmovableSite(String immovableSite) {
        this.immovableSite = immovableSite;
    }

    public String getSequestrationCertificateNo() {
        return sequestrationCertificateNo;
    }

    public void setSequestrationCertificateNo(String sequestrationCertificateNo) {
        this.sequestrationCertificateNo = sequestrationCertificateNo;
    }

    public String getRelevantCertificateNo() {
        return relevantCertificateNo;
    }

    public void setRelevantCertificateNo(String relevantCertificateNo) {
        this.relevantCertificateNo = relevantCertificateNo;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<SJ_Qlr_Info> getSealUpPersonVoList() {
        return sealUpPersonVoList;
    }

    public void setSealUpPersonVoList(List<SJ_Qlr_Info> sealUpPersonVoList) {
        this.sealUpPersonVoList = sealUpPersonVoList;
    }

    public List<SJ_Qlr_Info> getObligeeVoList() {
        return obligeeVoList;
    }

    public void setObligeeVoList(List<SJ_Qlr_Info> obligeeVoList) {
        this.obligeeVoList = obligeeVoList;
    }
}
