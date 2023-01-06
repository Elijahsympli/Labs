package com.Lab;
	import java.sql.Connection;
	import java.sql.DriverManager;
		import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import ro.Helper;
class MyException extends Exception{ //Created a custom Exception
	MyException(String str){
		super(str);
	}
}
public class CollegeManagementSystem {
	Scanner sc=new Scanner(System.in);
	int rld;
	String deptd;
			void Insert() throws SQLException, ClassNotFoundException, MyException {
			
				
				System.out.println("Enter Student name:");
				String sname=sc.next();
				System.out.println("Enter Student roll no.");
				int rl=sc.nextInt();
				
				Connection conn=Helper.con();
			//creating statement
				PreparedStatement stm;
				Statement stmt=conn.createStatement();
				ResultSet rs1=stmt.executeQuery("select deptName from cdepartment");
				System.out.println("List of Department Avialable:");
				int i=1;
while(rs1.next()) {
	
	System.out.println(i+"."+rs1.getString(1));
	i++;
}
				System.out.println("Enter Department name:");
				String dept=sc.next();
				ResultSet rs2=stmt.executeQuery("select * from cdepartment where deptName='"+dept+"'");
if(!rs2.next())
	throw new MyException("   PLEASE ENTER THE AVIALABLE DEPARTMENT ONLY");

				
					ResultSet rs=stmt.executeQuery("select * from cs where rollno="+rl +" and dept='"+dept+"'");
if(rs.next()) {
	throw new MyException("duplicate Roll no. in same department not allowed");

}
else {	
	System.out.println("Enter Student Id");
	int id=sc.nextInt();
	System.out.println("Enter Student age:");
	int age=sc.nextInt();
	System.out.println("Enter Student Gender:");
	String sg=sc.next();
	System.out.println("Enter Student phone:");
	long  sphone=sc.nextLong();
	System.out.println("Enter Student email:");
	String semail=sc.next();
	//inserting data into database table
					String sql="insert into cs values(?,?,?,?,?,?,?,?)";//no of column
					stm=conn.prepareStatement(sql);
					stm.setInt(1, id);
					stm.setString(2,sname);
					stm.setInt(3, rl);

					stm.setString(4,sg);
					stm.setInt(5,age);
					stm.setLong(6,sphone);
					
					stm.setString(7, semail);
					stm.setString(8, dept);
					
					stm.execute();
					System.out.println("inserted succesfully");
}
			}
				void storeDepartmentDetails() throws SQLException, ClassNotFoundException {
				
					System.out.println("Enter dept id");
					int dept_id=sc.nextInt();
					System.out.println("Enter dept name:");
					String dept_name=sc.next();
				
					System.out.println("Enter head of the dept:");
					String dept_head=sc.next();
					System.out.println("Enter dept description:");
					String dept_dscrpt=sc.next();
				
					//get connection step no2
						Connection conn=Helper.con();
					//creating statement
						PreparedStatement stm;
						//inserting data into database table
						String sql="insert into departmentA values(?,?,?,?)";//no of column
						stm=conn.prepareStatement(sql);
						stm.setInt(1, dept_id);
						stm.setString(2,dept_name);
						stm.setString(3,dept_head);
						stm.setString(4,dept_dscrpt);
						
						
						stm.execute();
						System.out.println("inserted succesfully\n");
			
			}
				void DisplayData(int id)throws SQLException, ClassNotFoundException, MyException{
					int i=0;
					
						Connection conn=Helper.con();
					
						Statement stmt=conn.createStatement();
					//execute query fetch data from database step no4
						ResultSet rs=stmt.executeQuery("select * from cs ");
						//iteration
						
					while(rs.next()) {
System.err.println("Name: "+rs.getString(2)+" |   Roll No.: "+rs.getInt(3)+" |  Gender: "+rs.getString(4)+" |   Age: "+rs.getInt(5)+" |   Phone No.: "+rs.getLong(6)+" |   Email: "+rs.getString(7)+" |   Department: "+rs.getString(8));
							i=1;
						}
					if(i==0)
						{
					throw new MyException("                                           NO DATA PRESENT");
						}
						//close database connection step no5
						conn.close();
					
					
						
				}
				void DeleteData() throws SQLException, MyException {
					int i=0;
					System.out.print("enter student roll no.:");
					int rl=sc.nextInt();
					sc.nextLine(); 
					System.out.print("enter student department:");
					String dept=sc.nextLine();
						Connection conn=Helper.con();
						//createStatement() method of Connection interface is used to create
						//and store inside the object of Statement
						Statement stmt=conn.createStatement();
						ResultSet rs =stmt.executeQuery("select rollno,dept from cs where rollno="+rl+" and dept ='"+dept+"'");
						//executeQuery() method of Statement interface is used to execute queries
						//to the database, inside object of ResultSet interface
				
						while(rs.next()) {//getting the column of each record in the table
							rld=rs.getInt(1);
							deptd=rs.getString(2);
							i=1;
						}
						if(i==0) {
							throw new MyException("                            INSERTED WRONG ROLL NO. OR DEPARTMENT PLEASE CHECK");
						}
						
						else {
							stmt.executeUpdate("delete from cs where rollno="+rl+" and dept='"+dept+"'");
					System.err.println("                                  -------Data Deleted Successfully-------");
					}
					
					}
				void InsertDept() throws SQLException, ClassNotFoundException, MyException {
					
		
					System.out.println("Enter Department name:");
					String dept=sc.nextLine();
				
					
				
					System.out.println("Enter Head Department name:");
					String headdept=sc.nextLine();
					
					int j = 0;
						
						Connection conn=Helper.con();
						
						PreparedStatement stm;
						Statement stmt=conn.createStatement();
						ResultSet rs1=stmt.executeQuery("select count(*) from cdepartment");
						while(rs1.next())
						j=rs1.getInt(1);
						ResultSet rs=stmt.executeQuery("select * from cdepartment where headdept='"+headdept+"'");

						if(rs.next() && j!=0) {
		throw new MyException("         ONE  HEAD OF DEPARTMENT FOR  ONE DEPARTMENT ONLY");

	}
	else {	
		
		//inserting data into database table
						String sql="insert into cdepartment values(?,?)";//no of column
						stm=conn.prepareStatement(sql);
						stm.setString(1, dept );
						stm.setString(2,headdept);
					
					
						
						
						stm.execute();
						System.out.println("inserted succesfully");
	}
				}
				
