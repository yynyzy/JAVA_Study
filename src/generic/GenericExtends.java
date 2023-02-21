package yyn.study.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
//        泛型的继承和通配符说明
//         1)泛型不具备继承性
//              List<Object> list = new ArrayList<String>(); // 错误
//         2) <?>: 支持任意泛型类型
//         3) <? extends A>: 支持A类以及A类的子类，规定了泛型的上限
//         4) <? super A>: 支持A类以及A类的父类，不限于直接父类，规定了泛型的下限

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

//        List < ? > c
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

//        List < ? extends AAA > c
//        printCollection2(list1); x
//        printCollection2(list2); x
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

//        List < ? super AAA > c
        printCollection3(list1);
//        printCollection3(list2); x
        printCollection3(list3);
//        printCollection3(list4); x
//        printCollection3(list5); x
    }

    public static void printCollection1 (List < ? > c){
        for (Object object : c) { // 通配符，取出时，就是 object
            System.out.println(object);
        }
    }

//    ? extends AAA 表示 上限，可以接受 AAA或者AAA子类
    public static void printCollection2 (List < ? extends AAA > c){
        for (Object object : c) {
            System.out.println(object);
        }
    }
//     ? super 子类类名AAA:支持AAA类以及AAA类的父类，不限于直接父类,
//    规定了泛型的下限
    public static void printCollection3 (List < ? super AAA > c){
        for (Object object : c) {
            System.out.println(object);
        }
    }
}

class AAA {
}

class BB extends AAA {

}

class CC extends BB {

}
