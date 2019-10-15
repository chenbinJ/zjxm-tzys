package com.springboot.util;

import com.alibaba.fastjson.JSON;
import com.springboot.popj.register.HttpRequestMethedEnum;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParamHttpClientUtil {
    /**
     * httpclient使用步骤
     * 1、创建一个HttpClient对象;
     * 2、创建一个Http请求对象并设置请求的URL，比如GET请求就创建一个HttpGet对象，POST请求就创建一个HttpPost对象;
     * 3、如果需要可以设置请求对象的请求头参数，也可以往请求对象中添加请求参数;
     * 4、调用HttpClient对象的execute方法执行请求;
     * 5、获取请求响应对象和响应Entity;
     * 6、从响应对象中获取响应状态，从响应Entity中获取响应内容;
     * 7、关闭响应对象;
     * 8、关闭HttpClient.
     */

    private static RequestConfig requestConfig = RequestConfig.custom()
            //从连接池中获取连接的超时时间
            // 要用连接时尝试从连接池中获取，若是在等待了一定的时间后还没有获取到可用连接（比如连接池中没有空闲连接了）则会抛出获取连接超时异常。
            .setConnectionRequestTimeout(1135000)
            //与服务器连接超时时间：httpclient会创建一个异步线程用以创建socket连接，此处设置该socket的连接超时时间
            //连接目标url的连接超时时间，即客服端发送请求到与目标url建立起连接的最大时间。超时时间3000ms过后，系统报出异常
            .setConnectTimeout(1135000)
            //socket读数据超时时间：从服务器获取响应数据的超时时间
            //连接上一个url后，获取response的返回等待时间 ，即在与目标url建立连接后，等待放回response的最大时间，在规定时间内没有返回响应的话就抛出SocketTimeout。
            .setSocketTimeout(1135000)
            .build();


    /**
     * 发送http请求
     *
     * @param requestMethod 请求方式（HttpGet、HttpPost、HttpPut、HttpDelete）
     * @param url           请求路径
     * @param params        post请求参数
     * @param header        请求头
     * @return 响应文本
     */
    public static String sendHttp(HttpRequestMethedEnum requestMethod, String contentType, String url, Map<String, String> params, Map<String, String> header) {
        //1、创建一个HttpClient对象;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;
        String responseContent = null;
        //2、创建一个Http请求对象并设置请求的URL，比如GET请求就创建一个HttpGet对象，POST请求就创建一个HttpPost对象;
        HttpRequestBase request = requestMethod.createRequest(url);
        request.setConfig(requestConfig);
        //3、如果需要可以设置请求对象的请求头参数，也可以往请求对象中添加请求参数;
        if (header != null) {
            for (Map.Entry<String, String> entry : header.entrySet()) {
                request.setHeader(entry.getKey(), entry.getValue());
            }
        }
        // 往对象中添加相关参数
        try {
            if (params != null) {
                ((HttpEntityEnclosingRequest) request).setEntity(
                        new StringEntity(
                                JSON.toJSONString(params),
                                ContentType.create(contentType, "UTF-8")
                        )
                );
            }
            //4、调用HttpClient对象的execute方法执行请求;
            httpResponse = httpClient.execute(request);
            if (httpResponse != null) {
                //5、获取请求响应对象和响应Entity;
                HttpEntity httpEntity = httpResponse.getEntity();
                //6、从响应对象中获取响应状态，从响应Entity中获取响应内容;
                if (httpEntity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
                    responseContent = EntityUtils.toString(httpEntity, "UTF-8");
                } else {
                    //可以抛自定义异常
                    responseContent = "接口请求异常";
                    //自定义方法(有效),针对param（key-value）参数
                    ((HttpEntityEnclosingRequestBase) request).setEntity(new UrlEncodedFormEntity(getThisNameValuePairArray(params), "UTF-8"));
                    httpResponse = httpClient.execute(request);
                    if (httpResponse != null && httpResponse.getStatusLine().getStatusCode() == 200 && httpResponse.getEntity() != null) {
                        responseContent = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
                    }
                }
            } else {
                responseContent = "接口请求异常";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //7、关闭响应对象;
                if (httpResponse != null) {
                    httpResponse.close();
                }
                //8、关闭HttpClient.
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseContent;
    }

    public static StringEntity getThisStringEntity(Map<String, String> params, String contentType) {
        ContentType c = ContentType.create(contentType, "UTF-8");
        System.out.print(c.getCharset().name());
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        map2List(nvps, params);
        NameValuePair[] nvpsArray = new NameValuePair[nvps.size()];
        for (int i = 0; i < nvps.size(); i++) {
            nvpsArray[i] = nvps.get(i);
        }
        c.withParameters(nvpsArray);
        return new StringEntity(JSON.toJSONString(params), c);
    }

    public static List<NameValuePair> getThisNameValuePairArray(Map<String, String> params) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        map2List(nvps, params);
        return nvps;
    }

    /**
     * 参数转换，将map中的参数，转到参数列表中
     *
     * @param nvps 参数列表
     * @param map  参数列表（map）
     */
    public static void map2List(List<NameValuePair> nvps, Map<String, String> map) {
        if (map == null) return;
        // 拼接参数
        for (Map.Entry<String, String> entry : map.entrySet()) {
            nvps.add(new BasicNameValuePair(entry.getKey(), entry
                    .getValue()));
        }
    }
}
