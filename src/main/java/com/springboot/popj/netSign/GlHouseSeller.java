package com.springboot.popj.netSign;

import com.springboot.popj.RelatedPerson;

/**
 * 售房人信息
 */
public class GlHouseSeller {
    private String obligeeName;                     //权利人名称
    private String obligeeType;                     //权利人类型（权利人、抵押人、债务人...）
    private Integer obligeeOrder;                    //权利人顺序
    private RelatedPerson relatedPerson;  //权利人详细信息

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

    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }
}
