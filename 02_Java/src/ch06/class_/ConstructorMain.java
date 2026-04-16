package ch06.class_;

public class ConstructorMain {
    private String name;
    private int age;

    public ConstructorMain() {
        System.out.println("default 생성자");
    }

    public ConstructorMain(String name) {
        System.out.println("생성자 - name");
        this.name = name;
    }

    public ConstructorMain(int age) {
        //Overload된 다른 생성자를 호출
//        this("kim");
        this();
        System.out.println("생성자 - age");
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorMain constructorMain = new ConstructorMain();
        System.out.println(constructorMain.name + ", " + constructorMain.age);

        ConstructorMain constructorMain2 = new ConstructorMain("홍길동");
        System.out.println(constructorMain2.name+", "+constructorMain2.age);

        ConstructorMain constructorMain3 = new ConstructorMain(25);
        System.out.println(constructorMain3.name+", "+constructorMain3.age);
    }
}
