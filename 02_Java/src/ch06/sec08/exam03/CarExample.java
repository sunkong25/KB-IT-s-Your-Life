package ch06.sec08.exam03;

public class CarExample {
    static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("gas가 있습니다.");
        System.out.println("출발합니다.");
        myCar.setGas(5);
        while (myCar.isLeftGas()) {
            myCar.run();
        }
    }
}
