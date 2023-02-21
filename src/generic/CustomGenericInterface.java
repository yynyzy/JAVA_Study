package yyn.study.generic;

public class CustomGenericInterface {
    public static void main(String[] args) {
//        自定义泛型接口
//        # 基本语法
//        interface 接口名<T, R...>{}
//        1) 接口中，静态成员也不能使用泛型(这个和泛型类规定一样)
//        2) 泛型接口的类型，在继承接口或者实现接口时确定
//        3) 没有指定类型，默认为object
    }
}

//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {
}

class AA implements IA {
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void run(String u1, Double r1) {

    }

    @Override
    public Double method(String s) {
        return IA.super.method(s);
    }
}

interface IUsb<U, R> {
    int n = 10;
//    U a; 不能这样使用

    R get(U u);

    void run(U u1, R r1);

    //    在idk8 中，可以在接口中，使用默认方法
    default R method(U u) {
        return null;
    }

}
