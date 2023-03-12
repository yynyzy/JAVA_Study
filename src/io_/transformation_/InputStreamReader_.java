package io_.transformation_;

import java.io.*;

//        转换流-InputStreamReader 和 OutputStreamWriter
//        1.InputStreamReader:Reader 的子类，可以将 InputStream(字节流)包装成 Reader(字符流)
//        2.OutputStreamWriter:Writer 的子类，实现将 OutputStream(字节流)包装成 Writer(字符流)
//        3.当处理纯文本数据时，如果使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流转换成字符流
//        4.可以在使用时指定编码格式(比如 utf-8,gbk，gb2312,ISO8859-1 等)

public class InputStreamReader_ {
    // 将 字节流 FileInputStream 转为字符流

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\maiscrm\\Desktop\\tx2222.txt"; // 打开一个保存为 GBK 编码格式的文件
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "GBK"));
        String str = bufferedReader.readLine();
        System.out.println("读取内容="+ str);
        bufferedReader.close();
    }
}
