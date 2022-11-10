package Lab;
/*
 Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters 
 */
import java.util.Scanner;
public class RmDuplctChar {
public static void main(String args[]) {
	StringBuffer nstr=null;
	StringBuffer s=new StringBuffer("Anudip Foundation Skill & carreer developement centre ");
	//Scanner sc=new Scanner(System.in);
	//String str=sc.next();
	String str="Famous";
	System.out.println("The given String is:"+s);

	System.out.println("The given mask string is -"+str);
	int p;
	for(int j=0;j<s.length();j++) {
		p=j;
		for(int i=0;i<str.length();i++) {
			
			if(s.charAt(j)==str.charAt(i)) {
				nstr=	s.delete(j, p+1);
			}}}
	
System.out.println("After removing duplicate characters from a given string the new string is:\n "+nstr);
}}
