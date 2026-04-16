package ch06.class_;

class Person {
    private String name;
    private int age;

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

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setData() {
    }
}

public class PersonMain {
    static void main(String[] args) {
        Person person = new Person();
        person.setName("홍길동");
        person.setAge(25);
        System.out.println(person.getName() + ", " + person.getAge());

        Person p2 = new Person();
        p2.setData("또치", 30);
        System.out.println(p2.getName() + ", " + p2.getAge());

        Person p3 = new Person();
        p3.setData();
        System.out.println(p3.getName() + ", " + p3.getAge());
    }
}
