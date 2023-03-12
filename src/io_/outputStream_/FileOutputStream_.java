package io_.outputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1 () {
        String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\test2.txt";
        FileOutputStream file = null;
        try {
//            1.new FileOutputstream(filePath)创建方式，当写入内容是，会覆盖原来的内容
//            2. new FileOutputStream(filePath，true) 创建方式，当写入内容是，是追加到文件后面
            file = new FileOutputStream(path, true);

//            1.输入一个字符
//          file.write('y');

//            2.输入字符串(字符串 -> Byte数组)
            String str = "严zy严yn";
//            file.write(str.getBytes(StandardCharsets.UTF_8));

//            3.输入字符串的某一部分(注意长度，中文3字符，输入字符长度为2时，就会出现乱码)
            file.write(str.getBytes(StandardCharsets.UTF_8), 0, 4);

            System.out.println("输入完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
