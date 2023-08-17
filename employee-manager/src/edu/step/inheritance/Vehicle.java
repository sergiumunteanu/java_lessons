package edu.step.inheritance;

public class Vehicle {

    protected String name;

    public Vehicle() {

    }

    public Vehicle(String name) {
        this.name = name;
        System.out.println("VEHICLE constructor " + name);
    }

    void veryComplicatedMethod() {
        System.out.println("Vehicle is running");
    }

    private void run() {

    }
}
