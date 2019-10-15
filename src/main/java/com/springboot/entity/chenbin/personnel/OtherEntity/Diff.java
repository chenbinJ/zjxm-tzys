package com.springboot.entity.chenbin.personnel.OtherEntity;

import java.io.Serializable;

public class Diff implements Serializable {
    private String chk_key;
    private String in_val;
    private String out_val;

    public String getChk_key() {
        return chk_key;
    }

    public void setChk_key(String chk_key) {
        this.chk_key = chk_key;
    }

    public String getIn_val() {
        return in_val;
    }

    public void setIn_val(String in_val) {
        this.in_val = in_val;
    }

    public String getOut_val() {
        return out_val;
    }

    public void setOut_val(String out_val) {
        this.out_val = out_val;
    }
}
