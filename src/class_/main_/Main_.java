package class_.main_;

public class Main_ {

    public static void main(String[] args) {
        /*
        * 1）main 方法必须是 public， java 虚拟机需要调用类的 main() 方法
        * 2）该方法接受 String 类型的数组参数，该数组中保存执行 java 命令时传递给所以运行的类的参数
        * 3）在 main 方法中我们可以调用这个类的静态方法和静态属性
        * 4）不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的静态成员
        * */
        for (int i = 0;i< args.length;i++){
            System.out.println("agrs["+ i +"]="+ args[i]);
        }
        Main_.A();
        System.out.println(Main_.D);

        Main_ main_ = new Main_();
        main_.B();
        System.out.println(main_.C);
    }

    public static void A (){
        System.out.println("A");
    }

    public  void B (){
        System.out.println("B");
    }

    public int C = 10;
    public static  int D = 9;
}
