package object;

public class finalize_ {
    public static void main(String[] args) {
        /**
         * 1.当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法，做一些释放资源的操作。
         * 2.垃圾回收机制的调用，由系统绝定，也可以通过 System.gc() 主动触发垃圾回收机制。
         * */
        FinalizeTest finalizeTest = new FinalizeTest();
        finalizeTest = null;
        System.gc();
        System.out.println("结束");

    }
}

class FinalizeTest {
    protected void finalize (){
        System.out.println("对象销毁");
    }
}
