/*
 Q.3... Develop a public java class and make sure nobody can create any object of this class from outside the class
 */

package com.java;

public class Object {
	private Object() {
		System.out.println("hello ");
	}
		public static void main(String[] args) {
			
		new Object();
	}

	}

