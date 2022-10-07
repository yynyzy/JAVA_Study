/**
 * 1.子类继承了所有的属性和方法，但私有属性不能在子类直接访问，要通过公共方法去访问。
 * 2.子类必须调用父类的构造器，完成对父类的初始化
 * 3.当创建子类对象时，无论使用子类的哪个构造器，默认情况下总会调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中使用
 *   super 去指定使用哪个构造器完成对父类的初始化工作，否则，编译不会通过。
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
