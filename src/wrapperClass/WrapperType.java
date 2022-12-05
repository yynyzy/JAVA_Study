package wrapperClass;

public class WrapperType {
    public static void main(String[] args) {
        /*
         * # 包装类
         * 1）针对八种基本数据类型相应的引用类型-包装类
         * 2）有了类的特点，就可以调用类中的方法
         * 3）jdk5及以后自动装箱拆箱
         *  boolean ->  Boolean
         *  char -> Character
         *  byte -> Byte
         *  short -> Short
         *  int -> Integer
         *  long -> Long
         *  float -> Float
         *  double -> Double
         *  */
        int n1 = 500;
        // 自动装箱 int -> Integer
        Integer integer01 = n1; // 底层使用了 Integer.valueOf(n1)
        // 自动拆箱 Integer -> int
        int n2 = integer01;
    }
}
