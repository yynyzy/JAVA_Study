package set_;

import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        /*
        1)Map 用于保存具有映射关系的数据:Key-Value
        2)Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        3)Map 中的 key 不允许重复,value 可以重复
        4)Map 的key 可以为 null, value 也可以为 null ，注意 key 为 null,只能有一个,value 为 null,可以多个
        5)常用 String 类作为 Map 的 key
        7)key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        */
        HashMap hashMap = new HashMap();
        hashMap.put("no1", "yyn");
        hashMap.put("no2", "yzy");
        //相同的key等于替换
        hashMap.put("no1", "yynboss");
        hashMap.put(null, "yzy2");
        hashMap.put("no3", null);
        hashMap.put(new Object(), "qq");
        System.out.println("hashmap="+hashMap);

        System.out.println("SIZE=" + hashMap.size());
        System.out.println("isEmpty=" + hashMap.isEmpty());
        hashMap.remove("no3");
        System.out.println("has contains key=" + hashMap.containsKey("no3"));
    }
}
