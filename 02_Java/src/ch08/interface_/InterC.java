package ch08.interface_;

public interface InterC extends InterA, InterB {
    //void ff(); - InterMain.java에서 반드시 재구현해야한다.

   // default 메서드
    // interMain.java에서 Override해도 되고 안해도 됨
    default void ff() {
        System.out.println("default method");
    }

    //static 메서드
    //InterMain.java에서 Override 하면 안된다.
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a- b;
    }
}
