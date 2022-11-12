package class_.innerClass;

public class InnerClass {
    public static void main(String[] args) {
        /*
         * 一个类的内部又完整嵌套了另一个类结构，嵌套的类称为内部类，是类的第五大成员
         * 类的五大成员（属性，方法，构造器，代码块，内部类）
         * # 内部类的分类
         *  - 定义在外部类局部位置上（如方法内）：
         *      1）局部内部类
         *      2）匿名内部类
         *  - 定义在外部类的成员位置上：
         *      1）成员内部类
         *      2）静态内部类（static）
         * */
        Outer01 outer01 = new Outer01();
        outer01.m1();
        System.out.println("Other01 hashCode" + outer01);
    }
}

/**
 * 局部内部类
 * 1）可以直接访问外部类的所有成员，包含私有的
 * 2）不能添加访问修饰符，因为它是一个局部变量
 * 3) 内访问外：直接访问
 * 4）外访问内：创建对象后，再访问（必须在作用域内）
 * 5) 外部其他类不能访问局部内部类（局部内部类是一个局部变量）
 * 6）如果外部类和局部内部类的成员重名时，遵循就近原则，如果想访问外部类的成员可以使用（外部类名.this.成员）去访问
 */
class Outer01 { //外部类
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer01 m2()");
    }

    public void m1() {
        final class Inner01 {  //内部类
            private int n1 = 800;

            public void f1() {
                // Other01.this 本质上是外部类对象
                System.out.println("n1=" + n1 + "'外部类的n1'" + Outer01.this.n1);
                System.out.println("Other01.this hashCode" + Outer01.this);
                m2();
            };
        }
        Inner01 inner01 = new Inner01(); // 4
        inner01.f1();
    }
}
