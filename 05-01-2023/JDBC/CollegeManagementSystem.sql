use eldb;

create table cs(stuId int primary key,
name varchar(20) not null,
rollno int,
gender varchar(10),
age int,
phone bigInt(10),
email varchar(20),
dept varchar(20),foreign key(dept) references cdepartment(deptName));

create table cdepartment(deptName varchar(20)  primary key,
headDept varchar(20));

create table staff(staffId int primary key,
staffName varchar(20),
workIndept varchar(20),
foreign key(workIndept) references cdepartment(deptName));
