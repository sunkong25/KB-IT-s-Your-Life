package ch08.interface_;

//public class InterMain implements InterA, InterB {
public class InterMain implements InterC {
    public void aa() {
    }

    public void bb() {
    }

    public void cc() {
    }

    public void dd() {
    }

    public static void main(String[] args) {
        System.out.println("합 = " + InterC.add(25,36));
        System.out.println("차 = " + InterC.sub(36,25));
    }}

/*
 * implements
 * - 반드시 모든 추상 메서드를 Override
 * */