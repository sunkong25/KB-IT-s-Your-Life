package ch12.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

class Pocachip {
    public void taste() {
        System.out.println("얇고 바삭한 정통 감자칩 맛 !");
    }
}

class Shrimp {
    public void taste() {
        System.out.println("짭짤하고 고소한 새우 풍미 과자 !");
    }
}

public class MagicFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 과자맛을 만들까요? (이름 입력: Pocachip 또는 Shrimp) ");
        String className = sc.next();

        try {
            //입력받은 이름으로 클래스 정보(설계도)를 찾아온다.
            Class<?> clazz = Class.forName(className);
            System.out.println("사용자가 원하는 클래스 이름 = "+clazz.getName());

            //생성 - new X
            Object obj = clazz.getDeclaredConstructor().newInstance();

            //메서드 실행
            Method method = clazz.getDeclaredMethod("taste");
            method.invoke(obj);
        } catch (Exception e) {
            System.out.println("그런 과자 없어요!!");
        }



    }
}

/*
* class Person --- 메뉴판
* new Person() --- 실제
*
* Class<Person> --- 분석 도구
* */