package com.springboot.popj.registration;

import java.io.Serializable;

public class ImmovableFile implements Serializable {
    private String fileName;
    private String fileType;
    private Double fileSize;
    private String fileAdress;
    private String pName;
    private int fileSequence;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileAdress() {
        return fileAdress;
    }

    public void setFileAdress(String fileAdress) {
        this.fileAdress = fileAdress;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getFileSequence() {
        return fileSequence;
    }

    public void setFileSequence(int fileSequence) {
        this.fileSequence = fileSequence;
    }
}
