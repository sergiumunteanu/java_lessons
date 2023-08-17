package org.example;

import org.example.db.Employee;
import org.example.db.JavaLessonsDB;

public class Main{
    public static void main(String[] args) {

        JavaLessonsDB db = new JavaLessonsDB();
        db.create(new Employee("Ion", "IT", 3500));

        db.selectAll();
    }


}