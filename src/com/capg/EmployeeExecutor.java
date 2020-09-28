package com.capg;

public class EmployeeExecutor {
	public static void main(String args[]) {
		EmployeeBuilder empWageBuilder = new EmployeeBuilder();
		 empWageBuilder.addCompanyEmpWage("Reliance",  20,  2,  10);
		 empWageBuilder.addCompanyEmpWage("BigBazar",  10,  4,  20);
		 empWageBuilder.computeEmpWage();
	}
}
