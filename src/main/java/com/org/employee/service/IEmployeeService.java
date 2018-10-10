/**
 * 
 */
package com.org.employee.service;

import java.util.List;

import com.org.employee.domain.Employee;

/**
 * @author vijayendrakantipudi
 *
 */
public interface IEmployeeService {
	
 public void saveEmployeeDetails() throws Exception;
 public List<Employee> retriveEmployeeDetails();

}
