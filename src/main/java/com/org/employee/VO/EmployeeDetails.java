/**
 * 
 */
package com.org.employee.VO;

import java.util.List;

/**
 * @author vijayendrakantipudi
 *
 */
public class EmployeeDetails {
	
	private List<EmployeeVO> employeeVo;

	/**
	 * @return the employeeVo
	 */
	public List<EmployeeVO> getEmployeeVo() {
		return employeeVo;
	}

	/**
	 * @param employeeVo the employeeVo to set
	 */
	public void setEmployeeVo(List<EmployeeVO> employeeVo) {
		this.employeeVo = employeeVo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDetails [employeeVo=" + employeeVo + "]";
	}


}
