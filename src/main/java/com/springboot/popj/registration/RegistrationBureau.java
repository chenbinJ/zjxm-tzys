package com.springboot.popj.registration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.springboot.popj.GlMortgageHolder;
import com.springboot.popj.GlMortgagor;
import com.springboot.popj.MortgageService;
import com.springboot.popj.warrant.RealPropertyCertificate;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理登记局发送审核数据
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrationBureau {

    private String pid;     //流程模板id
    private String bizType; //业务类型
    private String platform;//发起平台
    private boolean  submitFlow;//是否提交流程
    private String  operatorName;//操作员名称
    private String  contacts;//联系人
    private String contactsPhone;//联系人电话
    private String contactsAdress;//联系人地址
    private String businessAreas;//区县代码
    private String note;//附记
    private MortgageBizInfo mortgageBizInfo;//抵押业务信息
    private List<DyqrGlMortgator> mortgageeInfoVoList; //抵押权人信息
    private List<DyrGlMortgator> mortgagorInfoVoList; //抵押人信息

    private RevokeBizInfo revokeBizInfo;//抵押注销
    private TransferBizInfo transferBizInfo;//转移登记业务信息
    private AdvanceBizInfo advanceBizInfo;//预告登记业务信息

    private List<ImmovableFile> fileInfoVoList;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean getSubmitFlow() {
        return submitFlow;
    }

    public void setSubmitFlow(boolean submitFlow) {
        this.submitFlow = submitFlow;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsAdress() {
        return contactsAdress;
    }

    public void setContactsAdress(String contactsAdress) {
        this.contactsAdress = contactsAdress;
    }

    public String getBusinessAreas() {
        return businessAreas;
    }

    public void setBusinessAreas(String businessAreas) {
        this.businessAreas = businessAreas;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public MortgageBizInfo getMortgageBizInfo() {
        return mortgageBizInfo;
    }

    public void setMortgageBizInfo(MortgageBizInfo mortgageBizInfo) {
        this.mortgageBizInfo = mortgageBizInfo;
    }

    public List<DyqrGlMortgator> getMortgageeInfoVoList() {
        return mortgageeInfoVoList;
    }

    public void setMortgageeInfoVoList(List<DyqrGlMortgator> mortgageeInfoVoList) {
        this.mortgageeInfoVoList = mortgageeInfoVoList;
    }

    public List<DyrGlMortgator> getMortgagorInfoVoList() {
        return mortgagorInfoVoList;
    }

    public void setMortgagorInfoVoList(List<DyrGlMortgator> mortgagorInfoVoList) {
        this.mortgagorInfoVoList = mortgagorInfoVoList;
    }

    public RevokeBizInfo getRevokeBizInfo() {
        return revokeBizInfo;
    }

    public void setRevokeBizInfo(RevokeBizInfo revokeBizInfo) {
        this.revokeBizInfo = revokeBizInfo;
    }

    public TransferBizInfo getTransferBizInfo() {
        return transferBizInfo;
    }

    public void setTransferBizInfo(TransferBizInfo transferBizInfo) {
        this.transferBizInfo = transferBizInfo;
    }

    public AdvanceBizInfo getAdvanceBizInfo() {
        return advanceBizInfo;
    }

    public void setAdvanceBizInfo(AdvanceBizInfo advanceBizInfo) {
        this.advanceBizInfo = advanceBizInfo;
    }

    public List<ImmovableFile> getFileInfoVoList() {
        return fileInfoVoList;
    }

    public void setFileInfoVoList(List<ImmovableFile> fileInfoVoList) {
        this.fileInfoVoList = fileInfoVoList;
    }
}
