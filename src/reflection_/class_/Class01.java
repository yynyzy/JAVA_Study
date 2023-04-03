package reflection_.class_;

import reflection_.questionTest.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class    Class01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        String classFullName = "reflection_.questionTest.Cat";
        // 1.获取到 Cat 类 对应的 cLass对象
        Class cls = Class.forName(classFullName);
        System.out.println(cls);  // 显示 cls 对象，是哪个类的 Class对象 reflection_.questionTest.Cat
        System.out.println(cls.getClass());// 输出 cls 运行类型 java.lang.class
        // 3.得到包名
        System.out.println(cls.getPackage().getName());
        // 4.得到全类名
        System.out.println(cls.getName());
        // 5.通过cls创建对象实例
        Cat cat =(Cat)cls.newInstance();
        System.out.println(cat);
        // 6.通过反射获取属性 name
        Field name = cls.getField("name");
        System.out.println(name.get(cat));
        // 7.通过反射给属性赋值
        name.set(cat, "yyn");
        System.out.println(name.get(cat));
        // 8.得到所有的属性(字段)，私有不行
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println("fields=" + f);
        }
        // 9.得到所有的属性(字段)
        //  getModifiers: 以int形式返回修饰符
        //  说明: 默认修饰符是0，public 是1 ，private 是 2， protected 是 4 , static 是 8 ，final是 16
        //  public(1) + static(8) = 9
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field f:declaredFields){
            System.out.println("本类中所有属性=" + f.getName()
                    + "该展性的修饰符值=" + f.getModifiers()
                    + "该属性的类型=" + f.getType());
        }

        // 10.getDeclaredMethods:获取本类中所有方法
         Method[] declaredMethods = cls.getDeclaredMethods();
         for (Method declaredMethod : declaredMethods) {
         System.out.println("本类中所有方法=" + declaredMethod.getName()
         + "该方法的访问修饰符值=" + declaredMethod.getModifiers()
         + "该方法返回类型" + declaredMethod.getReturnType());

             Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
             for (Class<?> parameterType : parameterTypes) {
                 System.out.println("该方法的形参类型=" + parameterType);
             }
         }

         // 11.getDeclaredConstructors:获取本类中所有构造器
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("============");
            System.out.println("本类的构造器="  + declaredConstructor);
            Class[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }
}
