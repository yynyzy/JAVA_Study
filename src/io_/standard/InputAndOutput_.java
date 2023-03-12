package io_.standard;

import java.util.Scanner;

public class InputAndOutput_ {
    public static void main(String[] args) {

//        System 类 的 public final static InputStream in = null;
//        System.in 编译类型InputStream
//        System.in 运行类型BufferedInputStream
//        表示标准输入 键盘
         System.out.println(System.in.getClass());

//        1. System.out public final static PrintStream out = null;
//        2，编详类型 PrintStream
//        3，运行类型 PrintStream
//        表示标准输出 显示器
        System.out.println(System.out.getClass());

        new Scanner(System.in); // 控制输入
    }
}
