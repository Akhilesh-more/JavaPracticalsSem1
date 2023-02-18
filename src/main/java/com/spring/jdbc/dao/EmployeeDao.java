package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int employeeId);
	public Employee getEmployee(int employeeId);
	public List<Employee> getAllemployees();
}
