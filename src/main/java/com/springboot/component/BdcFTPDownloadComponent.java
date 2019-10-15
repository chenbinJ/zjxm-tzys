package com.springboot.component;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

@Slf4j
@Component
public class BdcFTPDownloadComponent {
    @Value("${webplus.ftpAddressBdc}")
    private String ftpAddress;
    @Value("${webplus.ftpPortBdc}")
    private String ftpPort;
    @Value("${webplus.ftpUsernameBdc}")
    private String ftpUsername;
    @Value("${webplus.ftpPasswordBdc}")
    private String ftpPassword;
    //链接
    private static FTPClient ftpClient = new FTPClient();


    // inputstream转byte[]
    private byte[] is2byte(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = 1024;
        byte tmp[] = new byte[len];
        int i;
        while ((i = is.read(tmp, 0, len)) > 0) {
            baos.write(tmp, 0, i);
        }
        byte imgs[] = baos.toByteArray();
        return imgs;
    }


    /**
     * 下载ftp不动产登记平台图片
     *
     * @param remotePath
     * @param fileName
     * @param bytes
     * @return
     */
    public byte[] downFile(String remotePath, String fileName, byte[] bytes) {
        try {
            int reply;
            ftpClient.connect(ftpAddress, Integer.parseInt(ftpPort));
            // 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
            ftpClient.login(ftpUsername, ftpPassword);// 登录
            reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return bytes;
            }
            ftpClient.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
            //下载指定文件
            InputStream is = ftpClient.retrieveFileStream(fileName);
            bytes = is2byte(is);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return bytes;
    }


    /**
     * 删除文件 *
     *
     * @param pathname FTP服务器保存目录 *
     * @param filename 要删除的文件名称 *
     * @return
     */
    public boolean deleteFile(String pathname, String filename) {
        boolean flag = false;
        try {
            System.out.println("开始删除文件");
            initFtpClient();
            //切换FTP目录
            ftpClient.changeWorkingDirectory(pathname);
            ftpClient.dele(filename);
            ftpClient.logout();
            flag = true;
            System.out.println("删除文件成功");
        } catch (Exception e) {
            System.out.println("删除文件失败");
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }


    /**
     * 初始化ftp服务器
     */
    public void initFtpClient() {
        ftpClient = new FTPClient();
        ftpClient.setControlEncoding("utf-8");
        try {
            System.out.println("connecting...ftp服务器:" + this.ftpAddress + ":" + this.ftpPort);
            ftpClient.connect(ftpAddress, Integer.parseInt(ftpPort)); //连接ftp服务器
            ftpClient.login(ftpUsername, ftpPassword); //登录ftp服务器
            int replyCode = ftpClient.getReplyCode(); //是否成功登录服务器
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                System.out.println("connect failed...ftp服务器:" + this.ftpUsername + ":" + this.ftpPort);
            }
            System.out.println("connect successfu...ftp服务器:" + this.ftpUsername + ":" + this.ftpPort);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
