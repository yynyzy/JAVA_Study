package thread_;

public class ThreadMethods01 {

//    常用方法
//    1.setName     //设置线程名称，使之与参数 name 相同
//    2.getName     //返回该线程的名称
//    3.start       //使该线程开始执行; Java 虚拟机底层调用该线程的 start0 方法
//    4.run         //调用线程对象 run 方法;
//    5.setPriority //更改线程的优先级
//    6.getPriority //获取线程的优先级
//    7. sleep      //在指定的毫秒数内让当前正在执行的线程休眠 (暂停执行)
//    8.interrupt   //中断线程

    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.setName("yyn");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("mian 线程打印" + i);
        }
        System.out.println("线程的优先级" + t3.getPriority());
        t3.interrupt(); // 执行到这里会中断 t 线程的休眠
    }
}

class T3 extends Thread { //自定义的线程类
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 20; i++) {
                //Thread.currentThread().getName() 获取当前线程的名称
                System.out.println(Thread.currentThread().getName() + "运行中" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~");
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt 方法时，就会catch 一个 异常，可以加入自己的业务代码
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
        }
    }
}
