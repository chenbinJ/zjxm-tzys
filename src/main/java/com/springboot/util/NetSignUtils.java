package com.springboot.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class NetSignUtils {

    @Value("${penghao.contractinformation.ip}")
    private String ip;//ip
    @Value("${penghao.contractinformation.port}")
    private String port;//端口
    @Value("${penghao.contractinformation.region}")
    private String region;//地区


    public static void main(String[] args) throws Exception {
//        List<String> stringList=new ArrayList<>();
//        String htxx=spfyght("2019062570014");
//        String qlrxx=spfQlrxx("2019062570014");
//        stringList.add(htxx);
//        stringList.add(qlrxx);
    }

    /**
     * 二手房合同信息
     *
     * @param clhtbah
     * @return
     * @throws Exception
     */
    public String esfyght(String clhtbah) throws Exception {
        //soap服务地址
        String soapXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
                + "<soap12:Body>" + "<CLF_FC_CLMMHT>" + "<sParams>" + "CLHTBAH="
                + clhtbah + "</sParams>" + "</CLF_FC_CLMMHT>" + "</soap12:Body>" + "</soap12:Envelope>";

        return client(soapXml);
    }





    /**
     * 获取买卖双方信息
     *
     * @param clhtbah
     * @return
     * @throws Exception
     */
    public String esfsfxx(String clhtbah) throws Exception {
        //soap服务地址

        String soapXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
                + "<soap12:Body>" + "<FC_GFQLRXX>" + "<sParams>" + "HTBAH="
                + clhtbah + "</sParams>" + "</FC_GFQLRXX>" + "</soap12:Body>" + "</soap12:Envelope>";

        return client(soapXml);
    }


    /**
     * 商品房合同信息
     *
     * @param contractNumber
     * @return
     * @throws Exception
     */
    public String spfyght(String contractNumber) throws Exception {
        //soap服务地址

        String soapXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
                + "<soap12:Body>" + "<FC_SPFYGHT>" + "<sParams>" + "HTBH="
                + contractNumber + ",SPFHTBAH=" + contractNumber + "</sParams>" + "</FC_SPFYGHT>" + "</soap12:Body>" + "</soap12:Envelope>";

        return client(soapXml);
    }

    /**
     * 商品房权利人信息
     *
     * @param contractNumber
     * @return
     * @throws Exception
     */
    public String spfQlrxx(String contractNumber) throws Exception {
        //soap服务地址
//        String url = "http://"+ip+":"+port+"/"+region+"/BDCSrv.asmx?wsdl";
        String soapXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
                "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
                + "<soap12:Body>" + "<SPF_FC_CLMMHT>" + "<sParams>" + "HTBAH="
                + contractNumber + "</sParams>" + "</SPF_FC_CLMMHT>" + "</soap12:Body>" + "</soap12:Envelope>";

        return client(soapXml);
    }

    /**
     * 商品房权利人信息
     * @param
     * @return
     * @throws Exception
     */
    public String clfDsxx(String serviceMethod,String swjgdm,String swrydm,String htbh,String url,String from_user,String api_id) throws Exception {
        //soap服务地址
//        String url = "http://"+ip+":"+port+"/"+region+"/BDCSrv.asmx?wsdl";
        String soapXml = "<service xmlns=\"http://www.chinatax.gov.cn/spec/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "    <head>\n" +
                "        <serviceMethod>"+serviceMethod+"</serviceMethod>\n" +
                "        <swjgdm>"+swjgdm+"</swjgdm>\n" +
                "        <swrydm>"+swrydm+"</swrydm>\n" +
                "    </head>\n" +
                "<body>\n" +
                "        <![CDATA[{\"HTBH\":\""+htbh+"\"}]]>\n" +
                "    </body>\n"+
                "</service>\n";
        return clientSoap(soapXml,url,from_user,api_id);
    }


    public String clientSoap(String soapXml,String url,String from_user,String api_id) throws Exception {
        //创建httpcleint对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //String url = "http://" + ip + ":" + port + "/" + region + "/BDCSrv.asmx?wsdl";
        //创建http Post请求
        HttpPost httpPost = new HttpPost(url);
        String str = "";
        // 构建请求配置信息
        RequestConfig config = RequestConfig.custom().setConnectTimeout(1000) // 创建连接的最长时间
                .setConnectionRequestTimeout(500) // 从连接池中获取到连接的最长时间
                .setSocketTimeout(3 * 5000) // 数据传输的最长时间10s
                .build();
        httpPost.setConfig(config);
        CloseableHttpResponse response = null;
        try {
            //采用SOAP1.1调用服务端，这种方式能调用服务端为soap1.1和soap1.2的服务
//            httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
//            httpPost.setHeader("SOAPAction", "");
            //采用SOAP1.2调用服务端，这种方式只能调用服务端为soap1.2的服务
            httpPost.setHeader("Content-Type", "application/soap+xml;charset=UTF-8");
            httpPost.setHeader("from_user",from_user);
            httpPost.setHeader("api_id",api_id);
            StringEntity stringEntity = new StringEntity(soapXml, Charset.forName("UTF-8"));
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(content);
                return content;
            } else {
                System.out.println("调用失败!" + response.getStatusLine().toString());
                return str;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        } finally {
            if (null != response) {
                response.close();
            }
            if (null != httpClient) {
                httpClient.close();
            }
        }

    }




    public String client(String soapXml) throws Exception {
        //创建httpcleint对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "http://" + ip + ":" + port + "/" + region + "/BDCSrv.asmx?wsdl";
        //创建http Post请求
        HttpPost httpPost = new HttpPost(url);
        String str = "";
        // 构建请求配置信息
        RequestConfig config = RequestConfig.custom().setConnectTimeout(1000) // 创建连接的最长时间
                .setConnectionRequestTimeout(500) // 从连接池中获取到连接的最长时间
                .setSocketTimeout(3 * 1000) // 数据传输的最长时间10s
                .build();
        httpPost.setConfig(config);
        CloseableHttpResponse response = null;
        try {
            //采用SOAP1.1调用服务端，这种方式能调用服务端为soap1.1和soap1.2的服务
//            httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
//            httpPost.setHeader("SOAPAction", "");
            //采用SOAP1.2调用服务端，这种方式只能调用服务端为soap1.2的服务
            httpPost.setHeader("Content-Type", "application/soap+xml;charset=UTF-8");
            StringEntity stringEntity = new StringEntity(soapXml, Charset.forName("UTF-8"));
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(content);
                return content;
            } else {
                System.out.println("调用失败!" + response.getStatusLine().toString());
                return str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != response) {
                response.close();
            }
            if (null != httpClient) {
                httpClient.close();
            }
        }
        return str;
    }


}
