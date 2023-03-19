package socket_.UDP_;

import java.io.IOException;
import java.net.*;

public class UdpSenderB {
    public static void main(String[] args) throws IOException {
        //1。创建 DatagramSocket 对象，准备在9998端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] data = "l am B. hi, 严zy~".getBytes();
        // 2.将需要发送的数据，封装到 DatagramPacket 对象
        // 封装的 DatagramPacket 对象 (data 内容字节数组 ，data.length ，主机(IP) ，端口)
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.5.132"), 9999);
        socket.send(packet);

        byte[] receiveMsg = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveMsg, receiveMsg.length);
        socket.receive(receivePacket);
        byte[] msgData = receivePacket.getData();
        int len = receivePacket.getLength();
        String s = new String(msgData,0, len);
        System.out.println("B get:" + s);

        socket.close();
        System.out.println("发送端B退出");

    }
}
