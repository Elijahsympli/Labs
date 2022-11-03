package com.java;
//Q.2   Write a Java program to find the duplicate values of an array of integer values
public class DuplicateArrayELe {
		public static void main(String args[]) {
			int l=0;
			  int a[]={2,3,3,2,4,3,2,2};
			  int ck[]=new int[a.length];
			  int c[]=new int[a.length];
			  System.out.println("Element of an array:");
			  for(int i=0;i<a.length;i++)
				  System.out.print(a[i]+" ");
			  System.out.println();
			  for(int j=0;j<a.length;j++) {
			ck[j]=0;
			  for(int i=j+1;i<a.length;i++) {
				  if(a[j]==a[i]) {
					ck[j]+=1; 
					c[j]=a[j];
				  }
			  }
			  }
			  for(int k=0;k<c.length;k++) {
			  for(int j=k-1;j>0;j--)
			  if(c[k]==c[j]) {
				  l=1;
				  break;
			  }
				  if(ck[k]>0 && l==0)
				  System.out.println(c[k]+" appears "+(ck[k]+1)+" times");
				
			}
			  }
	}






