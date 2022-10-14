package com.java;
public class Employee {
long employeeId,employeePhone;
String employeeName,employeeAddress;
double basicSalary;
double specialAllowance;
double Hra;
Employee(){
	specialAllowance=250.80;
	Hra=1000.50;
}
Employee(long Id,String Name,String Address,long phone)
{specialAllowance=250.80;
Hra=1000.50;
	employeeId=Id;
	employeeName=Name;
	employeeAddress=Address;
	employeePhone=phone;
}
Employee(long Id,String Name,String Address,long phone,double salary)
{specialAllowance=250.80;
Hra=1000.50;
	employeeId=Id;
	employeeName=Name;
	employeeAddress=Address;
	employeePhone=phone;
	basicSalary=salary;
}
void calculateSalary() { double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
System.out.println("salary:"+salary);
}
void calculateTransportAllowance() {
	double 	transportAllowance;
	transportAllowance=10* basicSalary/100;
	System.out.println("TransportAllowance:"+transportAllowance );
}
}

