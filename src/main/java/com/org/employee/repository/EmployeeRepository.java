/**
 * 
 */
package com.org.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.employee.domain.Employee;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
     
	     	
}
