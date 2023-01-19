package com.Spring1.entity;


public class Student {
	private int id;
	private String sname;
	private Dept dept;//aggregation
	public Student() {
		System.out.println("def cons");
	}
	public Student(int id,String sname,Dept dept) {
		super();
		this.id=id;
		this.sname=sname;
		this.dept=dept;
	}
	public void display() {
		System.out.println(id+" "+sname);
		System.out.println(dept.toString());
	}
}
