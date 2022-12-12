package system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        // System类
        // 1)exit 退出当前程序,0 表示程序退出
//        System.exit(0);

        // 2)arraycopy : 复制数组元素，比较适合底层调用，一般使用Arrays.copyOf 完成复制数组
        int[] src= {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("arraycopy =" + Arrays.toString(dest));

        // 3)currentTimeMillis: 返回当前时间距离1970-1-1 的毫秒数
        System.out.println("currentTimeMillions = "+ System.currentTimeMillis());

        //4)gc:运行垃圾回收机制 System.gc();
    }
}
