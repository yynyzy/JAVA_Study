package io_.file_;


import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    // 文件存在则删除文件

    public void deleteFile() {
        String path = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\myFile02.txt";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件不存在");
        }
    }

    // 判断 目录是否存在，如果存在就删除，否则就示不存在
    public void m2() {
        String directoryPath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\test2";
        File file = new File(directoryPath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(directoryPath + "删除成功..");
            } else {
                System.out.println(directoryPath + "删除失败...");
            }

        } else {
            System.out.println(directoryPath + "存在..");
        }
    }

    // 判断 目录是否存在，如果存在就提示已经存在，否则就创建 test2

    public void m3() {
        String directoryPath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\test2";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            // mkdirs() 创建多级目录
            // mkdir() 创建一级目录
            if (file.mkdirs()) {
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }
    }
}
