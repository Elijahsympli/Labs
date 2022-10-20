package com.java;
/*Problem 3. 
Program to create library book Management systemto store and display book details in library where you can 
create two classes one is main another one is library, where you can create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variable*/
import java.util.Scanner;
class library{
	int bookId;
	String bookName;
	String bookAuthor;
	public void addBook(int bi,String bn,String ba) {
		bookId=bi;
		bookName=bn;
		bookAuthor=ba;
		System.out.println("Book Id:"+bookId);
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Author:"+bookAuthor);
	}
	public void dispanseBook(String dp) {
		if(bookName.equals(dp))
		System.out.println(dp+" Book is taken by me.");
		else	
			System.out.println("Sorry "+dp+" Book is not avialable.");
	}
}
public class libraryMain {
public static void main(String args[]) {
	int bi;
	String ba,bn,tk;
	library lb=new library();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 if you want to add a book");
	int en=sc.nextInt();
	if (en==1) {
		System.out.println("Enter  Book Id:");
		bi=sc.nextInt();
		System.out.println("Enter  Book Name:");
		bn=sc.next();
		System.out.println("Enter Book Author:");
		ba=sc.next();
		lb.addBook(bi, bn,ba);
	}
	System.out.println("Enter the name of the book you wanna take:");
	tk=sc.next();
	lb.dispanseBook(tk);
}
}
