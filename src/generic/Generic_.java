package yyn.study.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_ {
    public static void main(String[] args) {
//        泛型
//        1) 编译时，检查添加元素的类型，提高了安全性
//        2) 减少了类型转换的次数,提高效率
//        3) 不再提示编译警告
        Person<String> stringPerson = new Person<String>("yyn");
        stringPerson.show();

//        泛型使用细节
//        1) 给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
         List<Integer> list = new ArrayList<Integer>(); //0K
//         List<int> List2 = new ArrayList<int>();// 错误 Type argument cannot be of primitive type

//        2) 在给泛型指定具体类型后，可以传入该类型或者其子类类型
    }
}

class Person <E> {
    E name;

    public Person(E name) {
        this.name = name;
    }

    public E show  () {
        System.out.println("name.class=" + this.name.getClass());
        return this.name;
    }
}
