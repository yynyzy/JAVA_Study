package class_.innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        /*
         * 静态内部类
         * 1) 可以访问外部类中的静态成员，不能访问非静态
         * 2）可以加修饰符
         * */
        //获取静态内部类
//        1）
        StaticOuterClass.StaticInnerClass innerClass = new StaticOuterClass.StaticInnerClass();
        innerClass.test();
//        2）
        new StaticOuterClass().getInstances().test();
//        3）
        StaticOuterClass.getInstances2().test();

    }
}

class StaticOuterClass{
    public static int num = 100;
    static class StaticInnerClass {
        public void test (){
            System.out.println("static num="+ num);
        }
    }

    public StaticInnerClass getInstances(){
        return new StaticInnerClass();
    }

    public static StaticInnerClass getInstances2(){
        return new StaticInnerClass();
    }
}
