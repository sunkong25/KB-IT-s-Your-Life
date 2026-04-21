package ch08.sec10;

import ch08.sec10.exam02.Bus;
import ch08.sec10.exam02.Vehicle;

public class CastingExample {
    static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}