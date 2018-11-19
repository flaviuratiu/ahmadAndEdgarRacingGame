package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Engine truckEngine = new Engine();
        truckEngine.manufacturer = "Renault";
        AutoVehicle truck = new AutoVehicle(truckEngine);

        Engine testEngine = new Engine();
        testEngine.manufacturer = "BMW";

        Car testCar = new Car(testEngine);
        System.out.println(testCar);

        Engine vwEngine = new Engine();
        vwEngine.manufacturer = "Volkswagen";

        Car firstCar = new Car(vwEngine);
        firstCar.name = "Golf";
        System.out.println(firstCar.name);

        Driver firstDriver = new Driver();
        firstDriver.name = "Tony";
        firstDriver.age = 39;

        firstCar.driver = firstDriver;

        Engine renaultEngine = new Engine();
        renaultEngine.manufacturer = "Renault";

        Car car = new Car(renaultEngine);
        car.name = "Dacia";
        car.doorCount = 2;
        System.out.println(car.name);

        double traveledDistance = car.accelerate(2313.321, 321312);

        System.out.println("Traveled distance: " + traveledDistance);

    }
}
