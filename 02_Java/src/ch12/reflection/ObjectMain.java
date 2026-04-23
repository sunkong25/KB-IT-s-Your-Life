package ch12.reflection;

class Test extends Object {
    public String toString() {
        return "딸기";
    }
}

public class ObjectMain {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("객체 t = " + t);
        System.out.println("객체 t = " + t.toString());
        System.out.println("객체 t = " + t.hashCode());
        System.out.println();

        String str = new String("apple");
        System.out.println("객체 str = " + str); //클래스명@16진수

        Object aa = new Object();
        Object bb = new Object();
        System.out.println("aa == bb : " + (aa == bb)); //주소값
        System.out.println("aa.eqals(bb) : " + (aa.equals(bb))); //주소값 비교

        Object cc = new String("apple");
        Object dd = new String("apple");
        System.out.println("cc == dd : " + (cc == dd)); //주소값
        System.out.println("cc.eqals(dd) : " + (cc.equals(dd))); //문자열
    }
}
