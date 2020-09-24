package com.capg;

public class EmployeeBuilder {
	public static void main(String[] args) {
		int Full_time = 1;
		int Emp_Rate = 20;
		int hours = 0;
		int Wage = 0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == Full_time) {
			hours = 8;
			System.out.println("Employee is present and that'swhy wage for 8 hours will be provided");
		}
		else { 
			hours = 0;
			System.out.println("Employee is Absent");
		}
		Wage = hours*Emp_Rate;
		System.out.println("Employee wage for the day is " + Wage);
	}
}
