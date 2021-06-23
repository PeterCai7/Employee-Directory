package com.petercai.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petercai.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("api")
public class EmployeeRestController {
	
	
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return null;
	}
}
