package com.java;

public class InheritanceeActivity {
public static void main(String args[]) {
	Manager m=new Manager(126534,"peter","Chennai India",237844,65000);
	System.out.print("Manager ");
	m.calculateSalary();
	m.calculateTransportAllowance();
	Trainee t=new Trainee(29846,"jack","Mumbai India",442085,45000);
	System.out.print("Trainee ");
	t.calculateSalary();
	t.calculateTransportAllowance();
}
}
