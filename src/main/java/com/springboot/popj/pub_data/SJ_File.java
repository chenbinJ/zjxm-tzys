package com.springboot.popj.pub_data;

public class SJ_File {

    private String fileName;//文件名
    private String fileType;//文件类型
    private String fileAddress;//ftp文件路径
    private String pName;//父文件夹名称
    private String fileSequence;//文件序号

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getFileSequence() {
        return fileSequence;
    }

    public void setFileSequence(String fileSequence) {
        this.fileSequence = fileSequence;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
