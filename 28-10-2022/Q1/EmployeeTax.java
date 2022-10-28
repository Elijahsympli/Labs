package com.congnizant.tax;

public class EmployeeTax {
	public static void main(String args[]) {
TaxCalculator obj=new TaxCalculator(true,25000);
obj.calculateTax();
obj.deductTax();
obj.ValidateSalary();

}
}
