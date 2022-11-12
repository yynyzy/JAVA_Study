package class_.innerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        /*
        *  匿名内部类
        *   1)本质是类 2）内部类 3）没有名字 4）同时还是一个对象
        *
        *   基本语法
        *   new 类或接口(参数列表){
        *       类体
        *   }
        * */
        new Outer().method();
    }
}

class  Outer{
    public void method(){
        //1.基于接口的匿名内部类
        //需求： 使用 IA 接口，并创建对象使用 cry
        //传统方式： 写一个类实现该接口，并创建对象
        //可以使用匿名内部类开发
        // man 的编译类型是 IA
        // man 的运行类型是 匿名内部类（底层系统取名，这里是 class_.innerClass.Outer$1）
        //jdk 在底层此案匿名内部类 Outer$1，立即创建了 Outer$1 实例，并且把地址返回给 man
        IA man  = new IA(){
            @Override
            public void cry() {
                System.out.println("哭");
            }
        };
        System.out.println("man 的运行类型即匿名内部类的名字=" + man.getClass());
        man.cry();

        // 2.基于类的匿名内部类
        // yyn 的编译类型是 IA
        // yyn 的运行类型是 Outer$2
        Father yyn = new Father("yyn"){  //加大括号了就是匿名内部类，不加就是正常的 Father 类
            @Override
            public void test() {
                System.out.println("匿名内部类重写 test 方法");
            }
        };
        System.out.println("yyn 的运行类型即匿名内部类的名字=" + yyn.getClass());//Outer$2
        yyn.test();


        // 3.基于抽象类的匿名内部类
        Cat cat = new Cat(){
            @Override
            public void eat() {
                System.out.println("匿名内部类重写抽象类的 eat 方法");
            }
        };
        cat.eat();

    }
}
interface IA{
    public void cry();
}

class Father{
    public Father(String name){} //构造器
    public void test(){}
}

abstract class Cat{
    abstract public void eat();
}
