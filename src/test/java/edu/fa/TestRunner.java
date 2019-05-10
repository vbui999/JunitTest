/*
* (C) Copyright 2019 VanToan Bui
* 
*	@author toanb
*	@date 1 kwi 2019
*	@version 1.0
*/
package edu.fa;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
