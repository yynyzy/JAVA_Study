package class_.innerClass;

public class memberInnerClass {
    public static void main(String[] args) {
        // 成员内部类
        // 1）可以直接访问外部类的所有成员
        // 2）可以添加访问修饰符
        Outer04 outer04 = new Outer04();
        outer04.out();

        // 外部其他类访问成员内部类另一种方法
        Outer04.Inner04 inner04 = outer04.new Inner04();
        inner04.say();
    }
}

class Outer04 {
   private int n =100;
   public  int c = 98;
   class Inner04 {
       public void say(){
           System.out.println("n=" + n + "c="+c);
       }
   }

   public void out (){
       Inner04 inner04 = new Inner04();
       inner04.say();
   }
}
