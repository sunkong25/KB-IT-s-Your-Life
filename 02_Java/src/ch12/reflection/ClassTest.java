package ch12.reflection;

import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) {
        // 생성
        Class<String> aa = String.class;

        // 클래스 이름 얻기
        System.out.println("이름 = " + aa.getName());

        // 메서드
        Method[] ar = aa.getMethods();
        for (int i = 0; i < 5; i++) {
            System.out.println("메서드 이름 = " + ar[i].getName());
        }
    }
}

/*
* Class 클래스?
* - 클래스 자체에 대한 정보를 담고 있는 클래스
* - 클래스의 구조(이름, 필드, 메서드,..)를 담고 있는 설계도의 설계도
*
* Class 클래스 생성 방법
* 1. 클래스 리터럴 사용
* Class<String> aa = String.class;
*
* 2. 인스턴스에서 얻기
* String str = "Hello";
* Class<String> aa = str.getClass();
*
* 3. 동적 로딩
* Class<String> clazz = Class.forName("java.lang.String");
*
* getName()
* getFields()
* getMethods()
* getInterfaces()
* */
