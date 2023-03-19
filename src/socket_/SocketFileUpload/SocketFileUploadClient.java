package socket_.SocketFileUpload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketFileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        String filePath = "src/main/java/socket_/SocketFileUpload/a.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = UtilTool.StreamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String s = UtilTool.StreamToString(inputStream);
        System.out.println(s);

        inputStream.close();
        bos.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
