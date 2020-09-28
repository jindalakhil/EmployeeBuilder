package com.capg;

public class EmployeeExecutor {
	public static void main(String args[]) {
		EmployeeBuilder obj = new EmployeeBuilder();
		System.out.println("Total Emp Wage: "+ obj.computeWage("Reliance", 15, 25 , 100));
		System.out.println("Total Emp Wage: "+ obj.computeWage("BigBazar", 20, 27 , 90));	
	}
}
