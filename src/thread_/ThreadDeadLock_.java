package thread_;

public class ThreadDeadLock_ {
    public static void main(String[] args) {
        // 线程死锁
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(false); // 锁是放在静态对象上的，所以可以用 extends
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(true);
        deadLockDemo1.start();
        deadLockDemo2.start();
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {//对象互斥锁，下面就是同步代码
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) { // 这里获得Li对象的监视权
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) { // 这里获得Li对象的监视权
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
