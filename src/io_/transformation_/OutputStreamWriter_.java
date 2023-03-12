package io_.transformation_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\maiscrm\\Desktop\\test3.txt";
        String charset = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), charset);
        osw.write("yzy严一");
        osw.close();
        System.out.println("保存文件成功");
    }
}
