package ch07.sec10.exam02;

public class AbstractMethodExample {
    static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    //단일 책임의 원칙 -> 우는 행위에 대한 패턴을 전달받아 실행
    //전략 패턴
    public static void animalSound(Animal animal) {
        animal.sound();// 재정의된 메소드 호출
    }
}
