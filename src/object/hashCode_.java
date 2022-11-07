package object;

public class hashCode_ {
    /*
    * 1) 提高具有哈希结构的容器的效率
    * 2）两个引用，如果指向的是同一个对象，则哈希值肯定一样；反之，肯定不一样
    * 3）哈希值主要根据地址号来的！，不能完全将哈希值等价于地址
    * */

    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        System.out.println("a1.hascode="+ a1.hashCode());
        System.out.println("a2.hascode="+ a2.hashCode());
    }
}

class AA {}
