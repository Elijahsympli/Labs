package com.Spring1.entity;

public class Employee {
	private double salary;
private String ename;
public Employee() {
	System.out.println("def cons");
	
}
	
public Employee(double salary) {
	this.salary=salary;
}
public Employee(String ename) {
	this.ename=ename;
}
public Employee(double salary,String ename) {
	this.salary=salary;
	this.ename=ename;
}

public void display() {
	System.out.println("Name:"+ename+"\nSalary:"+ salary);	
}
}
