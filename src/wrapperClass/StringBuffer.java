package yyn.study.wrapperClass;

public class StringBuffer {
    public static void main(String[] args) {
        /*
        * - java.lang.StringBuffer 代表可变的字符序列，可以对字符串内容进行增删
        * - StringBuffer 是可变长度的
        * - StringBuffer 是一个容 器
        * - 增 append 、删 delete [start,end) 、改 replace [start,end,string) 、 查 indexOf [index,string)（返回第一次出现的索引，没有返回-1）
        *   插入 insert
        **/

        /*
        * 1.StringBuffer 的直接父类 是 AbstractStringBuilder
        * 2.StringBuffer 实现了 Serializable，即 StringBuffer 的对象可以串行化
        * 3.在父类中 AbstractStringBuilder 有属性 char[] value,不是final,该 value 数组存放 字符串内容，引出存放在堆中
        * 4.StringBuffer 是一个 final 类，不能被继承
        * */
        /*
        *  # String VS StringBuffer
        *  1) String 保存的是字符串常量，里面的值不能更改，每次 String 类的更新实际上就是更改地址，效率较低 //private final char value[];
        *  2) StringBuffer 保存的是字符串变量，里面的值可以更改，每次 StringBuffer 的更新实际上可以更新内容，不用更新地址，效率较高  // char[]value 这个放在堆;
        * */

        // 构造器使用
        // 1) 创建一个大小为16的 char[] 用于存放字符内容
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();

        // 2) 通过构造器指定 char[] 大小
        java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer(100);

        // 3) 通过给一个String 创建 StringBuffer, char[] 大小就是 str.length() + 16
        java.lang.StringBuffer hello = new java.lang.StringBuffer("hello");

        // # String -> StringBuffer
        String str = "hello yzy";

        // 方式一 使用构造器
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(str);
        System.out.println("stringBuffer2=" + stringBuffer2);

        // 方式二 使用 append 方法
        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
        stringBuffer3 = stringBuffer3.append(str);
        System.out.println("stringBuffer3=" + stringBuffer3);

        // # StringBuffer -> String
        java.lang.StringBuffer yzy_hello = new java.lang.StringBuffer("yzy hello");

        // 方式一 使用 StringBuffer 提供的 toString 方法
        String s = yzy_hello.toString();
        System.out.println("s="+s);

        // 方式二  使用 String 构造器
        String s1 = new String(yzy_hello);
        System.out.println("s1=" + s1);
    }
}
