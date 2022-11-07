package designPattern.singleton;

public class Template {
    // 设计模式-模版模式
    public static void main(String[] args) {
        A a = new A();
        a.caleTimes();
        B b = new B();
        b.caleTimes();
    }

}

abstract class calculate  {
    abstract public void job();

    public void caleTimes(){
        long start = System.currentTimeMillis();
        job(); // 抽象方法
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
}

class A extends calculate {
    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i < 10000; i++) {
            num+=i;
        }
        System.out.println("A的num=" + num);
    }
}

class B extends calculate {
    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i < 50000; i++) {
            num+=i;
        }
        System.out.println("B的num=" + num);
    }
}
