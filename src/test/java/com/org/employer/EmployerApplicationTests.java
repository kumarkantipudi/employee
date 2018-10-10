package com.org.employer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.org.employee.service.IEmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployerApplicationTests {
	
	@Autowired
	IEmployeeService iEmployeeService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void saveEmployeeDetailsTest() {
		try {
			iEmployeeService.saveEmployeeDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
