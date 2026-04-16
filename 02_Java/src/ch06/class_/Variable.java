package ch06.class_;

public class Variable {
    int a; //필드, 초기화 in
    static int b; //필드, 초기화

    public static void main(String[] args) {
        int a = 25;//지역변수(local variable),쓰레기 값

        System.out.println("필드 a = " + new Variable().a);
        System.out.println("필드 b = " + Variable.b);
        System.out.println();

        //난수
        //0 <= 난수 < 1
        //x~y  사이의 난수
        //(int) (Math.random() * (y - x + 1) + x)

        //65('A') ~ 90('Z')
        int d = (int) (Math.random() * 26 + 65);
        System.out.println((char) d);
    }
}
