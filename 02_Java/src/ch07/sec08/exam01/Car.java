package ch07.sec08.exam01;

public class Car {
    public Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public Car(HankookTire tire) {
        this.tire = tire;
    }

    public Car(KumhoTire tire) {
        this.tire = tire;
    }

    public void run() {
        tire.roll();
    }
}
