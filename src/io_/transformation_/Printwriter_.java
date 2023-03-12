package io_.transformation_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter_ {
    public static void main(String[] args) throws IOException {
//PrintWriter printlriter = new Printlriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\maiscrm\\Desktop\\f1.txt"));
        printWriter.print("hi，北京你好~");
        printWriter.close();
    }
}
