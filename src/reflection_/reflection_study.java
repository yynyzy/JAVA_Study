package reflection_;

public class reflection_study {
    /**
    *  1.反射机制允许程序在执行期借助于 ReflectionAPI 取得任何类的内部信息(比如成员变量，构造器，成员方法等等)，并能操作对象的属性及方法。
    *    反射在设计模式和框架底层都会用到
    *
    *  2.加载完类之后，在堆中就产生了一个Class类型的对象 (一个类只有一个Class对象)
    *
    *  3.Java反射机制可以完成
    *       1.在运行时判断任意一个对象所属的类
    *       2.在运行时构造任意一个类的对象
    *       3.在运行时得到任意一个类所具有的成员变量和方法
    *       4.在运行时调用任意一个对象的成员变量和方法
    *       5.生成动态代理
    *
    *  4.反射相关的主要类:
    *       1.java.lang.Class:代表一个类，Class 对象表示某个类加载后在堆中的对象
    *       2.java.lang.reflect.Method: 代表类的方法,Method 对象表示某个类的方法
    *       3.java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
    *       4.java.lang.reflect.Constructor: 代表类的构造方法, Constructor对象表示构造器
    *
    *  5.反射优点和缺点
    *       1.优点: 可以动态的创建和使用对象(也是框架底层核心)，使用灵活,没有反射机制，框架技术就失去底层支撑。
    *       2.缺点: 使用反射基本是解释执行，对执行速度有影响
    *
    *  6.反射调用优化-关闭访问检查
    *       1.Method 和 Field、Constructor 对象都有 setAccessible() 方法
    *       2.setAccessible 作用是启动和禁用访问安全检查的开关
    *       3.参数值为 true 表示 反射的对象在使用时取消访问检查，提高反射的效率。
     * */

    /**
     * 获取Class类对象
     * 1.前提: 已知一个类的全类名，且该类在类路径下，可通过 Class 类的静态方法 forName() 获取，可能抛出 ClassNotFoundException
     *       实例: Class cls1 = Class.forName( "java.lang.Cat”);
     *       应用场景:多用于配置文件,读取类全路径，加载类
     *
     * 2.前提: 若已知具体的类，通过类的 class 获取，该方式 最为安全可靠，程序性能最高
     *       实例:Class cls2 = Cat.class;
     *       应用场景:多用于参数传递，比如通过反射得到对应构造器对象
     *
     * 3.前提: 已知某个类的实例，调用该实例的 getClass() 方法获取 Class 对象
     *       实例:Class class = 对象.getClass();   //运行类型
     *       应用场景: 通过创建好的对象，获取Class对象
     *
     * 4.其他方式: ClassLoader cl = 对象.getClass().getClassLoader();
     *            Class cls4 = cl.loadClass("类的全类名");
     *
     * 5.基本数据(int, char,boolean,float,double,byte,long,short) 按如下方式得到 Class 类
     *        Class cls = 基本数据类型.class
     *
     * 6.基本数据类型对应的包装类，可以通过 .TYPE 得到Class类对象
     *        class cls = 包装类.TYPE
     * */

    /**
     * 反射机制是 java 实现动态语言的关键，也就是通过反射实现类动态加载
     *      1.静态加载: 编译时加载相关的类，如果没有则报错，依赖性太强
     *      2.动态加载: 运行时加载需要的类，如果运行时不用该类，则不报错，降低了依赖性
     * 类加载时机
     * 1.当创建对象时 (new)
     * 2.当子类被加载时
     * 3.调用类中的静态成员时
     * 4.通过反射
     * */

    /**
     *   通过反射创建对象
     *  1.方式一: 调用类中的 public 修饰的无参构造器
     *  2.方式二: 调用类中的指定构造器
     *
     *  3.Class 类相关方法
     *   newInstance : 调用类中的无参构造器，获取对应类的对象
     *   getConstructor(Class...clazz): 根据参数列表，获取对应的public构造器对象
     *   getDeclaredConstructor(Class...clazz): 根据参数列表，获取对应的所有构造器对象
     *
     *  4.Constructor类相关方法
     *   setAccessible: 暴破
     *   newInstance(Object...obj): 调用构造器
     * */
    public static void main(String[] args) {

    }

}
