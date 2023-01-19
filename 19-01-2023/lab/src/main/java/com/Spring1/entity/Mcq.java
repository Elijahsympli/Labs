package com.Spring1.entity;

import java.util.Iterator;
import java.util.List;
//constructor injection with collection--- constructor args-- List, Set & Map
public class Mcq {
private int id;
private String sname;
private List<String>ans;
public Mcq() {
	
}
public Mcq(int id,String sname,List<String>ans) {
	super();
	this.id=id;
	this.sname=sname;
	this.ans=ans;
	
}
public void display() {
	System.out.println(id+" "+sname);
	System.out.println("Answers are:");
Iterator <String> itr=ans.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}

}
