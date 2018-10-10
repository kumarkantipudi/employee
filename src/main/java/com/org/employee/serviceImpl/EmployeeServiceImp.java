/**
 * 
 */
package com.org.employee.serviceImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.org.employee.domain.Employee;
import com.org.employee.repository.EmployeeRepository;
import com.org.employee.service.IEmployeeService;

/**
 * @author vijayendrakantipudi
 *
 */

@Service
public class EmployeeServiceImp implements IEmployeeService{
	
	@Value("${employee.jsonfile}")
	String jsonFile;
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployeeDetails() throws Exception {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bf = new BufferedReader(new FileReader(jsonFile))){
			String ln = null;
			while((ln = bf.readLine()) != null) {
				sb.append(ln);
			}
			System.out.println("value of sb is  ---------------------------------------------------" +sb.toString());
			Gson gson = new Gson();
			
			List<Employee> employee = gson.fromJson(sb.toString(), new TypeToken<List<Employee>>(){}.getType());
			System.out.println("employeeVO is ======================================================" + employee);
			employeeRepository.save(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		  
		}
	}

	@Override
	public List<Employee> retriveEmployeeDetails() {
		List<Employee>employee =  employeeRepository.findAll();
		return employee;
		
	}
}
