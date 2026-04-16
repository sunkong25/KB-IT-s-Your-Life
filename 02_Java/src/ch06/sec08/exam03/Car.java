package ch06.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (this.gas == 0) {
            System.out.println("gas를 주입하세요.");
            return false;
        } else {
            return true;
        }
    }

    void run() {
        while (true) {
            if (gas <= 0) {
                System.out.println("멈춥니다.(gas잔량: " + this.gas + ")");
                break;
            }
            System.out.println("달립니다.(gas잔량: " + this.gas + ")");
            this.gas--;
        }
    }
}
