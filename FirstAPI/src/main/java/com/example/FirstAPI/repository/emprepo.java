package com.example.FirstAPI.repository;

import com.example.FirstAPI.model.empinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface emprepo extends JpaRepository <empinfo,Integer>{
    List<empinfo> findByroll(String roll);

}