package io_.reader_;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReader_ {
    public static void main(String[] args) {

    }

    public void m1 () {
        String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\test.txt";
        FileReader fr = null;
        int data = 0;
        try {
            // 创建 FileReader 对象，用于读取文件
            fr = new FileReader(path);
            // 从该输入流读取一个字符的数据。
            // 如果返回-1 ，表示读取完毕
            while((data = fr.read()) != -1){
                System.out.println((char)data); // 转换成 char
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void m2 () {
        String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\test.txt";
        FileReader fr = null;
        char[] charArr = new char[8]; // 一次8个字符
        int len = 0;
        try {
            // 创建 FileReader 对象，用于读取文件
            fr = new FileReader(path);
            // 从该输入流读取一个字符的数据。
            // 如果返回-1 ，表示读取完毕
            while((len = fr.read(charArr)) != -1){
                System.out.println(new String(charArr, 0, len)); // 转换成 字符串
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
