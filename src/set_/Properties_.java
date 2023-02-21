package set_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //1.Properties 继承 Hashtable
        //2.可以通过 k-v 存放数据，当然key 和 value 不能为 null
        //增加
        Properties properties = new Properties();
        properties.put("john", 100);
//        properties.put(null, 100); // 抛出 空指针异常
//        properties.put("john",null); // 抛出 空指针异常
         properties.put("lic",100);
         properties.put("lic",88); // 相同的 key 会被替换
        System.out.println("properties" + properties);

//        通过 k 获取对应值
        System.out.println(properties.get("lic"));

//        删除
        properties.remove("lic");
        System.out.println("properties=" + properties);
    }
}
