package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private Driver driver;
    private double mileage;
    private double fuelLevel;
    private double traveledDistance;

    // useless method just to demonstrate co-variant return types and extending access in overridden method
    protected Vehicle returnMyself() {
        return this;
    }

    // method signature: return type (void or something else) + name + list of params (0 or more)
    protected double accelerate(double speed, double durationInHours) {
        // method body
        System.out.println("Acceleration speed:" + speed);
        double distance = speed * durationInHours;

        double consumedFuel = mileage / distance * 100;

        System.out.println("Consumed fuel: " + consumedFuel);

        // this is the same as: fuelLevel = fuelLevel - consumedFuel;
        fuelLevel -= consumedFuel;

        traveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + name + ": " + traveledDistance);
        return distance;
    }

    // Method overloading example
    public double accelerate(double speed) {
        return accelerate(speed, 1);
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

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    // Use Alt + Insert to override the toString() method

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", driver=" + driver +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                '}';
    }
}

