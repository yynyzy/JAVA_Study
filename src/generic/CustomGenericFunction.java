package yyn.study.generic;

public class CustomGenericFunction {
    public static void main(String[] args) {
//        自定义泛型方法
//        # 基本语法
//          修饰符 <T,R..>返回类型 方法名(参数列表) {}
//        # 注意细节
//          1.泛型方法，可以定义在普通类中,也可以定义在泛型类中
//          2.当泛型方法被调用时，类型会确定
//          3.public void eat(E e)， 修饰符后没有<T,R..> eat方法不是泛型方法，而是使用了泛型
        fly("yyn", 200);
    }

    public static <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());//string
        System.out.println(r.getClass());//Integer
    }
}

class Fish<T, R> {//泛型类

    public void run() {
    }//普通方法

    public <U, M> void eat(U u, M m) {
    }//泛型方法

    //是hi方法使用了类声明的泛型
    public void hi(T t) {
    }

    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public <K> void hello(R r, K k) {
    }
}
