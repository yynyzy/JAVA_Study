package socket_.TCP_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTcpServer01 {
    public static void main(String[] args) throws IOException {
        // 1.在本机的 9999 端口监听，等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接。");
        // 2.当没有客户端连接 9999 端口时，程序会阻塞，等待连接
        // 如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bf = new byte[1024];
        int bfLen = 0;
        while ((bfLen = inputStream.read(bf)) != -1){
            System.out.println(new String(bf, 0, bfLen));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("client end".getBytes(StandardCharsets.UTF_8));

        // 设置写入结束标记
        socket.shutdownOutput();

        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
