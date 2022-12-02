package Lab;

import java.io.FileInputStream;
import  java.io.ByteArrayInputStream;
public class Q3F {
	public static void main(String args[]) {
	try {
		
FileInputStream f=new FileInputStream("C:\\TestInputoutput\\Test2.txt");
byte fd[]=new byte[1000];
int i=0;
while((i=f.read(fd))>0) {
	System.out.println(new String(fd,0,i));
}
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}