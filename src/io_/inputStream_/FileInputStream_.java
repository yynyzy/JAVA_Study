package io_.inputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ { // 字节流
    public static void main(String[] args) {

    }

    // 单个字节读取，效率低
    @Test
    public void readFile01() {
        String filePath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\test.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            // 创建 FileInputstream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            // 如果返回-1 ，表示读取完毕
            while((readData = fileInputStream.read()) != -1){
                System.out.println((char)readData); // 转换成 char
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    // 单个字节读取，效率低
    @Test
    public void readFile02() {
        String filePath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\test.txt";
        FileInputStream fileInputStream = null;
        byte[] buf = new byte[8]; // 一次读8个字节
        int bufLen = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            // 如果返回-1 ，表示读取完毕
            // 如果读取正常，返回实际读取的字节数
            while((bufLen = fileInputStream.read(buf)) != -1){
                System.out.println(new String(buf, 0, bufLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
