package socket_.TCP_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTcpClient01 {
    public static void main(String[] args) throws IOException {
        // 1.连接服务端 (ip, 端口) 连接本机的 9999 端口，如果连接成功，返回Socket对象
        // 因为是服务端测试在本地，所以用本地ip
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket 返回" + socket.getClass());
        // 2.连接上后，生成Socket，通过socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
        // 3.通过输出流，写入数据到 数据通道
        outputStream.write("hi, server".getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        // 设置写入结束标记
        // 也可以用 writer.newLine 换行符，注意需要使用 readLine() 读
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bf = new byte[1024];
        int bfLen = 0;
        while (( bfLen = inputStream.read(bf)) != -1){
            System.out.println(new String(bf, 0, bfLen));
        }

        // 4.关闭流对象和socket，必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭");
    }
}
