package com.springboot.popj.netSign;

import com.springboot.popj.RelatedPerson;

/**
 * 购房人信息
 */
public class GlHouseBuyer {

    private String obligeeName;                     //名称
    private String obligeeType;                     //购房人类型（权利人、抵押人、债务人...）
    private Integer obligeeOrder;                    //购房人顺序
    private String sharedMode;                      //共有方式
    private Integer sharedValue;                     //共有份额
    private RelatedPerson relatedPerson;  //购房人详细信息

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

    public Integer getObligeeOrder() {
        return obligeeOrder;
    }

    public void setObligeeOrder(Integer obligeeOrder) {
        this.obligeeOrder = obligeeOrder;
    }

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

    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }
}
