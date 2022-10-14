package com.java;

public class Manager extends Employee{
	
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary;
	Manager(long Id,String Name,String Address,long phone,double salary)
	{super(Id,Name,Address,phone,salary);
	
		employeeId=Id;
		employeeName=Name;
		employeeAddress=Address;
		employeePhone=phone;
		basicSalary=salary;
	}
	void calculateTransportAllowance() {
		double 	transportAllowance;
		transportAllowance=15*basicSalary/100;
		System.out.println("TransportAllowance:"+transportAllowance);
	}
}
