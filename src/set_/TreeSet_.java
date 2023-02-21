package set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        //1.当我们使用无参构造器，创建TreeSet时，仍然是无序的
        //2.希望添加的元素，按照字符串大小来排序
        //3.使用TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)并指定排序规则

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用string的 compareTo方法进行字符串大小比较
//                return ((String) o2).compareTo((String) o1);

                //要求加入的元素，按照长度大小排序
                 return ((String) o1).length() - ((String) o2).length();
            }
        });
//        添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println("treeSet=" + treeSet);
    }
}
