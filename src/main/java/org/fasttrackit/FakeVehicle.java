package org.fasttrackit;

public class FakeVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Cheating... ha ha!");

        return 2 * speed * durationInHours;
    }
}
