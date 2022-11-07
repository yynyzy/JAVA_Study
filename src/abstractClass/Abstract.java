package abstractClass;

public class Abstract {
    /*
    * 1) 用 abstract 关键字来修饰一个类时，这个类就叫抽象类
    * 2）用 abstract 修饰一个方法，就是抽象方法（没有方法体）
    * 3）子类继承要实现抽象类的抽象方法
    * 4）抽象类不能被实例化
    * 5）抽象类不一定要包含 abstract 方法，有abstract 方法一定要声明成抽象类
    * 6）abstract 只能修饰类和方法，不能修饰属性或其他
    * 7）抽象类可以有任意成员【抽象类本质还是类】，比如：抽象方法、构造器、静态属性
    * */
    public static void main(String[] args) {
        new Cat().cry();
    }
}
class Cat extends  Animal{
    public void cry(){
        System.out.println("喵s");
    }
}

abstract class Animal{
    String name;
    abstract void cry();
}
