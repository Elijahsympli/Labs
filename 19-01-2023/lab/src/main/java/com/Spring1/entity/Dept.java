package com.Spring1.entity;

public class Dept {
	private String deptname;
	private String headdept;
	


	public Dept(String  deptname,String headdept) {
		super();
		this.deptname=deptname;
		this.headdept=headdept;

	}
	public String toString() {
		return "Dept[Head Department=" + headdept +",Department Name=" +deptname +"]";
	}
}
