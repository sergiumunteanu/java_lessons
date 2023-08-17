package edu.step.people;

import java.util.Scanner;

public class AvgSalaryCalculator {
    public static void main(String[] args) {
//        Programmer p = new Programmer();
//        p.salary = 1000;
//        Programmer p2 = new Programmer();
//        p2.salary = 2000;
//        Manager m = new Manager();
//        m.salary = 5000;
//        Teacher t = new Teacher();
//        t.salary = 1500;

        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Please enter the type: ");
            String type = scanner.nextLine();
            switch (type) {
                case "p": {
                    employees[i] = new Programmer();
                    break;
                }
                case "m": {
                    employees[i] = new Manager();
                    break;
                }
                case "a": {
                    employees[i] = new Accountant();
                    break;
                }
                default: {
                    employees[i] = new Teacher();
                }
            }
        }

        for (Employee e: employees) {
            e.work();
        }

        double total = 0;
        for(Employee e: employees) {
            total += e.salary;
        }

        System.out.println("Average salary is " + (total/ employees.length));

//        double avg = (p.salary + m.salary + t.salary) / 3;
    }
}
