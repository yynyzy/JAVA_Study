package io_.file_;


import java.io.File;
import java.io.IOException;

public class FileCreate_ {
// 常用的文件操作
// 创建文件对象相关构造器和方法相关方法
// new File(String pathname)                // 根据路径构建一个File对象
// new File(File parent,String child)       // 根据父目录文件+子路径构建
// new File(String parent,String child)     // 根据父目录+子路径构建

    public static void main(String[] args) {
    }

// 方式1： new File(String pathname) 根据路径构建一个File对象

    public void createFile1() {
        File file01 = new File("C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\myFile01.txt");
        try {
            file01.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 方式2： new File(File parent,String child)   根据父目录文件+子路径构建

    public void createFile2() {
        File parentFile = new File("C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_");
        String filename = "myFile02.txt";
        File file = new File(parentFile, filename);
        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 方式3： new File(String parent,String child)   根据父目录+子路径构建

    public void createFile3() {
        String parentFile = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_";
        String filename = "myFile03.txt";
        File file = new File(parentFile, filename);
        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
