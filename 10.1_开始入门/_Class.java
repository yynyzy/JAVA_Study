public class _Class {
    public static void main(String[] args) {
        // 对象的属性：常量入堆，字符串入方法区-常量池

      A a = new A();
      a.test();
      a.test2();
    }

}

class A{
    public void myPrint(int n){
        System.out.println(n);
    }

    //同一个类中的方法直接调用
    public void test(){
        myPrint(50);
    }

    public void test2(){
        B b = new B();
        b.sayHello();
    }
}

class B{
    //跨类调用方法需要带上类名
    public void sayHello(){
        System.out.println("hi yzy");
    }
}
