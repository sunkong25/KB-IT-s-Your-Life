package ch09.nested;

public class Outer {
    // has ~ a 관계 -> 중첩클래스
    // is ~ a 관계 -> 상속 관계
    private String name;

    public void print() {
        System.out.println("이름 = " + name + "  나이 = " + new Inner().age);
    }

    class Inner {
        private int age;

        public void disp() {
            System.out.println("이름 = " + name + "  나이 = " + age);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name = "홍길동";
        outer.print();

        Outer.Inner inner = outer.new Inner();
        inner.age = 25;
        inner.disp();

        Outer.Inner inner2 = outer.new Inner();
        inner2.age = 30;
        inner2.disp();

        Outer.Inner inner3 = new Outer().new Inner();
        inner3.age = 90;
        inner3.disp();
    }
}
