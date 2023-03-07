package io_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
       String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\test2.txt";
        FileWriter fileWriter = null;
        char[] chars = new char[]{'y', 'y', 'n'};
        try {
            fileWriter = new FileWriter(path); // true 追加模式， false 或者 默认 为覆盖模式

//            write(int):               写入单个字符
            fileWriter.write('H');

//            write(char[]):            写入指定数组
            fileWriter.write(chars);

//            write(char[],off,len):    写入指定数组的指定部分
            fileWriter.write("严zy严致远".toCharArray(), 0, 4);

//            write (string):           写入整个字符串
            fileWriter.write("aaa");

//            write(string,off,Len):    写入字符串的指定部分
            fileWriter.write("上海北京", 0,2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                对应FiLeWriter 一定要关闭流，或者flush才能真正的把数据写入到文件
//                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
