package reflection_.questionTest;

public class Cat {
    public String name = "yzy";

    public String color = "red";
    private int age = 12;

    public Cat() {}

    public Cat(String name) {
        this.name = name;
    }

    private Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void hi () {
        System.out.println("hi~");
    }
    private void eat(int a, String b, double c) {
        System.out.println("eat~");
    }
}
