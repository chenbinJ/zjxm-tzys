package com.springboot.popj;

public class GlMortgagor {

    private String obligeeName;//权利人名称
    private String obligeeType;  //权利人类型（权利人、抵押人、债务人...）
    private String obligeeOrder;//权利人顺序
    private String sharedMode;                      //共有方式
    private Integer sharedValue;                     //共有份额

    public String getSharedMode() {
        return sharedMode;
    }

    public void setSharedMode(String sharedMode) {
        this.sharedMode = sharedMode;
    }

    public Integer getSharedValue() {
        return sharedValue;
    }

    public void setSharedValue(Integer sharedValue) {
        this.sharedValue = sharedValue;
    }

    private RelatedPerson relatedPerson;//相关人信息

    public String getObligeeName() {
        return obligeeName;
    }

    public void setObligeeName(String obligeeName) {
        this.obligeeName = obligeeName;
    }

    public String getObligeeType() {
        return obligeeType;
    }

    public void setObligeeType(String obligeeType) {
        this.obligeeType = obligeeType;
    }

    public String getObligeeOrder() {
        return obligeeOrder;
    }

    public void setObligeeOrder(String obligeeOrder) {
        this.obligeeOrder = obligeeOrder;
    }

    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }
}
