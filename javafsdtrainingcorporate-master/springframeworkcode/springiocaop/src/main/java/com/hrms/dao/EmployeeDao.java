package com.hrms.dao;

import org.springframework.stereotype.Repository;

import com.hrms.pojo.EmployeePojo;

public interface EmployeeDao {
	
	EmployeePojo getEmployee(int empId);

	EmployeePojo saveEmployee(EmployeePojo employeePojo);


}
