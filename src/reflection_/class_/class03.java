package reflection_.class_;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class03 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("reflection_.class_.Student");
        Object o = aClass.newInstance();

        // 访问属性
        // 使用反射操作 age 属性
        Field age = aClass.getField("age");
        age.set(o, 99); // 为非私有属性设置值
        System.out.println(o);

        // 对name 进行暴破，可以操作 private 属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o, "yyn");
        name.set(null, "yyn"); ;// 因为 name 是 static 属性，因此 o 也可以写成 nuLl
        System.out.println(o);



        // 访问方法
        // 1.根据方法名和参数列表获取 Method 方法对象 :
            //    Method m =class.getDeclaredMethod(方法名, XX.class); //得到本类的所有方法
        // 2.获取对象: Object o=clazz.newlnstance0);
        // 3.暴破: m.setAccessible(true);
        // 4.访问: Object returnValue = m.invoke(o,实参列表): //o 就是对象
        // 5.注意: 如果是静态方法，则 invoke 的参数 o，可以写成 null

        Method hi = aClass.getMethod("hi", String.class);
        hi.invoke(o, "Alice");

        Method hi2 = aClass.getDeclaredMethod("hi2", String.class, int.class);
        hi2.setAccessible(true);
//        hi2.invoke(o, "Ben");
        Object ben = hi2.invoke(null, "Ben", 18);// static 方法，可以用 null 代替
        System.out.println("ben=" + ben);
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void hi(String boy){
        System.out.println("hi:" + boy);
    }
    private static String hi2(String boy, int age){
        return "hi2:" + boy + "age" + age;
    }

}
