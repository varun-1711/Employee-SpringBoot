package com.example.FirstAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class empinfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String roll;
    private int salary;

    //  No-arg constructor (required by JPA & Jackson)
    public empinfo() {}

    //  All-args constructor
    public empinfo(String name, String roll, int salary) {
        this.name = name;
        this.roll = roll;
        this.salary = salary;
    }

    //  Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRoll() { return roll; }
    public void setRoll(String roll) { this.roll = roll; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}
