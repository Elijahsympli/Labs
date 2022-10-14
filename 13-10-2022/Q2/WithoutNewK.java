/*
 Q.2... Write a java class to develop an employee class object & initialized the emp 
 name & emp Id for 5 Emp. now write another class having name and from this class 
 you have to create 5 employee objects but you are not allowed to use new keyword.
 */

package com.java;

class employee1{
	static String empName;
	static int empId;
	static void create(int id ,String name) {
		empId=id;
		empName=name;
		System.out.println(empId+"                "+empName);
	}
}
public class WithoutNewK {
public static void main(String args[]) {
	System.out.println("Employee Id   Employee Name");
	employee1.create(1, "Ire");
	employee1.create(2, "Ele");
	employee1.create(3, "Wonder");
	employee1.create(4, "Sha");
	employee1.create(5, "Eli");
}
}

