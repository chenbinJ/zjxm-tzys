package com.springboot.popj.registration;


public class QlrGlMortgator {

    private String obligeeName;//姓名
    private String obligeeId;//证件号码
    private String obligeeIdType;//证件类型编码
    private String commonWay;//共有方式
    private String sharedSharel;//共有份额

    public String getCommonWay() {
        return commonWay;
    }

    public void setCommonWay(String commonWay) {
        this.commonWay = commonWay;
    }

    public String getSharedSharel() {
        return sharedSharel;
    }

    public void setSharedSharel(String sharedSharel) {
        this.sharedSharel = sharedSharel;
    }

    public String getObligeeName() {
        return obligeeName;
    }

    public void setObligeeName(String obligeeName) {
        this.obligeeName = obligeeName;
    }

    public String getObligeeId() {
        return obligeeId;
    }

    public void setObligeeId(String obligeeId) {
        this.obligeeId = obligeeId;
    }

    public String getObligeeIdType() {
        return obligeeIdType;
    }

    public void setObligeeIdType(String obligeeIdType) {
        this.obligeeIdType = obligeeIdType;
    }
}
