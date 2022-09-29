package com.cognizant.geometry;

import com.cognizant.shapes.Circle;

public class Shape {
public static void main(String args[]) {
	Circle c=new Circle();
	
	Circle c2=new Circle(4,3.5f);
	System.out.println("Area of a circle id "+c.calculateCircleArea(3.5f, 5));
	System.out.println("Circumference of a circle is "+c.calculateCircumference(3.5f, 4));
}
}
