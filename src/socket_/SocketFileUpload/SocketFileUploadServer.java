package socket_.SocketFileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketFileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        String filePath = "src/main/java/socket_/SocketFileUpload/b.png";
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = UtilTool.StreamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        System.out.println("文件上传完毕");
        bos.close();


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片~");
        bufferedWriter.flush();
        socket.shutdownOutput();

        bufferedWriter.close();
        bis.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
