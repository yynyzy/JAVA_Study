public class ExerciseTest {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    public A() {
        System.out.println("a");
    }

    public A(String name) {
        System.out.println("a name");
    }

}

class B extends A {
    B(){
        this("abc");   // ->B(String name)
        System.out.println("b");
    }
    B(String name){
        super();   //A()
        System.out.println("b name");
    }
}
