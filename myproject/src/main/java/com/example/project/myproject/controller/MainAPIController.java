package com.example.project.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.myproject.model.EmployeeDetails;
import com.example.project.myproject.repository.EmployeeRepository;

@RestController
public class MainAPIController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping(path = "/addEmployeeDtls") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestBody EmployeeDetails empdtls) {
		employeeRepository.save(empdtls);
		return "Saved";
	}

	@GetMapping(path = "/getEmployeeDetails")
	public @ResponseBody Iterable<EmployeeDetails> getAllUsers() {
		return employeeRepository.findAll();
	}
}
