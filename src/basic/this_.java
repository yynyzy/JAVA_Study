package basic;
public class this_ {
    /**
     * 1.this关键字可以用来访问本类的属性、方法、构造器
     * 2.this用于区分当前类的属性和局部变量
     * 3.访问成员方法的语法： this.方法名（参数列表）
     * 4.访问构造器的语法：this（参数列表）；注意只能在构造器中使用
     * 5.his不能在类定义的外部使用，只能在类定义的方法中使用
     * */
    public static void main(String[] args) {
        new T();
    }
}

class T {
    public T(){
        /**
         * 访问其他构造器语法 this(参数列表)；
         * 必须放第一行；
         * 只能在构造器中使用，即在一个构造器访问另一个构造器
         * */
        this("yzy", 100);
        System.out.println("T() 构造器");
    }

    public T(String name, int age){
        System.out.println("T(String name, int age) 构造器");
    }

    public void f1(){
        System.out.println("f1()");
    }
    public void f2(){
        System.out.println("f2()");
        //两种调用方式
        f1();
        this.f1();
    }
}
