package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AutoVehicle vehicle = new AutoVehicle();
        vehicle.setName("Test");
        vehicle.setColor("Red");

        double traveledDistance = vehicle.accelerate(200, 5);

        System.out.println("Regular vehicle traveled distance: " + traveledDistance);

        FakeVehicle fakeVehicle = new FakeVehicle();
        double traveledDistance2 = fakeVehicle.accelerate(200, 5);

        System.out.println("Fake vehicle traveled distance: " + traveledDistance2);
    }

}
