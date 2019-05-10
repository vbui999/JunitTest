/*
* (C) Copyright 2019 VanToan Bui
* 
*	@author toanb
*	@date 1 kwi 2019
*	@version 1.0
*/
package edu.fa;

public class EmpBusinessLogic {

	//Caculate the yearly salary of employee
	public double caculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary()*12;		
		return yearlySalary;
	}
	
	//Caculate the appraisal amount of employee
	public double caculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if (employeeDetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		}else {
			appraisal = 1000;
		}
		return appraisal;
	}
	
}