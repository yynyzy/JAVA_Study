package collection_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Collection_ {
    public static void main(String[] args) {
        // 1.集合主要是两组(单列集合 ， 双列集合)
        // 2.Collection 接口有两个重要的子接口 List Set ，他们的实现子类都是单列集合
        // 3.Map 接口的实现子类 是双列集合，存放的 K-V
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        new Collection_Methods().user_iterator(arrayList);

        HashMap hashMap = new HashMap();
        hashMap.put("N01","北京");
        hashMap.put("N02","上海");
    }

}

// Collection接口遍历元素方式
// 1-使用Iterator(迭代器)
// 2-for循环增强
class Collection_Methods {
    //  1)Iterator对象称为迭代器，主要用于遍历 Collection 集合中的元素
    //  2)所有实现了Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象, 即可以返回一个迭代器
    //  3)lterator 仅用于遍历集合，lterator 本身并不存放对象

    public void user_iterator(List arr) {
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("遍历完成");

        // 增强for循环，可以代替iterator迭代器，特点: 增强for就是简化版的iteratol本质一样。只能用于遍历集合或数组
        /*
        * 基本语法:
        *   for(元素类型 元素名 : 集合名或数组名){
                访问元素
            }
        * */
        for (Object s : arr){
            System.out.println("s="+ s);
        }

    }
}
