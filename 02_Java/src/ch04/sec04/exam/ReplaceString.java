package ch04.sec04.exam;

import java.util.Scanner;

public class ReplaceString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = sc.next();
        System.out.print("현재 문자열 입력: ");
        String curInput = sc.next();
        System.out.print("바꿀 문자열 입력: ");
        String changeInput = sc.next();

        if (input.length() < curInput.length()) System.out.print("입력한 문자열의 크기가 작습니다\n치환 할 수 없습니다");
        String lower = input.toLowerCase();
        String curLower = curInput.toLowerCase();

        int count = 0;
        int index = 0;
        int n = 0;
        while (true) {
            n = lower.indexOf(curLower, index); //인덱스 지정해서 거기서부터 가능
            if(n == -1) break;

            count++;
            index = n + curLower.length();
        }
        String result = input.replace(curLower, changeInput); //replace는 전부 변경해줌
        System.out.println(result);
        System.out.println(count + "번 치환");
    }
}
