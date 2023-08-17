package org.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double sallary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name, String department, double sallary){
        this.setId(id);
        this.setName(name);
        this.setDepartment(department);
        this.setSallary(sallary);
    }

    public Employee(String name, String department, double sallary){
        this.setName(name);
        this.setDepartment(department);
        this.setSallary(sallary);
    }


}
