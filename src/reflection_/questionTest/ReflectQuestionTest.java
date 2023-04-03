package reflection_.questionTest;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectQuestionTest {
    /*
    *  读取 properties 配置文件的信息根据 className 实例化 cat 类，根据 method 调用 cat 类的对应方法
    * */

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/reflection_/questionTest/config.properties"));
        String className = properties.getProperty("className");
        System.out.println(className);
        String method = properties.getProperty("method");
        // (1) 加载类，返回 Class 类型的对象 cls
        Class cls = Class.forName(className);
        // (2) 通过 cls 得到你加载的类 reflection_.questionTest.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o 的运行类型" + o.getClass());
        // (3) 通过 cls 得到你加载的类的 methodName"hi" 的方法对象
        Method method1 = cls.getMethod(method);
        // (4) 通过 method1 调用方法: 即通过方法对象来实现调用方法
        method1.invoke(o);


        // java.lang.reflect.Field: 代表类的成员变量，Field 对象表示某个类的成员变量
        // getField不能得到私有的属性: cls.getField("name")
        Field color = cls.getField("color");
        System.out.println("color=" + color.get(o));

        //java.lang.reflect.Constructor: 代表类的构造方法，Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();
        System.out.println("无参构造器" + constructor);
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println("有参构造器" + constructor1);
    }
}
