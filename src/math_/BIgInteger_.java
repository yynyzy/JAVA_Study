package math_;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BIgInteger_ {
    public static void main(String[] args) {
        //  long a = 2222222222222222294584848l; Long number too large

        // 大数
        BigInteger b1 = new BigInteger("22222222222222222222222");
        System.out.println("b1=" + b1);
        BigInteger b2 = new BigInteger("20");
        System.out.println("b1+b2="+b1.add(b2));


        // 大浮点数
        // 保存精度很高的小数时， double 不够用
        BigDecimal f1 = new BigDecimal("2.044848888888888888888888888888");
        System.out.println("f1=" + f1);
        BigDecimal f2 = new BigDecimal("3.3");
        // System.out.println(f1.divide(f2)); // 可能抛出异常 ArithmeticException
        // 在调用divide 方法时，指定精度即可, BigDecimal.ROUND_CEILING
        // 如果有无限循环小数，就会保留 分子 的精度
        System.out.println(f1.divide(f2, BigDecimal.ROUND_CEILING));
    }
}
