package com.springboot.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SJ_Fjfile implements Serializable {
    private String fileId;                    //附件文件唯一id
    private String fileName;                  //文件名称
    private String fileExt;                   //文件扩展名
    private String contentType;               //实际文件类型
    private String fileSize;                  //文件大小
    private String ftpPath;                   //ftp保存路径
    private byte[] fileContent;               //文件内容（不适用ftp模式时使用）
    private String fileStatus;                //文件当前状态
    private String fileSubmissionTime;        //文件提交时间
    private String ext1;                      //扩展字段1
    private String ext2;                      //扩展字段2
    private String ezt3;                      //扩展字段3

    private String logicPath;                  //逻辑路径

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getFileSubmissionTime() {
        return fileSubmissionTime;
    }

    public void setFileSubmissionTime(Date fileSubmissionTime) {
        this.fileSubmissionTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fileSubmissionTime);
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ezt3;
    }

    public void setExt3(String ext3) {
        this.ezt3 = ext3;
    }

    public String getLogicPath() {
        return logicPath;
    }

    public void setLogicPath(String logicPath) {
        this.logicPath = logicPath;
    }
}
