package exception_;

public class Exception {
    public static void main(String[] args) {
        /*
         * 执行过程中所发生的异常事件可分为两类
         * 1）Error（错误），Java 虚拟机无法解决的严重问题。如：JVM 系统内部错误、资源耗尽等，比如 StackflowError ，程序会崩溃
         * 2）Exception：其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。Exception 分为两大类 ：运行异常和编译异常
         *   - 运行时异常： 编译器不要求强行处理
         *   - 编译时异常： 编译器要求强行处理
         * 3）如果 try 代码块有多个异常，可以使用 多个catch 分别捕获不同的异常，相应处理，写在子类异常前
         * */
        int num1 = 10;
        int num2 = 0;
        try {
            int m = num1 / num2;
        } catch (NullPointerException e){
            //   NullPointrtException 空 指针异常
            String num3 = null;
            System.out.println("空指针异常" + num3.length());
            System.out.println(e.getMessage());
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("不管是否有异常都会执行 finally");
        }
    }


}
