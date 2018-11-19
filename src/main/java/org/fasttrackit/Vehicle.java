package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    Driver driver;

    // method signature: return type (void or something else) + name + list of params (0 or more)
    double accelerate(double speed, double durationInHours) {
        // method body
        System.out.println("Acceleration speed:" + speed);
        return speed * durationInHours;
    }

}

