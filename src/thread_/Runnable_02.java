package thread_;

public class Runnable_02 {
    public static void main(String[] args) {
//        1.java是单继承的，有时候一个类可能已经继承了某个父类,这时就不能用继承 Thread 类方法来创建线程
//        2.java设计者们提供了另外一个方式创建线程，就是通过实现 Runnable接口 来创建线程
//        3.适合多个线程共享一个资源的情况
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread01 = new Thread(t1);
        Thread thread02 = new Thread(t2);
        thread01.start(); // 启动第一个线程
        thread02.start(); // 启动第二个线程

    }
}

class T1 implements Runnable {
    int count = 1;

    @Override
    public void run() {
        while(true) {
            System.out.println("T1线程");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==5){
                break;
            };
        }
    }
}

class T2 implements Runnable {
    int count = 1;

    @Override
    public void run() {
        while(true) {
            System.out.println("T2线程");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==3){
                break;
            };
        }
    }
}
