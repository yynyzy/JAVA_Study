package thread_;

public class Thread_01 {

    public static void main(String[] args) {

        // 继承 Thread 类，该类就可以作为线程使用
        Cat cat = new Cat();
        cat.start(); // 开启线程
//        cat.run(); // 不对，run 方法就是一个普通的方法了

        // 当 main 线程启动一个子线程 Thread-0，主线程不会阻寒，会继续执行
        // 这时主线程子线程交替执行
        System.out.println("main线程" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程执行" + i);
            try {
                Thread.sleep(1000); // 让主线程休眠
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Cat extends Thread {
    int times = 0;
    @Override
    public void run() { // 重写 run 方法
        while (true) {
            times++;
            System.out.println("cat线程运行" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break; // 退出循环，线程退出
            }
        }
    }
}
