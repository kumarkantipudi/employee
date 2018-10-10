/**
 * 
 */
package com.org.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.employee.domain.Employee;
import com.org.employee.service.IEmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * @author vijayendrakantipudi
 *
 */

@RestController
@RequestMapping("/employeeDetails")
@Api(value = "employeeController", description = "cntroller to save and get employer details")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@ApiOperation(value = "Save employee details", nickname = "saveEmpDetails", consumes = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(method = RequestMethod.GET, path = "/readFile")
	public void saveEmployeeDetails(@RequestHeader(value="admin", required=true) String user) throws Exception{
		employeeService.saveEmployeeDetails();
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(method = RequestMethod.GET, path = "/get_details")
	public List<Employee> retriveEmployeeDetails(@RequestHeader(value="admin", required=true) String user) {
		return employeeService.retriveEmployeeDetails();
	}
}
