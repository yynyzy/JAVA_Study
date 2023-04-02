package io_;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_ {
    public static void main(String[] args) {

    }
    public void fileCopy() {
        String targetFilePath = "C:\\Users\\maiscrm\\Desktop\\优诺美rolex.png";
        String destFilePath = "C:\\Users\\maiscrm\\Pictures\\Saved Pictures";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(targetFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1) {
                // 边读边写
                fileOutputStream.write(buf, 0, readLen); // 不能直接 write(buf) 一位可能buf没读满 1024， 会把空byte读进去

            }
            System.out.println("copy 完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
