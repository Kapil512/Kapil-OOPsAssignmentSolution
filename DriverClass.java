package com.greatlearning.service;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
	HrDepartment H1 = new HrDepartment();
	TechDepartment T1 = new TechDepartment();
	AdminDepartment A1 = new AdminDepartment();
	
	A1.departmentName();
	A1.getTodaysWork();
	A1.getWorkDeadline();
	A1.isTodayAHoliday();
	System.out.println("");
	
	H1.departmentName();
	H1.doActivity();
	H1.getTodaysWork();
	H1.getWorkDeadline();
	H1.isTodayAHoliday();
	System.out.println("");
	
	
	T1.departmentName();
	T1.getTodaysWork();
	T1.getWorkDeadline();
	T1.getTechStackInformation();
	T1.isTodayAHoliday();
	System.out.println("");
	
		
	}
}
