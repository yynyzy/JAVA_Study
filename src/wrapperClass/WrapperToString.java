package wrapperClass;

public class WrapperToString {
    public static void main(String[] args) {
        // Integer -> String
        Integer i =100;
        String str1 = i.toString();
        String str2 = String.valueOf(i);
        System.out.println("str1"+str1);
        System.out.println("str2"+str2);

        // String -> Integer
        String str3 = "1234";
        Integer i2 = Integer.parseInt(str3); // 使用自动装箱
        Integer i3 = new Integer(str3);// 使用构造器

        System.out.println("i2"+i2);
        System.out.println("i3"+i3);
    }
}
