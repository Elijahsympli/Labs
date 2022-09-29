package com.cognizant.shapes;

public class Circle {
float radius;
float pi;
public Circle(){
	radius=1.5f;
}
public Circle(float radius){
	this.radius=radius;
	Circle ci=new Circle(radius,3.5f);
	
}

public Circle(float radius,float pi){
	this.radius=radius;
	this.pi=pi;

}
public float calculateCircleArea(float pi,float r) {
	return pi*r*r;
}
public float calculateCircumference(float pi,float r) {
	return 2*pi*r;
}
}
