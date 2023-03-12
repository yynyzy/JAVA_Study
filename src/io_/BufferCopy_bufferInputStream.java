package io_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferCopy_bufferInputStream {
    public static void main(String[] args) {

    }

    // 按字符流, 不可以处理二进制文件
    @Test
    public void m1() {
        String targetPath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\FileReader_.java";
        String destinePath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\yyn\\study\\io_\\FileReader_Copy.java";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(targetPath));
            bufferedWriter = new BufferedWriter(new FileWriter(destinePath));
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    // 按字节流
    @Test
    public void m2() {
        String srcPath = "C:\\Users\\maiscrm\\Desktop\\优诺能-蕴荟-内3.7.png";
        String destPath = "C:\\Users\\maiscrm\\Desktop\\copytest.png";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            byte[] buff = new byte[1024];
            int readlen = 0;
            while((readlen = bis.read(buff)) != -1){
                bos.write(buff, 0, readlen);
            }
            System.out.println("文件拷贝完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null){
                    bis.close();
                }
                if(bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
