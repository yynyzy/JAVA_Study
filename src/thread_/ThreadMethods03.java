package thread_;

public class ThreadMethods03 {
//    线程常用方法
//    用户线程和守护线程
//    1.用户线程:也叫工作线程，当线程的任务执行完或通知方式结束
//    2守护线程:一般是为工作线程服务的，当所有的用户线程结束，守护线程自动结束
//    3.常见的守护线程: 垃圾回收机制

    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        // 如果我们希望当main线程结束后，子线程自动结束
        // 只需将子线程设为守护线程即可myDaemonThread.setDaemon(true)
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程");
            Thread.sleep(1000);
        }

    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;) {
            System.out.println("子线程-hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
