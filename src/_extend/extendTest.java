/**
 * 1.子类继承了所有的属性和方法，但私有属性不能在子类直接访问，要通过公共方法去访问。
 * 2.子类必须调用父类的构造器，完成对父类的初始化
 * 3.当创建子类对象时，无论使用子类的哪个构造器，默认情况下总会调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中使用
 *   super 去指定使用哪个构造器完成对父类的初始化工作，否则，编译不会通过。
 * 4.如果希望指定去调用父类的某个构造器则显示的调用一下： super（参数列表）
 * 5.super 在使用时，需要放在构造器第一行
 * 6.super 和 this 都只能放在构造器第一行，所以这两个方法不能共存在一个构造器
 * 7.java 所有类都是 Object类的子类
 * 8.父类构造器的调用不限于直接父类！将一直往上追溯到 Object 类
 * 9.子类最多只能继承一个父类（指直接继承），即 java 中是单继承机制
 * 10.不能滥用继承，子类和父类之间必须满足 is-a 的逻辑关系
 * * */
public class extendTest {
    public static void main(String[] args) {
        A a = new A();
        a.name = "yyn";
        a.age = 21;
        a.setScore(20);
        a.showInfo();

        B b = new B();
        b.name = "yzy";
        b.age = 20;
        b.setScore(10);
        b.showInfo();
    }
}

class A extends Student { }
class B extends Student { }

class Student {
    public String name;
    public int age;
    private double score;
    public void setScore(int score){
        this.score = score;
    }
    public void showInfo(){
        System.out.println("名字" + name + "年龄" + age + "成绩" + score);
    }
}
