package com.springboot.popj.registration;

import java.util.List;

public class MortgageBizInfo {

    private String mortgageApplyDate;//抵押业务申请日期
    private String mortgageWay;//抵押方式
    private String creditAmount;//债权数额
    private String evaluationValue;//评估价值
    private String mortgageTerm;//抵押期限
    private String mortgageStartDate;//权利开始时间
    private String mortgageEndDate;//权利结束时间
    private String mortgageReason;//抵押原因
    private String absoluteFact;//最高债权确定事实
    private String highestClaimAmount;//最高债权数额
    private String htbh;//合同编号
    private List<DyqrGlMortgator> mortgageeInfoVoList;//抵押权人信息
    private List<DyrGlMortgator> mortgagorInfoVoList; //抵押人信息
    private List<WtdlrGlMortgator> agentInfoVoList; //委托代理人信息列表
    private List<DyzwrGlMortgator> obligorInfoVoList; //抵押债务人信息列表
    private List<RealEstateInfo> realEstateInfoVoList; //待抵押的不动产信息列表

    public String getMortgageApplyDate() {
        return mortgageApplyDate;
    }

    public void setMortgageApplyDate(String mortgageApplyDate) {
        this.mortgageApplyDate = mortgageApplyDate;
    }

    public String getMortgageWay() {
        return mortgageWay;
    }

    public void setMortgageWay(String mortgageWay) {
        this.mortgageWay = mortgageWay;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getEvaluationValue() {
        return evaluationValue;
    }

    public void setEvaluationValue(String evaluationValue) {
        this.evaluationValue = evaluationValue;
    }

    public String getMortgageTerm() {
        return mortgageTerm;
    }

    public void setMortgageTerm(String mortgageTerm) {
        this.mortgageTerm = mortgageTerm;
    }

    public String getMortgageStartDate() {
        return mortgageStartDate;
    }

    public void setMortgageStartDate(String mortgageStartDate) {
        this.mortgageStartDate = mortgageStartDate;
    }

    public String getMortgageEndDate() {
        return mortgageEndDate;
    }

    public void setMortgageEndDate(String mortgageEndDate) {
        this.mortgageEndDate = mortgageEndDate;
    }

    public String getMortgageReason() {
        return mortgageReason;
    }

    public void setMortgageReason(String mortgageReason) {
        this.mortgageReason = mortgageReason;
    }

    public String getAbsoluteFact() {
        return absoluteFact;
    }

    public void setAbsoluteFact(String absoluteFact) {
        this.absoluteFact = absoluteFact;
    }

    public String getHighestClaimAmount() {
        return highestClaimAmount;
    }

    public void setHighestClaimAmount(String highestClaimAmount) {
        this.highestClaimAmount = highestClaimAmount;
    }

    public String getHtbh() {
        return htbh;
    }

    public void setHtbh(String htbh) {
        this.htbh = htbh;
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

    public List<WtdlrGlMortgator> getAgentInfoVoList() {
        return agentInfoVoList;
    }

    public void setAgentInfoVoList(List<WtdlrGlMortgator> agentInfoVoList) {
        this.agentInfoVoList = agentInfoVoList;
    }

    public List<DyzwrGlMortgator> getObligorInfoVoList() {
        return obligorInfoVoList;
    }

    public void setObligorInfoVoList(List<DyzwrGlMortgator> obligorInfoVoList) {
        this.obligorInfoVoList = obligorInfoVoList;
    }

    public List<RealEstateInfo> getRealEstateInfoVoList() {
        return realEstateInfoVoList;
    }

    public void setRealEstateInfoVoList(List<RealEstateInfo> realEstateInfoVoList) {
        this.realEstateInfoVoList = realEstateInfoVoList;
    }
}
