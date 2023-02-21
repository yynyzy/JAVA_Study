package set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employer("yyn", 18));
        hashSet.add(new Employer("yyn", 18));
        hashSet.add(new Employer("yzy", 17));
        // 不修改Employer的 hashCode 和 equals 方法，就会有两个对象
        System.out.println("hashset" + hashSet);
    }
}

class Employer {
    private String name;
    private int age;

    Employer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return age == employer.age && Objects.equals(name, employer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
