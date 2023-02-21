package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {
        /*
        * - set接口的实现类的对象，不能存放重复的元素，可以放一个 null
        * - set 接口对象的存放元素是无序的
        * - 取出是固定的
        * */
        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("tom");
        set.add(null);
        set.add(null);
        System.out.println("set=" + set);

        //遍历-迭代遍历
        System.out.println("迭代遍历");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println("o="+o);
        }

        set.remove(null);
        //遍历-增强for循环
        System.out.println("增强for循环");
        for(Object o : set){
            System.out.println("O=" + o);
        }
    }
}
