package set_;

import java.util.*;

public class MapFor {
    //        循环遍历
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("no1", "yyn");
        map.put("no2", "yzy");
        map.put("no3", "qq");
//        第一组: 先取出所有key，通过 key 取出对应 value
        System.out.println("----------第一种方式---------");
        Set set = map.keySet();
        System.out.println("keyset="+ set);
//        1.增强 for
        System.out.println("1.增强 for");
        for (Object key: set) {
            System.out.println("value=" + map.get(key));
        }
//        2.迭代器
        System.out.println("2.迭代器");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println("value=" + map.get(key));
        }

//        第二组:把所有的 values 取出
        System.out.println("----------第二种方式---------");
        Collection values = map.values();
        System.out.println("map.values="+ values);
//        这里可以使用所有的 Collection 使用的遍历方法
//        1.增强for
        System.out.println("1.增强 for");
        for (Object o : values) {
            System.out.println("value="+ o);
        }
        //        2.迭代器
        System.out.println("2.迭代器");
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object key =  iterator2.next();
            System.out.println("value=" + map.get(key));
        }
//       第三组: 通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet(); // EntrySet<Map .Entry<K,V>>
        System.out.println("map.entrySet()="+ entrySet);
//       (1) 增强for
        System.out.println("----使用EntrySet 的 for增强(第三种)----");
        for (Object entry : entrySet) {
//            将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println("----使用EntrySet 的迭代器(第四种)----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
//            System.out.println(o.getClass());
            Map.Entry m = (Map.Entry) iterator3.next();
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
