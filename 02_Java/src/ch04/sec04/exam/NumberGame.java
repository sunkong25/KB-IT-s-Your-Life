package ch04.sec04.exam;

import java.util.Scanner;

public class NumberGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int answer = (int) (Math.random() * 100) + 1;

        while(true){
            System.out.print("숫자 입력:");
            int input = sc.nextInt();
            count++;

            if(answer == input) break;
            else if(input < answer) System.out.println(input + "보다 큰 숫자입니다.");
            else System.out.println(input + "보다 작은 숫자입니다.");
        }
        System.out.println("딩동뎅 " + count + "번만에 맞추셨습니다.");
    }
}
