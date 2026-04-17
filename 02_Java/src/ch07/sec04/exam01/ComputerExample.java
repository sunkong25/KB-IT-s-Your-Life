package ch07.sec04.exam01;

public class ComputerExample {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        System.out.println(calculator.areaCircle(5.5));
        System.out.println(computer.areaCircle(5.5));
    }
}
