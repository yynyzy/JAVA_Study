public class _float {
    public static void main(String[] args) {
        //float num1 = 1.1;  //不行，float 默认为 double 类型8字节，float 为四字节，无法放进去所以报错。
        float num2 = 1.1F;
        double num3 = 1.1; //ok

        double num4 = 2.7;
        double num5 = 8.1 / 3; //不是 2.7 , 是接近2.7 的近似值
        System.out.println(num5);//2.6999999999999997

    }
}
