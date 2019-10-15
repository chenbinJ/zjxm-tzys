package com.springboot.util;

public class StrUtil {


    // 通过FTP路径获取文件名
    public static String getFTPFileNameByFTPPath(String ftppath) {
        String ftpFileName = null;
        String[] splitTmp = ftppath.split("/");
        ftpFileName = splitTmp[splitTmp.length - 1];
        return ftpFileName;
    }

    // 通过FTP路径获取FTP目录
    public static String getFTPRemotePathByFTPPath(String ftppath) {
        String remotePath = null;
        StringBuffer sb;
        if (ftppath.startsWith("/")) {
            sb = new StringBuffer();
        } else {
            sb = new StringBuffer("/");
        }
        String[] splitTmp = ftppath.split("/");
        for (int i = 0; i < splitTmp.length - 1; i++) {
            sb.append(splitTmp[i]).append("/");
        }
        remotePath = sb.deleteCharAt(sb.length() - 1).toString();
        return remotePath;
    }

}
