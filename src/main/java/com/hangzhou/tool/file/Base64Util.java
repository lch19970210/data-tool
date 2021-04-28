package com.hangzhou.tool.file;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class Base64Util {
    static BASE64Encoder encoder = new sun.misc.BASE64Encoder();
    static BASE64Decoder decoder = new sun.misc.BASE64Decoder();

    public static void main(String[] args) throws IOException {

        // 将PDF格式文件转成base64编码
//        String base64String = getPDFBinary(new File("/Users/faye/资料/华云/台州宏创需求/测试文档.pdf"));
//        System.out.println(base64String.replaceAll("[\\s*\t\n\r]", ""));
//        StringBuffer buffer = new StringBuffer();
//        BufferedReader bf = new BufferedReader(new FileReader(""));
//        String str = null;
//        while ((str = bf.readLine()) != null){
//            buffer.append(str.trim());
//        }
//
        String base64String = "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XDAwMHJcMDAwZFwwMDAgXDAwMC1cMDAwIGWHaGNcMDAwMSkKL1Byb2R1Y2VyICj+/1wwMDBtXDAwMGFcMDAwY1wwMDBPXDAwMFNcMDAwIHJIZyxcMDAwMVwwMDAwXDAwMC5cMDAwMVwwMDA2/1wwMTBySFP3XDAwMDJcMDAwMFwwMDBEXDAwMDlcMDAwMf9cMDExXDAwMCBcMDAwUVwwMDB1XDAwMGFcMDAwclwwMDB0XDAwMHpcMDAwIFwwMDBQXDAwMERcMDAwRlwwMDBDXDAwMG9cMDAwblwwMDB0XDAwMGVcMDAweFwwMDB0KQovQ3JlYXRvciAoV29yZCkgL0NyZWF0aW9uRGF0ZSAoRDoyMDIxMDQyODAxMjUwOVowMCcwMCcpIC9Nb2REYXRlIChEOjIwMjEwNDI4MDEyNTA5WjAwJzAwJykKPj4KZW5kb2JqCnhyZWYKMCAxNAowMDAwMDAwMDAwIDY1NTM1IGYgCjAwMDAwMDA2OTggMDAwMDAgbiAKMDAwMDAwMzY0NiAwMDAwMCBuIAowMDAwMDAwMDIyIDAwMDAwIG4gCjAwMDAwMDA4MDIgMDAwMDAgbiAKMDAwMDAwMzYxMSAwMDAwMCBuIAowMDAwMDAwMDAwIDAwMDAwIG4gCjAwMDAwMDM3NzggMDAwMDAgbiAKMDAwMDAwMDg5OSAwMDAwMCBuIAowMDAwMDAzNzI5IDAwMDAwIG4gCjAwMDAwMDQyODggMDAwMDAgbiAKMDAwMDAwMzk2NCAwMDAwMCBuIAowMDAwMDA0NTMyIDAwMDAwIG4gCjAwMDAwMDg5MTggMDAwMDAgbiAKdHJhaWxlcgo8PCAvU2l6ZSAxNCAvUm9vdCA5IDAgUiAvSW5mbyAxMyAwIFIgL0lEIFsgPDg3MjVlM2JjMjVhOTFlNWM2YTg2NDdiMmMxM2M5NGFhPgo8ODcyNWUzYmMyNWE5MWU1YzZhODY0N2IyYzEzYzk0YWE+IF0gPj4Kc3RhcnR4cmVmCjkzNDAKJSVFT0YK";

        String pathName = "/Users/faye/资料/华云/台州宏创需求/ccc.pdf";
        // 将base64的编码转成PDF格式文件
        base64StringToPDF(base64String,pathName);
    }

    static byte[] getPDF(File file) {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bout = null;
        try {
            // 建立读取文件的文件输出流
            fin = new FileInputStream(file);
            // 在文件输出流上安装节点流（更大效率读取）
            bin = new BufferedInputStream(fin);
            // 创建一个新的 byte 数组输出流，它具有指定大小的缓冲区容量
            baos = new ByteArrayOutputStream();
            // 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
            bout = new BufferedOutputStream(baos);
            byte[] buffer = new byte[1024];
            int len = bin.read(buffer);
            while (len != -1) {
                bout.write(buffer, 0, len);
                len = bin.read(buffer);
            }
            // 刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
            bout.flush();
            byte[] bytes = baos.toByteArray();
            return bytes;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                bin.close();
                // 关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException
                // IOException
                // baos.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     *  将PDF转换成base64编码
     *  1.使用BufferedInputStream和FileInputStream从File指定的文件中读取内容；
     *  2.然后建立写入到ByteArrayOutputStream底层输出流对象的缓冲输出流BufferedOutputStream
     *  3.底层输出流转换成字节数组，然后由BASE64Encoder的对象对流进行编码
     * */
    static String getPDFBinary(File file) {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bout = null;
        try {
            // 建立读取文件的文件输出流
            fin = new FileInputStream(file);
            // 在文件输出流上安装节点流（更大效率读取）
            bin = new BufferedInputStream(fin);
            // 创建一个新的 byte 数组输出流，它具有指定大小的缓冲区容量
            baos = new ByteArrayOutputStream();
            // 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
            bout = new BufferedOutputStream(baos);
            byte[] buffer = new byte[1024];
            int len = bin.read(buffer);
            while (len != -1) {
                bout.write(buffer, 0, len);
                len = bin.read(buffer);
            }
            // 刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
            bout.flush();
            byte[] bytes = baos.toByteArray();
            // sun公司的API
            return encoder.encodeBuffer(bytes).trim().replaceAll("[\\s*\t\n\r]", "");
            // apache公司的API
            // return Base64.encodeBase64String(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                bin.close();
                // 关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException
                // IOException
                // baos.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 将base64编码转换成PDF
     *
     * @param base64sString
     *            1.使用BASE64Decoder对编码的字符串解码成字节数组
     *            2.使用底层输入流ByteArrayInputStream对象从字节数组中获取数据；
     *            3.建立从底层输入流中读取数据的BufferedInputStream缓冲输出流对象；
     *            4.使用BufferedOutputStream和FileOutputSteam输出数据到指定的文件中
     *
     * @param pathName 类似:D:\IdeaProjects\sign_api_test\src\main\resources\files\ccc.pdf
     */
    static void base64StringToPDF(String base64sString,String pathName) {
        BufferedInputStream bin = null;
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try {
            // 将base64编码的字符串解码成字节数组
            byte[] bytes = decoder.decodeBuffer(base64sString);
            // apache公司的API
            // byte[] bytes = Base64.decodeBase64(base64sString);
            // 创建一个将bytes作为其缓冲区的ByteArrayInputStream对象
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            // 创建从底层输入流中读取数据的缓冲输入流对象
            bin = new BufferedInputStream(bais);
            // 指定输出的文件
            File file = new File(pathName);
            // 创建到指定文件的输出流
            fout = new FileOutputStream(file);
            // 为文件输出流对接缓冲输出流对象
            bout = new BufferedOutputStream(fout);

            byte[] buffers = new byte[1024];
            int len = bin.read(buffers);
            while (len != -1) {
                bout.write(buffers, 0, len);
                len = bin.read(buffers);
            }
            // 刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
            bout.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bin.close();
                fout.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
