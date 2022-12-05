package exception_;

public class CustomizeException {
    public static void main(String[] args) {
        /*
        *  自定义异常
        * 1）定义类：自定义异常类名继承 Exception 或 RuntimeException
        * 2) 如果继承 Exception，属于编译异常
        * 3）如果继承 RuntimeException ，属于运行异常
        * */
        int age = 180;
        if (!(age>=18 && age<=120)){
            throw new AgeException("年龄需要子啊18～120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

// 一般自定义异常我们继承 RuntimeException，因为可以使用的他的默认处理
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
