package Lab;
/*
 Problem code 2:
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.
 */
class NegativeNumber extends Exception{
	public NegativeNumber(String str) {
		super(str);
	}
}
public class ExceptionNegativeNo {
	int x,y;
	public void checkage(int x,int y)throws NegativeNumber{
		this.x=x;
		this.y=y;
		if(-20<=x && y<=20) 
			throw new NegativeNumber("NegativeNumber");
		else 
			System.out.println("java.lang.Exception: x and y should not be zero.");
	}
		public static void main(String[] args) throws NegativeNumber {
			new ExceptionNegativeNo().checkage(-7,2);
		}
}
