package com.springboot.util;

import lombok.extern.slf4j.Slf4j;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;


import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
@Slf4j
public class HttpClientUtils {


    protected Charset charset;



    /**
     *
     * @author:            zhrb
     * @Title:             getXmlInfo
     * @Description:       TODO 接收数据,拼接生成请求报文
     * @param:             @param dataMap,内含ip,disPhone,email
     * @param:             @return
     * @return:            String
     * @throws
     */
    public static   String getXmlInfo(Map<String, Object> dataMap) {
        Date newDate = new Date();
        SimpleDateFormat smpDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        String formatString = smpDateFormat.format(newDate);
        String serviceMethod   = "";
        String swjgdm= "";
        String swrydm      = "";
        String htbh      = "";
        //服务层传参,登录用户的ip地址
        serviceMethod = dataMap.get("serviceMethod").toString();
        //服务层传参,新增用户的手机号
        swjgdm = dataMap.get("swjgdm").toString();
        //pwd = dataMap.get("pwd").toString();
        //不传输,直接从配置文件中获取
        swrydm = dataMap.get("swrydm").toString();
        //htbh = dataMap.get("htbh").toString();
        // TODO 动态传入参数
        StringBuilder sb = new StringBuilder();
        sb.append("<service xmlns=\"http://www.chinatax.gov.cn/spec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"+"\n");
        sb.append("    <head>"+"\n");
        sb.append("        <serviceMethod>"+serviceMethod+"</serviceMethod>"+"\n");
        sb.append("        <swjgdm>"+swjgdm+"</swjgdm>"+"\n");
        sb.append("        <swrydm>"+swrydm+"</swrydm> "+"\n");
        sb.append("    </head>"+"\n");
        sb.append("    <body>"+"\n");
        sb.append("<![CDATA[{\"HTBH\":\"2320120180404946623\"}]]>"+"\n");
        sb.append("    </body>"+"\n");
        sb.append("</service>");
        return sb.toString();
    }



    public static String getJsonData(JSONObject jsonParam, String urls) {
        StringBuffer sb = new StringBuffer();
        try {
            // 创建url资源
            URL url = new URL(urls);
            // 建立http连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置允许输出
            conn.setDoOutput(true);
            // 设置允许输入
            conn.setDoInput(true);
            // 设置不用缓存
            conn.setUseCaches(false);
            // 设置传递方式
            conn.setRequestMethod("POST");
            // 设置维持长连接
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            conn.setRequestProperty("Connection", "Keep-Alive");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 设置文件字符集:
            conn.setRequestProperty("Charset", "UTF-8");
            // 转换为字节数组
            byte[] data = (jsonParam.toString().getBytes("utf-8"));
            // 设置文件长度
            conn.setRequestProperty("Content-Length", String.valueOf(data.length));
//            // 设置文件类型:
//            conn.setRequestProperty("contentType", "application/json");
            // 开始连接请求
            conn.connect();
            DataOutputStream out = new DataOutputStream(conn
                    .getOutputStream());// 打开输出流往对端服务器写数据
            // 写入请求的字符串
            out.write(jsonParam.toString().getBytes("utf-8"));
            out.flush();
            out.close();
            System.out.println(conn.getResponseCode());

            // 请求返回的状态
            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()) {
                System.out.println("连接成功");
                // 请求返回的数据
                InputStream in1 = conn.getInputStream();
                try {
                    String readLine = new String();
                    BufferedReader responseReader = new BufferedReader(new InputStreamReader(in1, "UTF-8"));
                    while ((readLine = responseReader.readLine()) != null) {
                        sb.append(readLine).append("\n");
                    }
                    responseReader.close();
                    System.out.println(sb.toString());

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                System.out.println("error++");
            }
        } catch (Exception e) {
            e.getStackTrace();
            log.error(e.getMessage());
        }
        System.out.println("返回结果" + sb.toString());
        return sb.toString();
    }

    private List<NameValuePair> map2NameValuePairList(Map<String, Object> params) throws IOException {
        if (params != null && !params.isEmpty()) {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator<String> it = params.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                if (params.get(key) != null) {
                    String value = String.valueOf(params.get(key));
                    list.add(new BasicNameValuePair(key, value));
                }
            }
            return list;
        }
        return null;
    }


    public String paramGet(String url) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = "";
        try {
            // 通过址默认配置创建一个httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建httpGet远程连接实例
            HttpGet httpGet = new HttpGet(url);
            // 设置请求头信息，鉴权
            // 设置配置请求参数
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(35000)// 连接主机服务超时时间
                    .setConnectionRequestTimeout(35000)// 请求超时时间
                    .setSocketTimeout(60000)// 数据读取超时时间
                    .build();
            // 为httpGet实例设置配置
            httpGet.setConfig(requestConfig);
            // 执行get请求得到返回对象
            response = httpClient.execute(httpGet);
            // 通过返回对象获取返回数据
            HttpEntity entity = response.getEntity();
            // 通过EntityUtils中的toString方法将结果转换为字符串
            result = EntityUtils.toString(entity);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }









    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url 发送请求的URL
     * @param
     * @return URL 所代表远程资源的响应结果
     */
    public String doGet(String url, Map<String, Object> params, Map<String, String> header) throws Exception {
        String body = null;
        try {
            // Get请求
            log.debug("protocol: GET");
            HttpGet httpGet = new HttpGet(url.trim());
            // 设置参数
            if (params != null && !params.isEmpty()) {
                String str = EntityUtils.toString(new UrlEncodedFormEntity(map2NameValuePairList(params)),HTTP.UTF_8);
//                String str = EntityUtils.toString(new UrlEncodedFormEntity(map2NameValuePairList(params), "UTF-8"));
                String uri = httpGet.getURI().toString();
                if (uri.indexOf("?") >= 0) {
                    httpGet.setURI(new URI(httpGet.getURI().toString() + "&" + str));
                } else {
                    httpGet.setURI(new URI(httpGet.getURI().toString() + "?" + str));
                }
            }
            log.debug("     url: " + httpGet.getURI());
            // 设置Header
            if (header != null && !header.isEmpty()) {
                log.debug("   header: " + header);
                for (Iterator<Map.Entry<String, String>> it = header.entrySet().iterator(); it.hasNext(); ) {
                    Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
                    httpGet.setHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }
            // 发送请求,获取返回数据
            body = execute(httpGet);
        } catch (Exception e) {
            throw e;
        }
        log.debug("  result: " + body);
        return body;
    }

    private String execute(HttpRequestBase requestBase) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String body = null;
        try {
            CloseableHttpResponse response = httpclient.execute(requestBase);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    body = EntityUtils.toString(entity, HTTP.UTF_8);
                }
                EntityUtils.consume(entity);
            } catch (Exception e) {
                throw e;
            } finally {
                response.close();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            httpclient.close();
        }
        return body;
    }
}
