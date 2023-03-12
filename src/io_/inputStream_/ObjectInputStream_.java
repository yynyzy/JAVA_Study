package io_.inputStream_;

import io_.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
//    1.序列化和反序列化序列化就是在保存数据时，保存数据的值和数据类型
//    2.反序列化就是在恢复数据时，恢复数据的值和数据类型
//    3.需要让某个对象支持序列化机制，则必须让其类是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接口之一:
//        - Serializable // 这是一个标记接口，没有方法
//        - Externalizable

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        1.功能: 提供了对基本类型或对象类型的序列化和反序列化的方法
//        2.ObjectOutputStream  提供 序列化功能
//        3.ObjectInputStream   提供 反序列化功能

//        1.读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
        String srcPath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(srcPath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息=" + dog); // 底层 Object -> Dog

        // 1.如果我们希望调用Dog的方法，需要向下转型
        // 2.需要我们将Dog类的定义，拷贝到可以引用的位置
        Dog dog2 = (Dog)dog ;
        System.out.println(dog2.getName()); //旺财..

        if (ois != null) {
            ois.close();
        }

    }
}
