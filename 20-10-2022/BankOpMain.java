package com.java;
class BankOp{
	private int accountNumber;
	private String accountName;
	private float accountBalance;
	public void createAccount(int acno,String acna,float accba){
		accountNumber=acno;
		accountName=acna;
		accountBalance=accba;
		System.out.println("Account Name:"+accountName);
		System.out.println("Account Number:"+accountNumber);
		
System.out.println("Account Balance:"+accountBalance);
	
	}
	public void set_Amount(float amt){//using setter method{
		this.accountBalance-=amt;
		}
	public float get_Amount(){//using setter method{
		return this.accountBalance;
		}
	
}
public class BankOpMain {
public static void main(String args[]) {
	BankOp bo=new BankOp();
	BankOp bo1=new BankOp();
	System.out.println("Customer 1:");
	bo.createAccount(3157, "carl", 10000);
	bo.set_Amount(5000);
	System.out.println("After withdraw account balance:"+bo.get_Amount());
	System.out.println("\nCustomer 2:");
	bo1.createAccount(3145, "josh", 90000);
	bo1.set_Amount(70000);
	System.out.println("After withdraw account balance:"+bo1.get_Amount());
	
}
}
