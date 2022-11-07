package interface_;

public interface UsbInterface {
    public void start();
    public void end();

    // 在jdk8 后可以有默认实现方法，需要使用 default 关键字
    default public void ok(){
        System.out.println("ok");
    }

    // 在jdk8 后可以有静态方法
    public static void test(){
        System.out.println("test");
    }
}
