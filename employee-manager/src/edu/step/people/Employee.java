//package edu.step.people;
//
//public class Employee {
//
//    protected double salary;
//    protected String name;
//    protected String qualification;
//
//
//    public void work() {
//
//    }
//
//}

package edu.step.people;

import edu.step.inheritance.Auto;
import edu.step.inheritance.abstract_classes.Circle;
import edu.step.inheritance.abstract_classes.Square;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

    protected double salary;
    protected String name; // "ION" "ion"
    protected String qualification;
    protected String[] values;

    public Employee() {
    }

    public Employee(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public void work() {

    }

    // john - this; employee - peter
    // john.equals(peter);
    @Override
    public boolean equals(Object obj) {
        // x.equals(x) - trebuie sa fie true
        // x.equals(y) - true, y.equals(x) - true
        // x.equals(y) - true, y.equals(z) - true ---> x.equals(z) -- true
        // x.equals(y)
        // x.equals(null) trebuie sa returneze false

        if(obj == null) {
            return false;
        }
        // 1. Verificam daca noi nu comparam aceiasi instanta (==)
        if(this == obj) {
            return true;
        }
        // 2. Care e clasa obiectului obj?
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Employee other = (Employee) obj;
        boolean arrayEqual = true;
        for (int i = 0; i < this.values.length; i++) {
            if(!this.values[i].equals(other.values[i])) {
                arrayEqual = false;
                break;
            }
        }
        // 3. Verificam egalitatea campurile
        return this.name.equals(other.name)
                && this.qualification.equals(other.qualification)
                && this.salary == other.salary
                && Arrays.equals(this.values, other.values);
    }

    public static void main(String[] args) {
        Object o = new Employee();
        Employee john = new Employee("John", "Java programmer");
        Employee peter = new Employee("Peter", "Java programmer");


        boolean correctEquals = john.equals(peter);
        boolean check = john.equals(null);
        boolean c1 = john.equals(new Auto());
        boolean c2 = john.equals(new Square("red"));
        boolean c3 = john.equals(new Circle("red"));
        System.out.println(correctEquals);



        Employee johnCopy = john;
        Scanner sc = new Scanner(System.in);
        int x = 30;
        int y = 30;
        boolean isEqual = x == y;

        boolean objectEqual = john == johnCopy;

    }

    // new ArrayList
    // new LinkedList
    // new Set
    // new HashMap

}
