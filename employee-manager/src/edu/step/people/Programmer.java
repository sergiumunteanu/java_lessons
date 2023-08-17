package edu.step.people;

public class Programmer extends Employee{


    public Programmer() {
        salary = 1000;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){


        this.salary = salary;
    }
    @Override
    public void work() {
        System.out.println("I am writing the code");
    }
}
