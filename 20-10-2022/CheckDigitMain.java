package com.java;
import java.util.Scanner;
//Write a Java method to check whether every digit of a given integer 
//is even. Return true if every digit is odd otherwise false?
class CheckDigit{
	int num,rem,i=0;
	public boolean Check(int num) {
		while(num!=0) {
			rem=num%10;
			if(rem%2==0) {
				i=1;
			}
			else if(i==1) {
				i=2;
				break;
			}
			else
				i=0;
			
			num=num/10;
		}
		if(i==0)
		return true;
		else if(i==1) {
			System.out.println("Every digits of a given number is even");
		return false;}
		else	
			return false;
	}
}
public class CheckDigitMain {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int no=sc.nextInt();
	
CheckDigit ck=new CheckDigit();
System.out.println(ck.Check(no));

}
}
