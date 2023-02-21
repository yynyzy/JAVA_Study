package thread_;

public class ThreadMethods02{
// 常用方法第二组
// 1.yield:线程的礼让。
//      让出 cpu，让其他线程执行，但礼让的时间不确定，所以也不一定礼让成功。
// 2.join: 线程的插队。
//      插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务。

    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        t4.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
            if(i==5){
                t4.join();
            }
        }

    }
}

class T4 extends Thread {
    @Override
    public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println("子线程-hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
