package Lab;
/*
 2. create a java program to read n print the content to/from the file
   Note: display two options 1 for store data 2 for print data,
   if user press 1 then read the data from console and store it in file, 
   if user press 2 print the data from the file
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Q2File {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 to read the data from console and store it in file\n     OR    \n enter 2 to print the data from the file");
		int n=sc.nextInt();
	try {
		
	if(n==1) {
		String s=sc.next();
FileOutputStream fo=new FileOutputStream("C:\\TestInputoutput\\Test2.txt");
byte b1[]=s.getBytes();

fo.write(b1);
System.out.println("Done");
fo.close();
}
	else if(n==2) {
		FileInputStream f=new FileInputStream("C:\\TestInputoutput\\Test2.txt");

BufferedInputStream b= new BufferedInputStream(f);
int i;
while((i=b.read())!=-1)  {
	System.out.print((char)i);  //convert it into character
}

f.close();
	b.close();
	}
	}
catch(Exception e) {
		System.out.println(e);
	}
}}
