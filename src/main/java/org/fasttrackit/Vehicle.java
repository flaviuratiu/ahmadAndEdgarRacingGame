package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private Driver driver;

    // method signature: return type (void or something else) + name + list of params (0 or more)
    public double accelerate(double speed, double durationInHours) {
        // method body
        System.out.println("Acceleration speed:" + speed);
        return speed * durationInHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

