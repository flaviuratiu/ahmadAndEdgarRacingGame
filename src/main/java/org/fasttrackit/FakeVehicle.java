package org.fasttrackit;

public class FakeVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Cheating... ha ha!");

        return 2 * speed * durationInHours;
    }

    // Method used to demonstrate type casting since it's not available in the parent class
    public void disappear() {
        System.out.println("Where am I?");
    }
}
