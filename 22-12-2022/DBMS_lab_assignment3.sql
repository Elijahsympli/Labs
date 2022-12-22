# 1. Create table EMPLOYEE with the following details
use eldb;
create table employee1(employee_id int(6),
last_name varchar(25),
job_id varchar(10),
salary double(8,2),
comm_pct double(4,2),
mgr_id int (6),
department_id int(4));
#2. Insert the following data into EMPLOYEE table.
insert into employee1 values(198,'Connell','SH_CLERK',2600.00,2.50,124,50),
(199,'Grant','SH_CLERK',2600.00,2.2,124,50),
(200,'Whalen','AD_ASST',4400.00,1.3,101,10),
(201,'Hartstein','IT_PROG',6000.00,null,100,20),
(202,'Fay','AC_MGR',6500.00,null,210,20),
(203,'Mavris','AD_VP',7500.00,null,101,40),
(204,'Baer','AD_PRES',3500.00,1.5,101,90),
(205,'Higgin','AC_MGR',3500.00,null,101,60),
(206,'Gitz','IT_PROG',5000.00,null,103,60),
(100,'King','AD_ASST',8956.00,0.3,108,100),
(101,'Kochar','SH_CLERK',3400.00,1.3,118,30);
#3. Display last_name, job_id, employee_id for each employee with employee_id  appearing first.
select employee_id,last_name,job_id from employee1;
#4. Display the details of all employees of department 60
select * from employee1 where department_id=60;
#5. Display the employee details of the employee who’s last_name is King
select * from employee1 where last_name='king';
#6. Display unique job_id from EMPLOYEE table. Give alias name to the column as  JOB_TITLE.
select job_id as job_title from employee1 group by job_id;
#7. Display last_name, salary and salary increase of Rs300. Give the new column name  as ‘Increased Salary’
select last_name,salary,salary + 300 as increased_salary from employee1;
#8. Display last_name, salary and annual compensation of all employees, plus a 
#onetime bonus of Rs 100. Give an alias name to the column displaying annual compensation.
select last_name,salary,salary + 100 as annual_compensation from employee1;
#9. Display the details of those employees who get commission.
select * from employee1 where comm_pct >0;
#10.Display the details of those employees who do not get commission
select * from employee1 where comm_pct is null;
#11.Display the Employee_id, Department_id and Salary all employees whose salary is greater than 5000.
select employee_id,department_id,salary from employee1 where salary>5000;
#12.Display the Last_Name and Salary of all employees whose salary is between 4000 and 7000.
select last_name,salary from employee1 where salary between 4000 and 7000;
#13.Display the details of all employees whose salary is either 6000 or 6500 or 7000.
select * from employee1 where salary=6000 or salary =6500 or salary=7000;
#14.Display the details of all those employees who work either in department 10 or 20 or 30 or 50.
select * from employee1 where department_id=10 or department_id=20 or department_id=30 or department_id=50;
#15.Display the details of all employees whose salary is not equal to 5000.
select * from employee1 where salary !=5000;
#16.Display the details of all the CLERKS working in the organization.
select * from employee1 where job_id like '%clerk';
#17.Update the job_id’s of the employees who earn more than 5000 to Grade_A. 
#Display the table EMPLOYEE after updating
update employee1 set job_id='grade_a' where salary>5000;
select * from employee1;
#18.Display the details of all those employees who are either CLERK or 
#PROGRAMMER or ASSISTANT.
select * from employee1 where job_id='sh_clerk' or job_id='ad_asst' or job_id='it_prog';
#19.Display those employees from the EMPLOYEE table whose designation is CLERK and salary is less than 3000
select * from employee1 where job_id like '%clerk' and salary<3000;
#20.Display those employees Last_Name, Mgr_id from the EMPLOYEE table whose 
#salary is above 3000 and work under Manager 101.
select last_name,mgr_id from employee1 where salary>3000 and  mgr_id=101;


