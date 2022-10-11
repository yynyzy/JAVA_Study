public class OverLoad {
    public static void main(String[] args) {
        /**
         * 方法重载
         * 1）方法名：必须相同
         * 2）行参列表：必须不同（行参类型或个数或顺序，至少有一个不同，参数名不影响）
         * 3）返回类型：无要求
         * */
        sum(1,3,5);
        int[] arr = {1,2,3,4};
        sum(arr);
    }


    /**
     *  可变参数
     *
     *  方法名相同，参数个数不同 ->可使用可变参数优化
     *  1）可变参数的实参可以为0个或者任意多个
     *  2）可变的参数的实参可以为数组
     *  3）可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后一个
     *  4）一个形参列表中只能出现一个可变参数
     * */
    public static void sum(int... nums){
        System.out.println("接受的参数的个数=" + nums.length);
        for(int i = 0; i < nums.length; i++){
            System.out.println("i=" + nums[i]);
        }
    }
}
