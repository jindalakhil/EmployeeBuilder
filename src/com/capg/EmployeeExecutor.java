package com.capg;

public class EmployeeExecutor {
	public static void main(String args[]) {
		EmployeeBuilder obj = new EmployeeBuilder();
		System.out.println("Total Emp Wage: "+ obj.computeWage());
	}
}
