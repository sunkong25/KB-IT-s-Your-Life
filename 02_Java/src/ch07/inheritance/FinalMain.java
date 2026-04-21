package ch07.inheritance;

import ch07.exam.sec10.exam02.Animal;

enum ColorEnum {
    RED, GREEN, BLUE
}

class Final {
    /*public static final int RED = 0; //상수화
    public static final int GREEN = 1;
    public static final int BLUE = 2;*/

    public final String FRUIT = "사과";
    public final String FRUIT2;

    public static final String ANIMAL = "호랑이";
    public static final String ANIMAL2;

    public Final() {
        FRUIT2 = "딸기";
    }

    static {
        ANIMAL2 = "기린";
    }
}

public class FinalMain {
    public static void main(String[] args) {
        System.out.println("빨강 = " + ColorEnum.RED);
        System.out.println("빨강 = " + ColorEnum.RED.ordinal());
        System.out.println();

        for (ColorEnum data : ColorEnum.values()) {
            System.out.println(data.ordinal() + ":" + data);
        }
        System.out.println();

        Final f = new Final();
        System.out.println("ANIMAL " + Final.ANIMAL);
        System.out.println("FRUIT " + f.FRUIT);
        System.out.println("FRUIT2 " + f.FRUIT2);
        System.out.println("ANIMAL2 " + f.ANIMAL2);
    }
}
