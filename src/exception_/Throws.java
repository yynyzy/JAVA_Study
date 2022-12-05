package exception_;

public class Throws {
    public static void main(String[] args) {
        /*
        *  1） 对于编译异常，程序中必须处理，比如 try-catch 或者 throws
        *  2） 对于运行时异常，程序中如果没有处理，默认是 throws 的方式处理
        * */
    }
    public static void f1() /*throws ArithmeticException*/ {
        int n1 =10;
        int n2 = 0;
        double res = n1/n2;
    }
}

class Father {
    public void method() throws RuntimeException {}
}

class Son extends Father {
    // 3. 子类重写父类的方法时，对抛出异常的规定：子类重写的方法
    // 所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类
    @Override
    public void method() throws RuntimeException {
        super.method();
    }
}
