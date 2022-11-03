package com.java;
/*
 Q.3   we need to print the elements of the array which are present in odd positions. 
 This can be accomplished by looping through the array and printing the elements
  of an array by incrementing i by 2 till the end of the array is reached
 */
public class ArrayOddPosition {
	public static void main(String args[]) {

		  char a[]={'a','b','c','d','e'};
		  System.out.print("Element of an array:");
		  for(int i=0;i<a.length;i++)
			  System.out.print(a[i]+" ");
		  System.out.println("\nElement of an array which are present in odd position:");
		  for(int i=0;i<a.length;i+=2)
			  System.out.println(a[i]);
		 
		  
		}

}
