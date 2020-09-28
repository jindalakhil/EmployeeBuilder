package com.capg;
import java.util.*;

public class EmployeeBuilder implements ComputeEmpInterface {
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;
	
	
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyToEmpWageMap;
	
    public EmployeeBuilder() {
    	companyEmpWageList = new ArrayList<>();
    	companyToEmpWageMap = new HashMap<>();
    }
	
    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth ) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);

    }
    @Override
	public void computeEmpWage() {
    	for(int i = 0; i < companyEmpWageList.size(); i++){
		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
      }
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;


		while (totalEmpHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()* 10)% 3;

			switch (empCheck) {
			case IS_PART_TIME:
				empHours = 4;
				break;
			case IS_FULL_TIME:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}


			totalEmpHours += empHours;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr:  " + empHours);
		}
       return totalEmpHours * companyEmpWage.empRatePerHour;

	}
	
	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
}
