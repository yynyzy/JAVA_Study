package basic;

public class final_ {
    /*
     * # final 修饰符（可以修饰类、方法、属性、局部变量）
     * 1) 禁止类被继承（ final class），但是可以实例化
     * 2）禁止父类的某个方法被子类覆盖/重写（访问修饰符 final 返回类型 方法名）
     * 3）不希望类的某个属性被修改，可以使用 final 修饰
     * 4）不希望局部变量被修改
     * 5）如果 final 修饰的 static 变量时，则初始化的位置只能是： 1、定义时 2、在静态代码块，不能在构造器中赋值
     * 6）一个类已经是 final 类类，就没必要在将方法修饰成 final 方法
     * 7）final 不能修饰构造器方法
     * 8）final 和 static 搭配使用效率更高（不会导致类加载）
     * 9）包装类（Integer,Double,Float 等都是 final），String 也是 final 类。
     * */
    public static void main(String[] args) {
        System.out.println(BB.num);
    }
}

class BB {
//    public static int num = 9999;
    public final static int num = 9999; //不会执行静态代码块
    static {
        System.out.println("BB静态代码块执行了");
    }
}
