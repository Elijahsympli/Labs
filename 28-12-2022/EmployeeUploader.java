package com.Lab;


	import java.sql.Connection;

	import java.sql.DriverManager;
	
		import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


class IDNotFoundException extends Exception{ //Created a custom Exception
	IDNotFoundException(String str){
		super(str);
	}
}
class InvalidSalaryException extends Exception{ //Created a custom Exception
	InvalidSalaryException(String str){
		super(str);
	}
}
		public class EmployeeUploader {
			void storeEmployeeDetails() throws SQLException, InvalidSalaryException, ClassNotFoundException {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee id");
				int id=sc.nextInt();
				System.out.println("Enter name:");
				String ename=sc.next();
				System.out.println("Enter employee phone:");
				long  ephone=sc.nextLong();
				System.out.println("Enter employee address:");
				String eadd=sc.next();
				System.out.println("Enter employee dept:");
				String edept=sc.next();
				System.out.println("Enter employee salary:");
				double esalary=sc.nextDouble();
				if(esalary<1000) {
					throw new InvalidSalaryException("salary can't be less than 1000");
				}
				else
				{
				
			
					//register driver step no1
					Class.forName("com.mysql.cj.jdbc.Driver");
				//get connection step no2
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eldb","root","root");
				//creating statement
					PreparedStatement stm;
					//inserting data into database table
					String sql="insert into employeeA values(?,?,?,?,?,?)";//no of column
					stm=conn.prepareStatement(sql);
					stm.setInt(1, id);
					stm.setString(2,ename);
					stm.setLong(3,ephone);
					stm.setString(4,eadd);
					stm.setString(5,edept);
					stm.setDouble(6, esalary);
					
					stm.execute();
					System.out.println("inserted succesfully");
		}
			}
				void storeDepartmentDetails() throws SQLException, ClassNotFoundException {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter dept id");
					int dept_id=sc.nextInt();
					System.out.println("Enter dept name:");
					String dept_name=sc.next();
				
					System.out.println("Enter head of the dept:");
					String dept_head=sc.next();
					System.out.println("Enter dept description:");
					String dept_dscrpt=sc.next();
				
					
				
						//register driver step no1
						Class.forName("com.mysql.cj.jdbc.Driver");
					//get connection step no2
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eldb","root","root");
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
				void retieveEmployeeDetails(int id)throws SQLException, ClassNotFoundException, IDNotFoundException{
					
						//register driver step no1
						Class.forName("com.mysql.cj.jdbc.Driver");
					//get connection step no2
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eldb","root","root");
					//create statement step no 3
						Statement stmt=conn.createStatement();
					//execute query fetch data from database step no4
						ResultSet rs=stmt.executeQuery("select * from EmployeeA where emp_id="+id);
						//iteration
						if(rs.next()) {
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
							
						}
						else
						{
							throw new IDNotFoundException("ID not present");
						}
						//close database connection step no5
						conn.close();
					
					
						
				}
				void calculatePF(int id) throws SQLException, ClassNotFoundException, IDNotFoundException {
					
						//register driver step no1
						Class.forName("com.mysql.cj.jdbc.Driver");
					//get connection step no2
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eldb","root","root");
					//create statement step no 3
						Statement stmt=conn.createStatement();
						ResultSet rid=stmt.executeQuery("select emp_id from EmployeeA where emp_id="+id);
						
						if(rid.next()) {
							

							
	ResultSet rs=stmt.executeQuery("select esalary from EmployeeA where esalary between 1000 and 10000 and emp_id="+id);

					//execute query fetch data from database step no4
						//iteration
						
						while(rs.next()) {
							System.out.println("Employee PF amount is: "+(rs.getDouble(1)+(rs.getDouble(1)*0.05)));
							
						}
						//iteration
						ResultSet rs1=stmt.executeQuery("select esalary from EmployeeA where esalary between 10000 and 100000 and emp_id="+id);

						while(rs1.next()) {
							System.out.println("Employee PF amount is: "+(rs1.getDouble(1)+(rs1.getDouble(1)*0.06)));
							
						}

						ResultSet rs2=stmt.executeQuery("select esalary from EmployeeA where esalary>100000 and emp_id= "+id);

						while(rs2.next()) {
							System.out.println("Employee PF amount is: "+(rs2.getDouble(1)+(rs2.getDouble(1)*0.07)));
							
						}}
else
{
	throw new IDNotFoundException("ID not present");

}						
conn.close();
						
						
					
					//close database connection step no5
				
				}
		public static void main(String agrs[]) throws ClassNotFoundException, SQLException, IDNotFoundException, InvalidSalaryException {
				Scanner sc=new Scanner(System.in);
			EmployeeUploader eu=new EmployeeUploader();
			int no;
			 try {
			do {
				System.out.println("11.To insert details for employee");
				System.out.println("12.To insert details for department"); 
				System.out.println("21.To Retrieve Employee Details ");
				System.out.println("3.Employee PF Amount ");

				System.out.println("0.To exit");
				 no=sc.nextInt();
				
			switch(no) {
			case 11:
				eu.storeEmployeeDetails();
				break;
			case 12:
				eu.storeDepartmentDetails();
				break;
			case 21:
				System.out.println("enter the employee id:");
				int n=sc.nextInt();
				eu.retieveEmployeeDetails(n);
				break;
			
			case 3:
				System.out.println("enter the employee id:");
				int n1=sc.nextInt();
				eu.calculatePF(n1);
				break;
			case 0:
				break;
			}
			}
			while(no!=0);
			}
			catch(IDNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(InvalidSalaryException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		

			}
		}
