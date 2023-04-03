package reflection_.class_;

import java.lang.reflect.Constructor;

public class class02 {
    public static void main(String[] args) throws  Exception {

        // 获取类
        Class<?> aClass = Class.forName("reflection_.class_.User");

        // 通过 public 无参构造器创建实例
        Object o = aClass.newInstance();
        System.out.println("通过 public 无参构造器创建实例=" + o);

        // 通过 public 有参构造器创建实例
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object yyn = constructor.newInstance("yyn");
        System.out.println("通过 public 有参构造器创建实例=" + yyn);

        // 通过 private 有参构造器创建实例
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Object qq = declaredConstructor.newInstance("qq", 20);
        System.out.println("通过 private 有参构造器创建实例=" + qq);
    }
}

class User {
    private String name="yzy";
    private int age = 10;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
