package socket_.TCP_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTcpClient02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket 返回" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();

        // 3.通过输出流，写入数据到数据通道，使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hi, server 字符流");
//        bufferedWriter.newLine(); // 插入一个换行符，表示写入的内容结束
        bufferedWriter.flush(); ; // 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端关闭");
    }
}
