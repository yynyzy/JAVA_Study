package object;

public class equal {
    public static void main(String[] args) {
        /*
        * equals 方法
        * == ： 既可以判断基础类型也可以判断引用类型。
        * equals: 是Object 类中的方法，只能判断引用类型。
        * 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。
        * */
        A a = new A();
        A b = new A();
        A c = b;
        System.out.println(a.equals(b));//false
        System.out.println(c.equals(b));//true
    }
}

class A{};
