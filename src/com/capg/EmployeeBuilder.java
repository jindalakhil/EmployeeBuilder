package com.capg;

public class EmployeeBuilder {
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;

	public static int computeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int totalEmpWage = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + "empHrs : " + empHrs);
			}
			totalEmpWage = totalEmpHrs * empRatePerHour;
			System.out.println("Total Emp Wage for Company: " +company+" is: "+ totalEmpWage);
			return totalEmpWage;
	}
}
