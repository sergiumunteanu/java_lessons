package edu.step.people;

public class Accountant extends Employee{

    public Accountant() {
        salary = 2500;
    }

    @Override
    public void work() {
        System.out.println("I am calculating salaries");
    }
}
