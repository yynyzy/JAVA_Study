package io_.printStream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    // 打印流
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        // 在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        out.print("john, hello");

        // 因为print底层使用的是write ，所以我们可以直接调用write进行打印输出
        out.write("yzy,你好".getBytes());

        // 我们可以去修改打印流输出的位置/设备
        // 修改成到"C:\Users\maiscrm\Desktop\f1.txt")
        System.setOut(new PrintStream("C:\\Users\\maiscrm\\Desktop\\f1.txt"));
        System.out.println("yyn,hello");
        out.close();
    }
}
