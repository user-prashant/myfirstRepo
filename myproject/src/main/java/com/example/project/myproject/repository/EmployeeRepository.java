package com.example.project.myproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.project.myproject.model.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Integer> {

}
