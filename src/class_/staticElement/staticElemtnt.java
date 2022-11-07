package class_.staticElement;

public class staticElemtnt {

    public static void main(String[] args) {
        /*
         *  类变量（静态变量）（受访问修饰符的影响）
         * 1）类的所有实例对象都共享
         * 2）类变量在类加载的时候创建
         * 3）类变量和实例变量的区别：
         *    - 类变量是该类的所有对象共享的，而实例变量是每个对象独享的
         * 4) 类变量的生命周期随着类加载生成，类消亡而销毁
         * 5）类变量在类加载时就生成，所以可以不用类实例化对象
         * */
        System.out.println(A.count);

        /*
        * 类方法（静态方法）（和静态变量一样）
        * 1) 静态方法只能访问静态变量不能访问非静态变量和静态方法
        * 2) 类方法中不允许使用和对象有关的关键字，比如 this,super。
        **/
        int res = A.add_(1,2);
        System.out.println(res);
    }
}

class A {
    public static int count = 0;
    public int num = 9;
    public static int add_ (int n1, int n2){
        return n1 + n2;
    }
}
