package poly;

public class poly {
    public static void main(String[] args) {
        /*
         * 多态的向下转型
         *
         * 1）语法： 子类类型 引用名 = （子类类型）父类引用
         * 2）只能强转父类的引用，不能强转父类的对象
         * 3）要求父类的引用必须指向的是当前目标类型的对象
         * 4）可以调用子类类型中所有的成员
         *
         *
         * 1）属性看编译类型，方法看运行类型
         *
         * java 的动态绑定机制
         * 1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
         * 2.当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
         * */
        instance i = new instance();
        i.test();
    }
}
