package com.HibernateBMSCrud;

import java.util.Scanner;

import com.HibernateBMSCrud.daoImpl.BMSDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
    	BMSDaoImpl dao=new BMSDaoImpl();
    	char c;
    	do {
    		Scanner sc =new Scanner(System.in);
    		System.out.println("Press 1 to open an account \n Press 2 to deposit \n Press 3 Show Balance \n Press 4 to withdraw \n Press 6 to Change pin  \n Press 7 to Close Account \n press 5 for Exit");
    		int a =sc.nextInt();
    		switch(a) {
    		case 1:dao.Open();
    		break;
    		case 2:dao.DepBal();
    		break;
    		case 3:dao.ShowBal();
    		break;
    		case 4:dao.WitBal();
    		break;
    		case 6:dao.PinChange();
    		break;
    		case 7:dao.CloseAccount();
    		break;
    		case 5:System.exit(0);
    		default: System.out.println("Invalid Choice!");
    		}
    		System.out.println("Do you want to continue? Y/N");
    		c=sc.next().charAt(0);
    		
    	}
    	while(c=='y' || c=='Y');
    	
    	System.out.println("Thank You");
    }    }

