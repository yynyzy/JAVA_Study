package annotation;

public class Annotation {
    public static void main (String[] args) {
    /*
       # 注解（Annotation）
       1）注解也被称谓元注解，用于修饰解释包、类、方法、属性、构造器、局部变量等数据信息。

       ## 三个基本的 Annotat:
        1）@Override： 限定某个方法，是重写父类方法，该注解只能用于方法
        2）Deprecated： 用于表示某个元素（类，方法等）已过时
        3）@SuppressWarnings: 抑制编译器警告
     */

        // 1. @Override
        /**
         1.@Override 注解放方法上重写父类方法
         如果没有写这个注解，还是会重写
         如果写了注解，编译器会去检查该方法是否真的重写了父类的方法，如果没有构成重写，则编译报错

         2. 查看 @Override 注解的源码为 @Target(ElementType.METHOD),说明只能修饰方法
         3. @Target 是修饰注释的注解，称为元注解
         */
        new Override_son().say();

        // 2.@Deprecated
        /**
         1.用于表示某个程序元素已过时
         2.可用于做到新旧版本的兼容和过渡
         */
    }
}

class Override_father {
    public void say() {
        System.out.println("father");
    }
}

class Override_son extends Override_father {
    @Override
    public void say() {
        System.out.println("son");
    }
}
