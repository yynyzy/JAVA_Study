package interface_;

public class Interface_ {

    /*
    * 声明了接口的必须实现接口中的方法
    * 1) 接口不能被实例化
    * 2）接口中所有方法是 public 方法，接口中的抽象方法可以不用 abstract 修饰
    * 3）普通类实现接口必须实现接口中所有的方法
    * 4）抽象类实现接口，可以不用实现接口的方法
    * 5) 一个类同时可以实现多个接口
    * 6）接口中的属性只能是 final 的，而且是 public static final 修饰符
    * 7）接口中属性访问形式：接口名.属性
    * 8）一个接口不能继承其他类，但可以继承多个接口
    *    interface A extend B，c{}
    * 9）接口修饰符只能是 public 和默认
    * */
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建一个电脑来接受usb设备
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}

class Computer{
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.ok(); // 默认方法
        UsbInterface.test();// 静态方法
        usbInterface.end();
    }
}

class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机连接开始");
    }

    @Override
    public void end() {
        System.out.println("手机断开连接");
    }
}

class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("电脑连接开始");
    }

    @Override
    public void end() {
        System.out.println("电脑断开连接");
    }
}
