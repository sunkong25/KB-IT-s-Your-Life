package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B ab = new A.B();
        System.out.println(ab.field1);
        ab.method1();
        System.out.println(A.B.field2);
        A.B.method2();
    }
}
