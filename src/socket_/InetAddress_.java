package socket_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        // 1.获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 2.根据指定主机名 获取 InetAddress对象
        InetAddress byName = InetAddress.getByName("DESKTOP-9DH5BMO");
        System.out.println("host 1=" + byName);

        // 3.根据域名返回 InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);   // www.baidu.com/180.101.50.242

        // 4.通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress(); // IP

        // 5.通过 InetAddress 对象，获取对应的主机名/或者的域名
         String hostName = host2.getHostName();
         System.out.println("host2对应的主机名/域名=" + hostName);
    }
}
