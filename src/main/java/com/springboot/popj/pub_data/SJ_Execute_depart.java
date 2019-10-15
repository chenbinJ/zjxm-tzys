package com.springboot.popj.pub_data;

import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.util.Date;

public class SJ_Execute_depart implements Serializable {
    private String id;
    private String receiptNumber;
    private String executeDepart;
    private String insertDate;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getExecuteDepart() {
        return executeDepart;
    }

    public void setExecuteDepart(String executeDepart) {
        this.executeDepart = executeDepart;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = TimeUtil.getTimeString(insertDate);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
