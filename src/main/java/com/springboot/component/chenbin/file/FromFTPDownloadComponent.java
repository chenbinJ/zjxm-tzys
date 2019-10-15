package com.springboot.component.chenbin.file;

import com.alibaba.fastjson.JSONObject;
import com.springboot.entity.SJ_Fjfile;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component("fromFTPDownloadComponent")
public class FromFTPDownloadComponent {
    @Value("${webplus.ftpAddress}")
    private String ftpAddress;
    @Value("${webplus.ftpPort}")
    private String ftpPort;
    @Value("${webplus.ftpUsername}")
    private String ftpUsername;
    @Value("${webplus.ftpPassword}")
    private String ftpPassword;

    public boolean downFile(String remotePath, String fileName, SJ_Fjfile fj) {
        boolean success = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(ftpAddress, Integer.parseInt(ftpPort));
            // 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
            ftp.login(ftpUsername, ftpPassword);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return success;
            }
            System.out.println(remotePath + "   " + fileName);
            ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
            System.out.println("path:" + remotePath + ",name:" + fileName + ",fj:" + JSONObject.toJSONString(fj));
            //下载指定文件
            InputStream is = ftp.retrieveFileStream(new String(fileName.getBytes("UTF-8"), "ISO-8859-1"));
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            IOUtils.copy(is, out);
            byte[] bs = out.toByteArray();
            int length = bs.length;
            System.out.println("附件字节长度：" + length);
            fj.setFileSize(Integer.toString(length));
            fj.setFileContent(bs);
            out.close();
            is.close();
            System.out.println("流操作完毕");
            ftp.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return success;
    }
}
