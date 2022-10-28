package com.congnizant.tax;

public class TaxCalculator {
	float basicSalary;
	boolean citizenship;
	float tax,nettSalary;
	TaxCalculator(boolean m,float basicSalary){
		this.basicSalary=basicSalary;
		citizenship=m;
	}
	public void calculateTax(){
		tax=30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+basicSalary+" is"+tax);
	}
	public void deductTax() {
		 float nettS=basicSalary-tax;
		 int  nettSalary= (int) nettS; 
		 System.out.println("The nett salary of the employee "+nettSalary);
	}
	public void ValidateSalary() {
		if (basicSalary>100000 && citizenship==true) {
			System.out.println("The salary and citizenship eligibility:"+citizenship);
			
		}
		else
			System.out.println("The salary and citizenship eligibility:"+false);

	}
}
