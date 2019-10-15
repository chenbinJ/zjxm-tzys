package com.springboot.entity;

import java.util.List;

/**
 * 二手房水电气受理请求参数
 */
public class
EsfSdq {

    private String slbh;//受理编号
    private boolean transferred;//布尔型false表示转移前，true表示转移后
    private List<String> attDirList;//附件目录名称列表

    public String getSlbh() {
        return slbh;
    }

    public void setSlbh(String slbh) {
        this.slbh = slbh;
    }

    public boolean isTransferred() {
        return transferred;
    }

    public void setTransferred(boolean transferred) {
        this.transferred = transferred;
    }

    public List<String> getAttDirList() {
        return attDirList;
    }

    public void setAttDirList(List<String> attDirList) {
        this.attDirList = attDirList;
    }
}
