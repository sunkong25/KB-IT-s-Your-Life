package ch06.class_;

class StaticTest {
    int a; //필드, 초기값, 인스턴스 변수(반드시 new 해야 한다.)
    static int b; //필드, 초기값, 클래스 변수

    static {
        System.out.println("static 초기화 영역");
        b = 10;
    }

    public StaticTest() {
        System.out.println("default 생성자");
        a = 10;
    }

    public void calc() {
        a++;
        b++;
    }

    public void display() {
        System.out.println(a + ", " + b);
    }

    //static메서드 안에는 static 변수만 사용 가능
    public static void output() {
//        System.out.println(this.a + ", " + StaticTest.b);
    }
}

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(StaticTest.b);
        System.out.println();

        StaticTest st = new StaticTest();
        System.out.println(st.a);
        st.calc();
        st.display();
        System.out.println();

        StaticTest bb = new StaticTest();
        bb.calc();
        bb.display();
        System.out.println();

        StaticTest cc = new StaticTest();
        cc.calc();
        cc.display();
        System.out.println();
    }
}
