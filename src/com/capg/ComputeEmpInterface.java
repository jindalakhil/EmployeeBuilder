package com.capg;

public interface ComputeEmpInterface {
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);

}
