package com.HibernateBMSCrud.daoImpl;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateBMSCrud.config.HibernateUtil;
import com.HibernateBMSCrud.dao.BMSDao;
import com.HibernateBMSCrud.entity.BMS1;



public class BMSDaoImpl implements BMSDao{



	public void Open() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Account No");
		long acc_no=sc.nextLong();
		
		System.out.println("Enter IFSC Code:");
		String  ifsc_code=sc.next();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		BMS1 std =session.get(BMS1.class, acc_no);
		if(acc_no==std.getAcc_no() && ifsc_code==std.getIfsc_code()) {
		
		System.out.println("Enter Name:");
		String ah_name=sc.next();
		
		System.out.println("Enter Branch:");
	     String branch=sc.next();
	
	     System.out.println("Enter Account Type:");
	String acc_type=sc.next();
	
	System.out.println("Enter Balance:");
	Double balance=sc.nextDouble();
	
	System.out.println("Enter pin:");
	int pin=sc.nextInt();
		BMS1 s =new BMS1();
		
		s.setAcc_holder(ah_name);
		s.setAcc_no(acc_no);
		s.setAcc_type(acc_type);
		s.setBalance(balance);
		s.setBranch(branch);
		
		s.setIfsc_code(ifsc_code);
		s.setPin(pin);
	
		session.save(s);
		t.commit();}
		else
			System.out.println("duplicate ifsc and A/C not allowed");
	}

	public void DepBal() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter A/C no.:");
		Long acc_no=sc.nextLong();
		System.out.print("enter pin.:");
		int pin=sc.nextInt();
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		BMS1 std =session.get(BMS1.class, acc_no);
		if(acc_no==std.getAcc_no() && pin==std.getPin()) {
		System.out.println("enter amount you want to deposit:");
		double newMoney=sc.nextDouble();
	double updatedMoney=(std.getBalance()+newMoney);
	System.out.println("old balance:"+std.getBalance());
	System.out.println("updated balance:"+updatedMoney);
	System.out.println("MONEY DEPOSITED SUCCESSFULLY");

	
		session.update(std);
		System.out.println("Updated Successfully...");
		t.commit();
		}
		else
			System.out.println("Inserted Wrong Account Number or Pin");
		
	}

	public void WitBal() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter A/C no.:");
		Long acc_no=sc.nextLong();
		System.out.print("enter pin.:");
		int pin=sc.nextInt();
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		BMS1 std =session.get(BMS1.class, acc_no);
		if(acc_no==std.getAcc_no() && pin==std.getPin()) {
			System.out.print("enter amount you want to withdrawal:");
			int withdrawalMoney=sc.nextInt();
			if(std.getBalance()>withdrawalMoney) {
		double updatedMoney=(std.getBalance()- withdrawalMoney);
		System.out.println("old balance:"+std.getBalance());
		System.out.println("updated balance:"+updatedMoney);
		System.out.println("BALANCE WITHDRAWL SUCCESSFULLY");
			
	
		session.update(std);
		System.out.println("Updated Successfully...");
		t.commit();
		}
		else
			System.out.println("Inserted Wrong Account Number or Pin");
		
	}
	}
	public void ShowBal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A/C no.:");
		Long acc_no=sc.nextLong();
		System.out.print("enter pin.:");
		int pin=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		BMS1 s1 =session.get(BMS1.class, acc_no);	
		if(s1==null) 
			System.out.println("NO DATA PRESENT");

		
		else
			System.out.println("Account Holder:"+s1.getAcc_holder()+"\nAccount Number:"+s1.getAcc_no()+"\nAccount Type:"+s1.getAcc_type()+"\nBranch:"+s1.getBranch()+"\nIFSC Code:"+s1.getIfsc_code()+"\nBalance:"+s1.getBalance());

	}

	public void PinChange() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter A/C no.:");
		Long acc_no=sc.nextLong();
		System.out.print("enter pin.:");
		int pin=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		BMS1 std =session.get(BMS1.class, acc_no);
		if(acc_no==std.getAcc_no() && pin==std.getPin()) {

		System.out.println("Enter your new pin: ");
		int newpin=sc.nextInt();
		std.setPin(newpin);
		session.update(std);
		System.out.println("NEW PIN CREATED SUCCESSFULLY...");
		t.commit();
		}
		else
			System.out.println("Inserted Wrong Account Number or Pin");

	}

	public void CloseAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A/C no.:");
		Long acc_no=sc.nextLong();
		System.out.print("enter pin.:");
		int pin=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		BMS1 std =session.get(BMS1.class, acc_no);	
		if(acc_no==std.getAcc_no() && pin==std.getPin()) {

			session.delete(std);
			System.out.println("-------Account Closed-------");
			t.commit();		
		}
		else
			System.out.println("Inserted Wrong Account Number or Pin");
	}		
	}


