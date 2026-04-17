package ch07.sec08.exam01;

public class CarExample {
    static void main(String[] args) {
        Car myCar1 = new Car(new Tire());
        myCar1.run();

        Car myCar2 = new Car(new HankookTire());
        myCar2.run();

        Car myCar3 = new Car(new KumhoTire());
        myCar3.run();
    }
}
