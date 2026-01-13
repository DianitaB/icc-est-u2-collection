package models;

public class Person implements Comparable <Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person -> Name: " + name + ", age: " + age + "]";
    }

    @Override
    public int compareTo(Person o) {
        int comN = this.name.compareTo(o.getName());
        if(comN != 0) return comN;
        int comE = Integer.compare(this.age, o.getAge());
        return comE;
    }
}
