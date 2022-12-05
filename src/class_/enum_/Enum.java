package class_.enum_;

public class Enum {
    public static void main(String[] args) {
        /*
         * 1) 枚举是一组常量的集合
         */
        // 自定义枚举类的实现
        System.out.println(People.MAN);
        System.out.println(People.WOMAN);
        // enum 枚举类
        // 1）使用 enum 关键字后就不能继承其他类类，因为 enum 会隐式继承 Enum， java是单继承机制
        // 2）枚举类和普通类一样，可以实现接口， enum 类名 implements 接口1， 接口2 {}
        System.out.println(Season.AUTUMN);

        // enum 成员方法
        System.out.println(Season.AUTUMN.name()); // 返回当前对象名（常量名）
        System.out.println(Season.AUTUMN.ordinal()); // 返回当前对象的位置号，默认0开始
        System.out.println(Season.values()); // 返回枚举类中的所有常量
        System.out.println(Season.valueOf("SUMMER"));// 将字符串转化为枚举对象，必须是已有的，否则报异常
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));// 比较两个常量，比较位置号
    }
}

/**
 * # 自定义枚举类的实现
 * 1. 构造器私有化
 * 2. 本类内部创建一组对象
 * 3. 对外暴露对象（通过添加 public final static）
 * 4. 可以提供 get 方法，不提供 set 方法
 */

class People {
    private String gender;
    public final static People MAN = new People("男");

    public final static People WOMAN = new People("女");

    private People(String gender) {
        this.gender = gender;
    }
}

/*
 # enum 关键字实现枚举
 1.当我们使用 enum 关键字开发一个枚举类时，默认会继承 Enum 类
 2.如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
 3.当有多个枚举对象时，使用 , 间隔
 4.枚举对象必须放在枚举类的行首
 */

enum Season {
    SPRING("春天"),SUMMER("夏天"), AUTUMN("秋天"),WINTER("冬天"), UNKNOWN();

    private String name;

    private Season() {};

    private Season(String name) {
        this.name = name;
    }
}
