package io_.outputStream_;

import io_.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//注意事项和细节说明
//        1) 读写顺序要一致
//        2) 要求序列化或反序列化对象 ，需要 实现 Serializable
//        3) 序列化的类中建议添加 SerialVersionUID,为了提高版本的兼容性
//        4) 序列化对象时，默认将里面所有属性都进行序列化，但除了 static 或 transient 修饰的成员
//        5) 序列化对象时，要求里面属性的类型也需要实现序列化接口
//        6)序列化具备可继承性,也就是如果某类已经实现了序列化，则它的所有子类也已经默认实现了序列化

public class ObjectOutputStream_ {
//        1.功能: 提供了对基本类型或对象类型的序列化和反序列化的方法
//        2.ObjectOutputStream  提供 序列化功能
//        3.ObjectInputStream   提供 反序列化功能

    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "C:\\Users\\maiscrm\\IdeaProjects\\JAVA_Study\\src\\main\\java\\io_\\data.dat";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(100);         // int -> Integer (实现了 Serializable)
            oos.writeBoolean(true); // boolean -> Boolean (实现了 Serializable)
            oos.writeChar('a');     // char -> Character (实现了 Serializable)
            oos.writeDouble(9.5);   // double -> Double (实现了 Serializable)
            oos.writeUTF("要注意");  // string
            oos.writeObject(new Dog("lz", 18));

            System.out.println("数据序列化完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
