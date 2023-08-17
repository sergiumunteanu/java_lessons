package edu.step.inheritance;

public class Bus extends Vehicle {

    public static final double value = 20.0;

    public Bus() {
        System.out.println("AUTO constructor");
    }

    void setLocal() {
        name = "Test";
        System.out.println(this.name);
        System.out.println(super.name);
    }

    void veryComplicatedMethod() {
        super.veryComplicatedMethod();
        System.out.println("Hello from child!");
    }

    public String veryComplicatedMethodThatReturnString(String name) {
        veryComplicatedMethod();
        this.name = "Honda";
        super.name = "Test";
        return "value";
    }

    public void test(String value){
        value = "Hello world!";
    }

    public static void main(String[] args) {

        final int x = 20;
        Bus auto = new Bus();

    }
}
