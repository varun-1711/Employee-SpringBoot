package com.example.FirstAPI.service;

import com.example.FirstAPI.model.empinfo;
import com.example.FirstAPI.repository.emprepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class empservice {

    @Autowired
    private emprepo emprepo;

    // Get all employees
    public List<empinfo> getAllemp() {
        return emprepo.findAll();
    }

    // Add employee
    public void addemp(empinfo info) {
        emprepo.save(info);
    }

    // Update employee
    public void updateemp(empinfo info) {
        emprepo.save(info);
    }

    // Delete employee by ID
    public void deleteempByID(int id) {
        emprepo.deleteById(id);
    }

    // Delete all employees
    public void clearemp() {
        emprepo.deleteAll();
    }

    // Get employee by roll
    public List<empinfo> getempbyroll(String roll) {
        return emprepo.findByroll(roll);
    }
}
