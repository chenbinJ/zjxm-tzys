package com.springboot.popj.parallel_sectors;

import com.springboot.popj.pub_data.SJ_Qlr_Info;

import java.util.List;
//异议信息
public class ImmovableObjectionInquiryInformation extends InquiryInformation{
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableUnicode;            //不动产单元号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String objectionCertificateNo;           //异议证明号
    private String relevantCertificateNo;           //相关证号
    private String registrationDate;                //登记日期
    private String remarks;                         //备注附记

    private List<SJ_Qlr_Info> dissidentVoList;     //关联的异议人数据
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

    public String getObjectionCertificateNo() {
        return objectionCertificateNo;
    }

    public void setObjectionCertificateNo(String objectionCertificateNo) {
        this.objectionCertificateNo = objectionCertificateNo;
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

    public List<SJ_Qlr_Info> getDissidentVoList() {
        return dissidentVoList;
    }

    public void setDissidentVoList(List<SJ_Qlr_Info> dissidentVoList) {
        this.dissidentVoList = dissidentVoList;
    }

    public List<SJ_Qlr_Info> getObligeeVoList() {
        return obligeeVoList;
    }

    public void setObligeeVoList(List<SJ_Qlr_Info> obligeeVoList) {
        this.obligeeVoList = obligeeVoList;
    }
}
