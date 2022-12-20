package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List接口基本介绍
public class List_interface {
    public static void main(String[] args) {
/**
 * List 接口是 Collection 接口的子接口
 * 1) List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
 * 2) List集合中的每个元素都有其对应的顺序索引，即支持索引
 *  3)List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素
 */
        List_interface.list_CRUD(); // list 增删改查相关方法
        List_interface.list_traverse(); // list 遍历相关方法

    }
    private static void list_CRUD (){
        List list = new ArrayList();
        list.add("yyn");
        list.add("yzy");
        // 在index = 1的位置插入一个对象
        list.add(1, "严严");
        System.out.println("list=" + list);
        // 在index = 1的位置插入一个 list
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);

        // int indexOf(Object obj): 返回oj在集合中育次出现的位道
        System.out.println(list.indexOf("tom"));
        // int lastIndex0f(object obj):返回obj在当前集合中最后一次出现的位置
        list.add("tom");
        System.out.println(list.lastIndexOf("tom"));

//      Object remove(int index):移除指定 index 位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list=" + list);

//      Object set(int index，Object ele):设置指定index位置的元素 为ele, 相当于是替换。
        list.set(1, "qq");
        System.out.println("list=" + list);


//        List subList(int fromIndex，int toIndex):返回从fromIndex到 toIndex 位置的子集命
        List relist = list.subList(0,2);
        System.out.println("relist=" + relist);

    }
    private static void list_traverse(){
        List list = new ArrayList();
        list.add("yyn");
        list.add("yzy");
//        list 遍历的 3 种方式
//        1.使用 iterator 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
//        2.使用增强for
//        3.使用普通for
            for (int i = 0; i < list.size(); i++) {
                System.out.println("对象=" + list.get(i));
            }

        }
    }
}
