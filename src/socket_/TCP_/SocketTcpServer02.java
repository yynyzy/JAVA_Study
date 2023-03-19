package socket_.TCP_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcpServer02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接。");
        Socket socket = serverSocket.accept();


        InputStream inputStream = socket.getInputStream();
        // IO读取，使用字符流, InputStreamReader 将 inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        OutputStream outputStream = socket.getOutputStream();
//        使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hi, client 字符流");
        bufferedWriter.flush(); ;
        socket.shutdownOutput();

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
