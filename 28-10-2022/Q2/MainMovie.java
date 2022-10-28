package com.java;
/*
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables

*/

class Movie{
	 String movieName;
	 String movieStartTime,movieEndTime;
	 int MovieTicketPrice;

	public void set_moviename(String m){
		movieName=m;
	}
	public void set_moviestarttime(String m){
		movieStartTime=m;
	}
	public void set_movieendtime(String m){
		movieEndTime=m;
	}
	public void set_movieticketprice(int m){
		MovieTicketPrice=m;
	}
	
	
	public String get_moviename(){
		return movieName;
	}
	public String get_moviestarttime(){
		return movieStartTime;
	}
	public String get_movieendtime(){
		return movieEndTime;
	}
	public int get_movieticketprice(){
		return MovieTicketPrice;
	}
	
	
}
public class MainMovie {

	public static void main(String[] args) {
	

		Movie obj=new Movie( );
		
		obj.set_moviename("tha");
		
		obj.set_moviestarttime("1:00 Pm");
		
		obj.set_movieendtime("3:00 Pm");
		
		obj.set_movieticketprice(200);
		
		System.out.println("Movie Name:-"+obj.get_moviename());
		System.out.println("Movie Start Time:-"+obj.get_moviestarttime());
		System.out.println("Movie End Time:-"+obj.get_movieendtime());
		System.out.println("Movie Price Ticket-:"+obj.get_movieticketprice());
		
	}

}
