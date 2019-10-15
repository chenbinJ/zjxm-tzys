package com.springboot.popj.registration;

/**
 * 抵押注销
 */
public class RevokeBizInfo {
    private String revokeApplyDate;//业务申请日期
    private String warrantId;//抵押证明号
    private String revokeReason;//抵押原因

    public String getRevokeReason() {
        return revokeReason;
    }

    public void setRevokeReason(String revokePeason) {
        this.revokeReason = revokePeason;
    }

    public String getRevokeApplyDate() {
        return revokeApplyDate;
    }

    public void setRevokeApplyDate(String revokeApplyDate) {
        this.revokeApplyDate = revokeApplyDate;
    }

    public String getWarrantId() {
        return warrantId;
    }

    public void setWarrantId(String warrantId) {
        this.warrantId = warrantId;
    }
}
