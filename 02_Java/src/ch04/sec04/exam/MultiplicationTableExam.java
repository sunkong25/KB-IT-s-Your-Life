package ch04.sec04.exam;

public class MultiplicationTableExam {
    static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = i * 2 + (i - 1); k < i * 2 + (i - 1) + 3; k++) {
                    if(k == 10) continue;
                    System.out.print(k + " * " + j + " = " + k * j + "  ");
                }
                System.out.println();
            }
        }
    }
}
