package thread_;

public class ThreadSynchronized_ {
//    线程同步机制
//    线程同步，即当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，
//    直到该线程完成操作，其他线程才能对该内存地址进行操作。

    public static void main(String[] args) {
        SellTickets sellTickets = new SellTickets();
        Thread st1 = new Thread(sellTickets);
        Thread st2 = new Thread(sellTickets);
        Thread st3 = new Thread(sellTickets);
        st1.start();
        st2.start();
        st3.start();
    }
}

//同步具体方法-Synchronized
//        1.同步代码块
//          synchronized (对象){ // 得到对象的锁，才能操作同步代码
//              需要被同步代码;
//          }
//
//        2.synchronized还可以放在方法声明中，表示整个方法-为同步方法
//          public synchronized void m (String name){
//              需要被同步的代码
//          }


// 售票问题

class SellTickets implements Runnable{
    private int count = 100;
    private boolean loop = true;

    Object obj = new Object();
    //    private synchronized void sell() 是一个同步方法
    //    锁在 this 对象上
    //    也可以在代码块上写 synchronize, 同步代码块
    private /* synchronized */ void sell() throws InterruptedException {


        synchronized (/*this*/ obj) {
            if(count <= 0 ){
                System.out.println("售票完毕");
                loop = false;
                return;
            };
            System.out.println("窗口" + Thread.currentThread().getName() + "卖出一张票"
                    + "剩余" + (--count) + "张票");
            Thread.sleep(100);
        }
    }

    //  同步方法(静态的) 的锁为当前类本身
    //  1.public synchronized static void m1() {} 的锁是加在 SellTickets.class
    public synchronized static void m1() {}
    public  static void m2() {
        synchronized (SellTickets.class){

        }
    }
    @Override
    public void run() {
        while(loop){
            try {
                sell();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
