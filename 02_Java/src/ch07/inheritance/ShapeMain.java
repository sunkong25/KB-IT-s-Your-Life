package ch07.inheritance;

import java.util.Scanner;

class ShapeEx {
    protected double area;
    Scanner scan = new Scanner(System.in);

    public ShapeEx() {
        System.out.println("ShapeEx 기본 생성자");
    }

    public void calcArea() {
        System.out.println("도형을 계산합니다.");
    }

    public void disArea() {
        System.out.println("도형을 출력합니다.");
    }
}

class SamEx extends ShapeEx {
    private int base;
    private int height;

    public SamEx() {
        System.out.println("SamEx 기본 생성자");
        System.out.print("밑변 : ");
        base = scan.nextInt();
        System.out.print("높이 : ");
        height = scan.nextInt();
    }

    @Override
    public void calcArea() {
        area = (double) base * height / 2;
    }

    @Override
    public void disArea() {
        System.out.println("삼각형의 넓이: " + area);
    }
}

class SaEx extends ShapeEx {
    private int width;
    private int height;

    public SaEx() {
        System.out.println("SamEx 기본 생성자");
        System.out.print("가로 : ");
        width = scan.nextInt();
        System.out.print("세로 : ");
        height = scan.nextInt();
    }

    @Override
    public void calcArea() {
        area = (double) width * height;
    }

    @Override
    public void disArea() {
        System.out.println("사각형의 넓이: " + area);
    }
}

class SadariEx extends ShapeEx {
    private int top;
    private int bottom;
    private int height;

    public SadariEx() {
        System.out.println("SamEx 기본 생성자");
        System.out.print("윗변 : ");
        top = scan.nextInt();
        System.out.print("밑변 : ");
        bottom = scan.nextInt();
        System.out.print("높이 : ");
        height = scan.nextInt();
    }

    @Override
    public void calcArea() {
        area = (double) (top + bottom) * height / 2;
    }

    @Override
    public void disArea() {
        System.out.println("사다리꼴의 넓이: " + area);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
//        SamEx sam = new SamEx();
//        sam.calcArea();
//        sam.disArea();
//
//        SaEx sa = new SaEx();
//        sa.calcArea();
//        sa.disArea();
//
//        SadariEx sadari = new SadariEx();
//        sadari.calcArea();
//        sadari.disArea();

        // 부모 = 자식, 다형성
        ShapeEx shape;

        shape = new SamEx();
        shape.calcArea();
        shape.disArea();
        System.out.println();

        shape = new SaEx();
        shape.calcArea();
        shape.disArea();
        System.out.println();

        shape = new SadariEx();
        shape.calcArea();
        shape.disArea();
    }
}
