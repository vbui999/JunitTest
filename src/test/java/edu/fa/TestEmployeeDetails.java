/*
* (C) Copyright 2019 VanToan Bui
* 
*	@author toanb
*	@date 1 kwi 2019
*	@version 1.0
*/
package edu.fa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {

	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employeeDetails = new EmployeeDetails();
	
	//test to check appraisal
	@Test
	public void testCaculateAppraisal() {
		employeeDetails.setName("Toan");
		employeeDetails.setAge(28);
		employeeDetails.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.caculateAppraisal(employeeDetails);
		assertEquals(500, appraisal, 0.0);
	}

	//test to check yearly salary
	@Test
	public void testCaculateYearlySalary() {
		employeeDetails.setName("Toan");
		employeeDetails.setAge(28);
		employeeDetails.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.caculateYearlySalary(employeeDetails);
		assertEquals(96000, salary, 0.0);
		
	}

}
