package com.java;
//Q.1   Write a Java program to test if an array contains a specific value
import java.util.Scanner;
public class CheckArrayCSV {
public static void main(String args[]) {
int l=0;
int a[]={2,1,3,6,7};
System.out.println("Element of an array:");
for(int i=0;i<a.length;i++)
	  System.out.print(a[i]+" ");
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter a number to check its present in an array:");
int src=sc.nextInt();

for(int i=0;i<a.length;i++) {
	  if(a[i]==src) {
		  l++;
	  }
}
if(l==0) 
	  System.out.println("False");
else
	  System.out.println("True");
}
}
