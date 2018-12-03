package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;

    // Constructor overloading example
    public AutoVehicle() {
        this(new Engine());
    }

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Co-variant return type example (not necessarily the best example)
    // Access modifier in overridden method is more permissive
    @Override
    public AutoVehicle returnMyself() {
        return this;
    }

}
