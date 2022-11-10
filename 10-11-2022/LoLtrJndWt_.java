package Lab;
//Write a Java program to find sequences of lowercase letters joined with a underscore.
public class LoLtrJndWt_ {
public static void main(String args[]) {
	String str="java_Exercises";
	int b = 0;
	for (int i=0;i<str.length();i++) {
		if(str.charAt(i)=='_') {
			for(int j=i+1;j<str.length();j++) {
			if(str.charAt(j)>='a'&& str.charAt(j)<='z') 
			b=0;
			
			else {
				b=1;
				System.out.println("False");
				break;
			}
			}
			}
		else if(b==1)
			break;
	}
	if(b==0)
		System.out.println("True");
}
}
