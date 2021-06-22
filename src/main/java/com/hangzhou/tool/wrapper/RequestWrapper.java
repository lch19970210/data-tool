//package com.hangzhou.tool.wrapper;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import java.io.*;
//import java.nio.charset.Charset;
//
//
///**
// * Request 包装类
// *
// * @Author linchenghui
// * @Date 2021/6/4
// */
//public class RequestWrapper {
//    /**
//     * 存储body数据的容器
//     */
//    private final byte[] body;
//
//    public RequestWrapper(HttpServletRequest request) {
//        super(request);
//
//        // 将body数据存储起来
//        String bodyStr = getBodyString(request);
//        body = bodyStr.getBytes(Charset.defaultCharset());
//    }
//
//    /**
//     * 获取请求Body
//     *
//     * @return requestBody requestBody
//     */
//    public String getBodyString() {
//        final InputStream inputStream = new ByteArrayInputStream(body);
//        return inputStream2String(inputStream);
//    }
//
//    /**
//     * 获取请求Body
//     *
//     * @param request request
//     * @return requestBody requestBody
//     */
//    public String getBodyString(final HttpServletRequest request) {
//        try {
//            return inputStream2String(request.getInputStream());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * 将 inputStream 里的数据读取出来转换成字符串
//     *
//     * @param inputStream inputStream
//     * @return String String
//     */
//    private String inputStream2String(InputStream inputStream) {
//        StringBuilder sb = new StringBuilder();
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                sb.append(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return sb.toString();
//    }
//
//}
