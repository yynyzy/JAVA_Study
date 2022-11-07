package designPattern.singleton;

public class Singleton {
    /*
     * # 单例模式(饿汉式和懒汉式)
     *  1） 构造器私有化防止用户new（）
     *  2） 类的内部创建对象
     *  3） 向外暴露一个静态的公共方法
     *  4） 代码实现
     * */
    public static void main(String[] args) {
        //饿汉模式
        Girl girl1 = Girl.getInstance();
        System.out.println(girl1);
        Girl girl2 = Girl.getInstance();
        System.out.println(girl2);

        //懒汉模式
        Lazy lazy1 = Lazy.getInstance();
        System.out.println(lazy1);
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
    }

}

/** 饿汉式的单例模式*/
class Girl {
    private String name;
    private Girl(String name) {
        this.name = name;
    }
    private static Girl girl = new Girl("yzy");
    public static Girl getInstance(){
        return girl;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name" + name + "/" +
                "}";
    }
}

class Lazy {
    private String name;
    private static Lazy lazy;
    private Lazy (String name){
        this.name =name;
    }
    public static Lazy getInstance(){
        if(lazy == null){
            lazy = new Lazy("yyn");
        }
        return lazy;
    }
}
