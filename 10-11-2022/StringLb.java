package Lab;

import java.util.StringTokenizer;

public class StringLb {
	int l,i;
char str(String st) {
	 l=st.length();
	return st.charAt(4);
}
int fOcc(String st) {
	
	for( i=0;i<st.length();i++)
	{
		if(st.charAt(i)=='a') {
			System.out.println(st.charAt(i));
			break;
		}
	}
		
	return i;
}
String ps(String st) {
	String str=st.substring(3, 10);
	
	return str;
}
String lowercase(String st)
{
	return st.toLowerCase();
}
	public static void main(String args[])
{		
		String ck=null;
		int p;
		String str="welcome",s2="Welcome to Java World";
		StringBuffer sbff=new StringBuffer("This is StringBuffer");

		StringBuffer s3=new StringBuffer(s2);
		StringLb s =new StringLb();
		StringTokenizer sk=new StringTokenizer(s2);

		System.out.println("the character at 5th position:"+s.str(s2));
		while(sk.hasMoreTokens()) {
			System.out.println();
			if(sk.nextToken(" ").equalsIgnoreCase(str)) {
			System.out.println(str+":"+"True");
			break;
			}
			else {
				System.out.println(str+":"+"False");
				break;
			}
		}
		System.out.println(s2+" Let us learn");
		System.out.println("the position of the first occurrence of character a :"+s.fOcc(s2));
		for(int i=0;i<s3.length();i++) {
			p=i;
			if(s3.charAt(i)=='a')
				s3.replace(i,p+1,"e");
		}
		System.out.println("After 	Replaces all the occurrences of ‘a’ character with the new ‘e’:\n"+s3);
		System.out.println("Returned string between 4th position and 10th position:\n"+s.ps(s2));
		System.out.println("Returns the lowercase of the string :\n"+s.lowercase(s2));
	
		System.out.println("String:"+sbff+"\nAdds the string: "+(sbff.insert(sbff.length()," This is a sample program")));
		System.out.println("Reversing the entire string '"+sbff+"':\n"+sbff.reverse());
		sbff.reverse();
		System.out.println("Replacing the word Buffer with Builder :\n"+sbff.replace(14,20,"Builder"));
		StringTokenizer sk1=new StringTokenizer("C:\\IBM||DB2||PROGRAM\\DB2COPY1.EXE");

		StringTokenizer sk3=new StringTokenizer("Drive:|Folder:|File:");
		while(sk3.hasMoreTokens() && sk1.hasMoreTokens()) {//boolean method its check if there is more token available or not
			System.out.print(sk3.nextToken("|"));//string method it returns the next token from stringTokenizer method
			
			
				System.out.println(sk1.nextToken("\\"));
			
			}
		
}
}