				void DisplaySelectDeptData()throws SQLException, ClassNotFoundException, MyException{
					
				
						//register driver step no1
					//get connection step no2
						Connection conn=Helper.con();
					//create statement step no 3
						Statement stmt=conn.createStatement();
						ResultSet rs1=stmt.executeQuery("select deptName from cdepartment");
						System.out.println("List of Department Avialable:");
						int i=1;
		while(rs1.next()) {
			
			System.out.println(i+"."+rs1.getString(1));
			i++;
		}
		System.out.println("Enter Department name:");
		String dept=sc.nextLine();
		ResultSet rs2=stmt.executeQuery("select * from cdepartment where deptName='"+dept+"'");
		if(!rs2.next())
			throw new MyException("   WRONG DEPARTMENT ENTERED PLEASE CHECK");
					//execute query fetch data from database step no4
						ResultSet rs=stmt.executeQuery("select name,rollno,gender,age,phone,email,dept from cs where dept='"+dept +"' ");
						//iteration
						System.err.println("                     ----------DISPLAYING STUDENT DETAILS OF INSERTED DEPARTMENT NAME --------");

					if(rs.next()) {
System.err.println("Name: "+rs.getString(1)+" |   Roll No.: "+rs.getInt(2)+" |  Gender: "+rs.getString(3)+" |   Age: "+rs.getInt(4)+" |   Phone No.: "+rs.getLong(5)+" |   Email: "+rs.getString(6)+" |   Department: "+rs.getString(7));
						
						}
					else
						{
					throw new MyException("                                           NO DATA PRESENT");
						}
						//close database connection step no5
						conn.close();
					
					
						
				}
				void InsertStaff() throws SQLException, ClassNotFoundException, MyException {
					
					
					System.out.println("Enter Staff Id:");
					int StaffId=sc.nextInt();				
					sc.nextLine();
					System.out.println("Enter the staff name:");
					String name=sc.nextLine();
			
						
						Connection conn=Helper.con();
						
						PreparedStatement stm;
						Statement stmt=conn.createStatement();
						ResultSet rs1=stmt.executeQuery("select deptName from cdepartment");
						System.out.println("List of Department Avialable:");
						int i=1;
		while(rs1.next()) {
			
			System.out.println(i+"."+rs1.getString(1));
			i++;
		}
		
		System.out.println("Enter Department Name.");
String dept=sc.nextLine();
						ResultSet rs2=stmt.executeQuery("select * from cdepartment where deptName='"+dept+"'");
						if(!rs2.next())
							throw new MyException("   PLEASE ENTER THE AVIALABLE DEPARTMENT ONLY");

		//inserting data into database table
						String sql="insert into staff values(?,?,?)";//no of column
						stm=conn.prepareStatement(sql);
						stm.setInt(1, StaffId);
						stm.setString(2,name);
						stm.setString(3, dept);
						stm.execute();
						System.out.println("inserted succesfully");
	}
	void DisplayHeaddept()throws SQLException, ClassNotFoundException, MyException{
					int i=0;
					
						Connection conn=Helper.con();
					//create statement step no 3
						Statement stmt=conn.createStatement();
					//execute query fetch data from database step no4
						ResultSet rs=stmt.executeQuery("select * from cdepartment ");
						//iteration
						System.err.println("                     ----------DISPLAYING HEAD OF DEPARTMENT OF DIFFERENT DEPARTMENT --------");

					while(rs.next()) {
System.err.println("             Department Name: "+rs.getString(1)+" |   Head Department: "+rs.getString(2));
						i=1;	
						}
					if(i==0)
						{
					throw new MyException("                                           NO DATA PRESENT");
						}
						//close database connection step no5
						conn.close();
					
					
						
				}
	void DisplayStaffdept()throws SQLException, ClassNotFoundException, MyException{
		int i=1,j=1;
			Connection conn=Helper.con();
		//create statement step no 3
			Statement stmt=conn.createStatement();
			
			ResultSet rs3=stmt.executeQuery("select deptName from cdepartment");
			System.out.println("List of Department Avialable:");
			
while(rs3.next()) {

System.out.println(j+"."+rs3.getString(1));
j++;
}
System.out.println("Enter Department name:");
String dept=sc.nextLine();
ResultSet rs2=stmt.executeQuery("select * from cdepartment where deptName='"+dept+"'");
if(!rs2.next())
throw new MyException("  ENTERED DEPARTMENT DOESN'T EXIST PLEASE CHECK");
		//execute query fetch data from database step no4
			ResultSet rs=stmt.executeQuery("select headdept  from cdepartment where deptName='"+dept+"'");
			//iteration
			System.err.println("                     ----------DISPLAYING STAFF OF A DEPARTMENT --------");
if(rs.next()) {
	
	System.err.println(" THE HEAD OF "+dept+" DEPARTMENT IS " +rs.getString(1));
System.err.println(dept+" Department Staff:");}
ResultSet rs1=stmt.executeQuery("select headdept,deptName,staffName  from cdepartment  inner join staff  on workIndept='"+dept+"' and deptName='"+dept+"'");


		while(rs1.next()) {
System.err.println(i+"."+rs1.getString(3));
			i++;
	
			}
		if(i==1)
			{
		throw new MyException("                                           NO DATA PRESENT");
			}
			//close database connection step no5
			conn.close();
		
		
			
	}
	
				
		public static void main(String agrs[]) throws ClassNotFoundException, SQLException{
				Scanner sc=new Scanner(System.in);
			CollegeManagementSystem eu=new CollegeManagementSystem();
			int no = 0;
			do {
			 try {
	
				System.out.println("press 1. To Insert Student Data");
				System.out.println("press 2. To Display Student Data"); 
				System.out.println("press 3. To Delete Student Data ");
				System.out.println("press 4. To Insert Department Data");
				System.out.println("press 5. To Display Student Data From Any one Inserted Department Name"); 
				System.out.println("press 6. To Insert Staff Data");
				System.out.println("press 7. To Display Head of Department of Different Department");
				System.out.println("press 8. To Display Staff Under one Department");

				System.out.println("0.To exit");
				 no=sc.nextInt();
				
			switch(no) {
			case 1:
				eu.Insert();
				break;
			case 2:
				System.err.println("                            ---------DISPLAY STUDENT DETAILS--------");
				eu.DisplayData(no);
				break;
			case 3:
				eu.DeleteData();
				break;
			case 4:
				eu.InsertDept();
				break;
			case 5:
				eu.DisplaySelectDeptData();
				break;
			case 6:
				eu.InsertStaff();
				break;
			case 7:
				eu.DisplayHeaddept();
				break;
			case 8:
				eu.DisplayStaffdept();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("PLEASE ENTER FROM THE GIVEN OPTIONS ONLY");
			}
			}
			catch(MyException e) {
				System.err.println(e.getMessage());
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
			}
			while(no!=0);

			}
		}
