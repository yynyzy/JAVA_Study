package class_.codeBlock;

public class CodeBlock {
    public static void main(String[] args) {
        /*
        * 代码块又称为初始化块，属于类中的成员，在加载类时或者创建对象时隐式调用
        * - 基本语法
        *   【修饰符】{
        *       代码
        *    }
        *
        * 1) 修饰符可选，写的话只能是 static
        * 2）使用static 修饰的叫静态代码块，没有的叫普通代码块
        * 3) 创建一个子类时（继承关系），他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用如下：
        *    1 父类的静态代码块和静态属性（优先级一样，按定义顺序执行）
        *    2 子类的静态代码块和静态属性（优先级一样，按定义顺序执行）
        *    3 父类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
        *    4 父类的构造方法
        *    5 子类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
         *   6 子类的构造方法
         *
        * */

        //当不管我们调用哪个构造器，代码块优先与构造器执行
        Person person1 = new Person("yyn");
        Person person2 = new Person("yyn", "boy");
        Person person3 = new Person("yyn","boy", 19);
    }
}

class Person{
    private String name;
    private String gender;
    private int age;

    {
        System.out.println("代码块执行");
    }
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("构造器3");
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("构造器2");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("构造器1");
    }
}
