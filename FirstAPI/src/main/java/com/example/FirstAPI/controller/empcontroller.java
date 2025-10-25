package com.example.FirstAPI.controller;

import com.example.FirstAPI.model.empinfo;
import com.example.FirstAPI.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")   // Allow frontend (JS/HTML) to call APIs
public class empcontroller {

    @Autowired
    empservice empservice;

    // Get all employees
    @GetMapping("/details")
    public List<empinfo> getAllemp() {
        return empservice.getAllemp();
    }

    // Add employee (JSON body)
    @PostMapping("/details")
    public String addemp(@RequestBody empinfo info) {
        empservice.addemp(info);
        return "added success";
    }

    // Update employee
    @PutMapping("/details")
    public String updateemp(@RequestBody empinfo info) {
        empservice.updateemp(info);
        return "update success";
    }

    // Delete employee by ID
    @DeleteMapping("/details/{id}")
    public String deleteemp(@PathVariable int id) {
        empservice.deleteempByID(id);
        return "deleted";
    }

    // Delete all employees
    @DeleteMapping("/details/clear")
    public String clearemp() {
        empservice.clearemp();
        return "clear all";
    }

    // Get employee by roll
    @GetMapping("/details/roll/{ro}")
    public List<empinfo> getempbyroll(@PathVariable("ro") String roll) {
        return empservice.getempbyroll(roll);
    }

    //  Register employee using JSON
    @PostMapping("/courses/register")
    public String job(@RequestBody empinfo info) {
        empservice.addemp(info);  // reusing the same service method
        return "Created successfully";
    }
}
