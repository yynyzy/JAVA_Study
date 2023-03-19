package socket_.UDP_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.HashMap;

public class UdpReceiverA {
    public static void main(String[] args) throws IOException {
        // 1.创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        // 2.构建一个 DatagramPacket 对象，准备接收数据(一个数据包最大 64k)
        byte[] bf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bf, 0, bf.length);
        // 3.调用接收方法，将通过网络传输的 DatagramPacket 对象填充到 packet对象
        // 当有数据包发送到 本机的9999端口时，就会接收到数据, 如果没有，就会阻塞等待。
        System.out.println("接收端A等待接收");
        socket.receive(packet);
        // 4.可以把 packet 进行拆包，取出数据显示。
        int len = packet.getLength(); // 实际长度
        byte[] data = packet.getData();
        String s = new String(data, 0, len);
        System.out.println("A get：" + s);

        // 回复信息
        byte[] replyMsg = "l am A. I Received".getBytes();
        DatagramPacket replyPacket =
                new DatagramPacket(replyMsg, replyMsg.length, InetAddress.getByName("192.168.5.132"), 9998);
        socket.send(replyPacket);

        socket.close();
        System.out.println("接收端A退出");
    }
}
