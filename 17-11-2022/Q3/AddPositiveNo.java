package Lab;
/*
 Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.
 */
public class AddPositiveNo {
public int addTwopositive(int n1 ,int n2) {
	
	if(n1>0 &&n2>0)
		return n1+n2;
	else
		throw new ArithmeticException("Non-Positive integer sent");
	
}
public static void main(String args[]) {
	try {
		System.out.println("Sum="+new AddPositiveNo().addTwopositive(1,2));
	}
catch(ArithmeticException a) {
		System.out.println( "Non-Positive integer sent");
	}
	finally {
		System.out.println( "This finally block");
	}
	
}
}
