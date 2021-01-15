package com.vehicles;

/**
 * Class that inherits the Vehicle class.
 * Represents a vehicle of type Truck.
 */
public class Truck extends Vehicle {
    /**
     * Constructor method, calls super with predefined values.
     */
    public Truck() {
        super("Autoutilitar", 3, 6);
    }

    /**
     * @return representation of object as a string
     */
    @Override
    public String toString() {
        return "Truck.";
    }
}
