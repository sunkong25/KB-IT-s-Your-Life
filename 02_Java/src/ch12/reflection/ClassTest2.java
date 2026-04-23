package ch12.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public void disp() {
        System.out.println("Hello !!");
    }
}

public class ClassTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName("ch12.reflection.Person");//풀 쿼리 네임으로 작성해야됨

        // 클래스 이름
        System.out.println("클래스 이름 = " + clazz.getName());

        // 필드
        Field[] ar = clazz.getDeclaredFields();
        for (Field x : ar) {
            System.out.println("필드명 = " + x.getName());
        }

        //생성
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true); //private 무시
        name.set(obj, "홍길동");
        System.out.println("name : " + name.get(obj));

        //메서드
        Method method = clazz.getDeclaredMethod("disp");
        method.invoke(obj); // 실행
    }
}

/*
* 리플렉션 (Reflection)
* - 프로그램이 실행 중에 자기 자신이나 다른 객체의 내부 구조를 검사하고 수정하는 기법이다.
* - 실행 중에 클래스 정보를 분석하고, 객체를 만들고(new X), 값을 바꾸고, 메서드를 실행하는 기술이다.
* */
