package io_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\test.txt";
//        创建BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true)); // 创建里面的节点流时加true表示追加
        bufferedWriter.write("hello");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello2");
//        说明: 关闭外层流即可 ， 传入的 new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();
    }
}
