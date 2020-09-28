package com.capg;

public class EmployeeExecutor {
	public static void main(String args[]) {
		EmployeeBuilder reliance = new EmployeeBuilder("Reliance", 15, 25, 100);
		EmployeeBuilder bigBazar = new EmployeeBuilder("BigBazar", 20, 27, 90);
		reliance.computeEmpWage();
	    System.out.println(reliance);
	    bigBazar.computeEmpWage();
	    System.out.println(bigBazar);
	}
}
