package io_.reader_;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    // BufferedReader 和 BufferedWriter 属于字符流，是按照字符来读取数据的

    public static void main(String[] args) throws Exception {
        new BufferedReader_().bufRead();
    }

    @Test
    public void bufRead() throws Exception {
        String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\FileReader_.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line = ""; // 按行读取，效率高
//        返回 null 表示读取完毕
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
//        关闭 bufferedReader 流，会帮你关闭 FileReader流
        bufferedReader.close();
    }
}
