package math_;

import java.util.Arrays;
import java.util.List;

public class Math_ {
    public static void main(String[] args) {
        new Random_().showRandom();
        new ArraysMethods().ToString();
        new ArraysMethods().CopyOf_();
        new ArraysMethods().fill_();
        new ArraysMethods().asList_();
    }
}

class Random_{
       /* random 返回的是一个 0~1 之间的一个随机小数 */
       void showRandom () {
            for (int i = 0; i < 5; i++) {
                System.out.println((int)(2 + Math.random()*(7-2+1)));
            }
        }
}

class ArraysMethods {
    void ToString(){
        Integer[] arr = {1,32,20,4};
        // 直接使用 array 的 toString 方法输出数组
        System.out.println(Arrays.toString(arr));

        // 数组是引用类型，通过sort 排序后，会直接影响到实参 arr
        // sort 重载的，也可以直接传入一个接口 Comparator 实现定制排序
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    void CopyOf_(){
        // copy 数组元素的控制
        // 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
        // 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
        Integer[] arr = {1,3,4};
        Integer[] newArr  =  Arrays.copyOf(arr, arr.length-1);
        Integer[] newArr2  =  Arrays.copyOf(arr, arr.length+1);
        System.out.println("new arr=" +  Arrays.toString(newArr));
        System.out.println("new arr=" +  Arrays.toString(newArr2));
    }

    void fill_(){
        // 使用 99 去填充数组 num，会替换原来的元素
        Integer[] num = new Integer[]{2,5,3};
        Arrays.fill(num, 99);
        System.out.println("num = " + 99);
    }

    void asList_(){
        /*
        * aslist 方法会将数据转换成一个 List 集合
        * 返回的 arr 编译类型 List(接口)
        * aslist 的运行类型class java.util.Arrays$ArrayList
        * */
        List<Integer> arr = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println("aslist=" + arr);
        System.out.println("aslist 的运行类型" + arr.getClass());
    }
}
