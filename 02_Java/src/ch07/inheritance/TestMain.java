package ch07.inheritance;

class AA {
    int a = 3;

    public void dis() {
        a += 5;
        System.out.println("AA: " + a + " ");
    }
}

class BB extends AA {
    int a = 8;

    public void dis() {
        this.a += 5;
        System.out.println("BB: " + a + " ");
    }
}

public class TestMain {
    public static void main(String[] args) {
        BB xx = new BB();
        xx.dis();
        System.out.println("a = " + xx.a);
        System.out.println();

        //부모 = 자식
        AA yy = new BB();
        yy.dis();
        System.out.println("a = " + yy.a);
        System.out.println();

        BB zz = (BB) yy;
        zz.dis();
        System.out.println("a = " + zz.a);
        System.out.println();
    }
}
