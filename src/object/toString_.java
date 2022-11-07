package object;

public class toString_ {
    /*
    *  默认返回： 全类名+@+哈希值的十六进制，子类往往重写 toString 方法，用于返回对象的属性信息
    **/
    public static void main(String[] args) {

    ToStringTest toStringTest = new ToStringTest();
        System.out.println(toStringTest.toString());

    }
}

class ToStringTest{}
