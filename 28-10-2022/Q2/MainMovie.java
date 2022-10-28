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

	public void set_movie(String m,String mst,String met,int mtp){
		movieName=m;
		movieStartTime=mst;
		movieEndTime=met;
		MovieTicketPrice=mtp;
	}
	
	
	public void get_movie(){
		System.out.println("Movie Name:"+movieName+"\nMovie Start Time"+movieStartTime+"\nMovie End Time:"+movieEndTime+"\nMovie Price Ticket:"+MovieTicketPrice);
	}
	
	
	
}
public class MainMovie {

	public static void main(String[] args) {
	

		Movie obj=new Movie( );
		
		obj.set_movie("tha","1:00 Pm","3:00 Pm",200);
		
		obj.get_movie();
	}

}
