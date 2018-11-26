package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Engine truckEngine = new Engine();
        truckEngine.setManufacturer("Renault");
        AutoVehicle truck = new AutoVehicle(truckEngine);

        Engine testEngine = new Engine();
        testEngine.setManufacturer("BMW");

        Car testCar = new Car(testEngine);
        System.out.println(testCar);

        Engine vwEngine = new Engine();
        vwEngine.setManufacturer("Volkswagen");

        Car firstCar = new Car(vwEngine);
        firstCar.setName("Golf");
        System.out.println(firstCar.getName());

        Driver firstDriver = new Driver();
        firstDriver.setName("Tony");
        firstDriver.setAge(39);

        firstCar.setDriver(firstDriver);

        Engine renaultEngine = new Engine();
        renaultEngine.setManufacturer("Renault");

        Car car = new Car(renaultEngine);
        car.setName("    Dacia  fdasfdsaafdsa  ");
        car.setDoorCount(2);
        System.out.println(car.getName());

        double traveledDistance = car.accelerate(2313.321, 321312);

        System.out.println("Traveled distance: " + traveledDistance);

    }
}
