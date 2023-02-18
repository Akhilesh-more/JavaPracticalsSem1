package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Employee employee) {
		String query = "insert into employee(id,name,salary) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getSalary());
		return r;
	}
	
	
	
	public int update(Employee employee) {
		// updating query
		String query = "update employee set name=?, salary=? where id=?";
		int r = this.jdbcTemplate.update(query,employee.getName(),employee.getSalary(),employee.getId());
		return r;
	}
	
	public int delete(int employeeId) {
		String query = "delete from employee where id=?";
		int r = this.jdbcTemplate.update(query,employeeId);
		return r;
	}
	
	public Employee getEmployee(int employeeId) {
		//Selecting single employee data
		String query = "select * from employee where id=?";
		RowMapper <Employee> rowMapper = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper, employeeId);
		return employee;
	}
	
	public List<Employee> getAllemployees() {
		// Selecting all data
		String query = "select * from employee";
		List<Employee> employee = this.jdbcTemplate.query(query,new RowMapperImpl());
		return employee;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	








	
	
}
