package com.springboot.component.chenbin.file;

import com.google.common.collect.Maps;
import com.springboot.util.DateUtils;
import com.springboot.util.chenbin.IDUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Map;

@Component("toFTPUploadComponent")
@Slf4j
public class ToFTPUploadComponent {

    @Value("${webplus.ftpAddressBdc}")
    private String ftpAddress;
    @Value("${webplus.ftpPortBdc}")
    private String ftpPort;
    @Value("${webplus.ftpUsernameBdc}")
    private String ftpUsername;
    @Value("${webplus.ftpPasswordBdc}")
    private String ftpPassword;


    @Value("${webplus.ftpAddress}")
    private String yftpAddress;
    @Value("${webplus.ftpPort}")
    private String yftpPort;
    @Value("${webplus.ftpUsername}")
    private String yftpUsername;
    @Value("${webplus.ftpPassword}")
    private String yftpPassword;


    //链接
    private static FTPClient ftpClient = new FTPClient();
    private static String LOCAL_CHARSET = "GBK";


    public boolean uploadFile(String ftpPath, InputStream input) {
        boolean success = false;
        FTPClient ftp = new FTPClient();
        ftp.setControlEncoding("GBK");
        try {
            int reply;
            ftp.connect(ftpAddress, Integer.parseInt(ftpPort));// 连接FTP服务器
            ftp.login(ftpUsername, ftpPassword);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                System.out.println("FTP服务器连接失败");
                ftp.disconnect();
                return success;
            }
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            String FTP_BASEPATH1 = ftpPath.substring(0, 5);
            String FTP_BASEPATH2 = ftpPath.substring(0, 8);
            String FTP_BASEPATH3 = ftpPath.substring(0, 11);
            String originFileName = ftpPath.substring(12);
            ftp.makeDirectory(FTP_BASEPATH1);
            ftp.changeWorkingDirectory(FTP_BASEPATH1);
            ftp.makeDirectory(FTP_BASEPATH2);
            ftp.changeWorkingDirectory(FTP_BASEPATH2);
            ftp.makeDirectory(FTP_BASEPATH3);
            ftp.changeWorkingDirectory(FTP_BASEPATH3);
            ftp.storeFile(originFileName, input);
            input.close();
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

    public boolean uploadFile(String ftpPath, byte[] input) {
        System.out.println("将要上传的地址为：" + ftpPath + "，附件大小为：" + input.length);
        ByteArrayInputStream bais = new ByteArrayInputStream(input);
        return uploadFile(ftpPath, bais);
    }

    public Object ycslUpload(byte[] bytes, String fileName, String Type) {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        return upYcslloadFile(bais, fileName, Type);
    }


    /**
     * ftp服务器上
     *
     * @param
     * @return
     */
    public Object upYcslloadFile(InputStream input, String fileName, String fileType) {
        System.out.println(fileName + "\t" + fileType);
        Map<String, Object> map = Maps.newHashMap();
        boolean returnValue = false;
        String hz = null;
        //路径年/月/日/entryId名称
        String path = DateUtils.getNowYear() + File.separator + DateUtils.getNowMonth() + File.separator + DateUtils.getNowDay();
        try {
            log.info("进入附件处理");
            int reply;
            log.info("连接ftp服务器");
            ftpClient.connect(yftpAddress, Integer.parseInt(yftpPort));// 连接FTP服务器
            log.info("登录ftp用户");
            ftpClient.login(yftpUsername, yftpPassword);// 登录
            /**
             * 确认应答状态码是否正确完成响应
             * 凡是 2开头的 isPositiveCompletion 都会返回 true，因为它底层判断是：
             * return (reply >= 200 && reply < 300);
             */
            reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return null;
            }
            ftpClient.setControlEncoding("UTF-8");
            //如果没有需求上传图片的话还ok，
            // 但是要是传图片，就需要设置一下文件类型为二进制
            // 这样上传的图片才不会报错（记得我的错误貌似是什么ASCII编码什么的。。）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.setFileTransferMode(ftpClient.BINARY_FILE_TYPE);
            //创建目录
            mkDir(path);//创建目录
            ftpClient.changeWorkingDirectory("/" + path);//创建完了目录需要将当前工作目录切换过来，然后直接在下面创建文件
            System.out.println("aa" + ftpClient.changeWorkingDirectory("/" + path));
            if (FTPReply.isPositiveCompletion(ftpClient.sendCommand("OPTS UTF8", "ON"))) {// 开启服务器对UTF-8的支持，如果服务器支持就用UTF-8编码，否则就使用本地编码（GBK）.
                LOCAL_CHARSET = "UTF-8";
            }
            System.out.println(ftpClient.printWorkingDirectory());
            returnValue = ftpClient.storeFile(fileName, input);
            System.out.println(returnValue);
            FTPFile[] fs = ftpClient.listFiles(fileName);
            if (fs.length == 0) {
                System.out.println("this file not exist ftp");
            } else if (fs.length == 1) {
                System.out.println("this file exist ftp");
            }
            ftpClient.logout();
            input.close();
        } catch (IOException e) {
            returnValue = false;
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
        if (returnValue == true) {
            map.put("fileName", fileName);
            map.put("path", path);
//            return path+File.separator+fileName;
            return map;
        }
        return null;
    }


    public boolean uploadFileBDC(String fileName, String fileType, InputStream is) {
        boolean success;
        try {
            String fileName_ftp = fileName + "." + fileType;
            //路径年/月/日/entryId名称
            String mulu = DateUtils.getNowYear() + File.separator + DateUtils.getNowMonth() + File.separator + DateUtils.getNowDay();
            // 上传文件
            FTPClient ftp = new FTPClient();
            ftp.connect(yftpAddress, Integer.valueOf(yftpPort));
            ftp.login(yftpUsername, yftpPassword);
            int reply = ftp.getReplyCode();
            log.info("FTP连接返回：" + reply);
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
            }
//            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftp.setBufferSize(10240 * 10240);
            boolean flag = ftp.changeWorkingDirectory(mulu);
            if (!flag) {
                mkDir(mulu);
            }
            ftp.changeWorkingDirectory(mulu);
            success = ftp.storeFile(fileName_ftp, is);
            ftp.logout();
            is.close();
//            success = true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("FTP上传文件异常！" + e.getMessage());
        }
        return success;
    }


    /**
     * 选择上传的目录，没有创建目录
     *
     * @param ftpPath 需要上传、创建的目录
     * @return
     */
    public static boolean mkDir(String ftpPath) {
        if (!ftpClient.isConnected()) {
            return false;
        }
        try {
            // 将路径中的斜杠统一
            char[] chars = ftpPath.toCharArray();
            StringBuffer sbStr = new StringBuffer(256);
            for (int i = 0; i < chars.length; i++) {
                if ('\\' == chars[i]) {
                    sbStr.append('/');
                } else {
                    sbStr.append(chars[i]);
                }
            }
            ftpPath = sbStr.toString();
            // System.out.println("ftpPath:" + ftpPath);
            if (ftpPath.indexOf('/') == -1) {
                // 只有一层目录
                ftpClient.makeDirectory(new String(ftpPath.getBytes(), "iso-8859-1"));
                ftpClient.changeWorkingDirectory(new String(ftpPath.getBytes(), "iso-8859-1"));
            } else {
                // 多层目录循环创建
                String[] paths = ftpPath.split("/");
                for (int i = 0; i < paths.length; i++) {
                    ftpClient.makeDirectory(new String(paths[i].getBytes(), "iso-8859-1"));
                    ftpClient.changeWorkingDirectory(new String(paths[i].getBytes(), "iso-8859-1"));
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
