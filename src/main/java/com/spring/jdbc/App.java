package com.spring.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "The Program has been started...!" );
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
             
        EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDao.class);
          
        
      //INSERT
//        Employee employee = new Employee();
//        employee.setId(3);
//        employee.setName("Atharva");
//        employee.setSalary(50000);
//        int result = employeeDao.insert(employee);
//        System.out.println("Employee Added: "+result);
         
        
        //UPDATE
//        Employee employee = new Employee();
//        employee.setId(3);
//        employee.setName("Rutik");
//        employee.setSalary(3330);
//        int result = employeeDao.update(employee);
//        System.out.println("Employee Updated: "+result);
//        
       //DELETE
//       int result = employeeDao.delete(3); 
//       System.out.println("Employee deleted: "+result);
         
        
        //Selecting single row
//        Employee result = employeeDao.getEmployee(1);
//        System.out.println(result);
        
        
        //Selecting the entire table
        List<Employee> employees = employeeDao.getAllemployees();
        for(Employee s:employees) {
        	System.out.println(s);
        }
    }
}
