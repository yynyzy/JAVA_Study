package yyn.study.generic;

public class CustomGenerics {
    public static void main(String[] args) {
//        自定义泛型
//        class 类名<T R...>{
//            成员
//        }
//        # 注意细节
//        1)普通成员可以使用泛型(属性、方法)
//        2)使用泛型的数组，不能初始化
//        3)静态方法中不能使用类的泛型
//        4)泛型类的类型，是在创建对象时确定的(因为创建对象时，需要指定确定类型)
//        5)如果在创建对象时，没有指定类型，默认为Object
    }
}

class Cat<T, R> {
    String name;
    T t; // 属性使用泛型
    R r;
    //因为数组在new 不能确定T的类型，就无法在内存开空间
    T[] ts;

    public Cat(String name, T t, R r, T[] ts) { // 构造器使用泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.ts = ts;
    }

    public T getT() { // 函数使用泛型
        return t;
    }
//  因为静态是和类相关的，在类加载时，对象还没有创建
//  所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
//   static R r2;
//   static void xx (R r) {}
}
