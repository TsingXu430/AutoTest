package com.tsingxu.httpclientTest;

import org.apache.http.client.fluent.Request;

import org.testng.annotations.Test;

import java.io.IOException;

public class httpclient {
    @Test
    public void get() throws IOException {
//        HttpGet httpGet = new HttpGet("http://www.baidu.com");
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
//        try {
//            System.out.println(httpResponse.getStatusLine());
//            HttpEntity entity = httpResponse.getEntity();
//            System.out.println(EntityUtils.toString(entity));
//            //System.out.println(entity.getContent());
//        }finally {
//            httpResponse.close();
//        }

        String s = Request.Get("http://localhost:8866/get")
                .connectTimeout(1000)
                .socketTimeout(1000)
                .execute().returnContent().asString();
        System.out.println(s);
    }
}
