package com.java;

public class Trainee extends Employee{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary;
	Trainee(long Id,String Name,String Address,long phone,double salary)
	{
		super(Id,Name,Address,phone,salary);
		
		employeeId=Id;
		employeeName=Name;
		employeeAddress=Address;
		employeePhone=phone;
		basicSalary=salary;
		
	}
	
}
