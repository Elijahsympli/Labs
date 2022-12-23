use eldb;
create table customer1(cust_id varchar(4) primary key,
fname varchar(20) not null,
lname varchar(20) ,
area varchar(40) not null,
phone bigint(10));
insert into customer1 values('A01','Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU',5560379),
('A03','Pramada','Jauguste','DA',4560389),
('A04','Basu','Navindi','BA',6125401),
('A05','Ravi','Shridhar','NA',null),
('A06','Rukmini','Aiyer','GH',5125274);

create table movie(mv_no int primary key ,cust_id varchar(4) ,
foreign key(cust_id) references customer1(cust_id),
title varchar(20) not null,
star varchar(10) not null,
price int );
insert into movie values(1,'A02','Bloody','JC',181),
(2,'A04','The Firm','TC',200),
(3,'A01','Pretty Woman','RG',151),
(4,'A06','Home Alone','MC',150),
(5,'A05','The Fugitive','MF',200),
(6,'A03','Coma','MD',100),
(7,'A02','Dracula','GO',150),
(8,'A06','Quick Change','BM',100),
(9,'A03','Gone with the Wind','CB',200),
(10,'A05','Carry on Doctor','LP',100);
#2.Prove that entity integrity constraint is ensured by both the tables
insert into customer1 values(null,'Vanda','Tay','LU',7560379);#primary key can't be null
insert into movie values(null,'A02','Bledy','JC',188);#primary key can't be null
#3. Prove that referential integrity constraint is ensured by both the tables.
drop table customer1;#cannot drop table 'customer1' referenced by a foreign key constraint 'movie_ibfk_1' on table 'movie'
#4. Prove that domain integrity constraint is ensured by the Movie table.

#5. Display the movie titles, whose price is greater than 100 but less than 200.
select  title from movie where price>100 and price<200;
#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id from movie where star='JC' or star='TC' or star='MC';
#7. Display the details of those customers who have an A in their area name.
select * from customer1 where area like '_A' or 'A_';
#8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select title from movie where price<180 and length(title)=6;
#9. Display the movie name, their original prices and the prices after 10% increment. 
#Give alias name to the incremented price column.
select title,price,price + (price * 0.1) as Incremented_price from movie;
#10.Display all the customer details in the following way:
#‘Ivan Ross stays in SA and his phone number is 6125467.’

#11.Add a not null constraint to the Lname field in Customer
alter table customer1 modify lname varchar(20) not null;
#12.Display the customer’s name whose phone number is not recorded.
select fname,lname from customer1 where phone is null;
#13.Add the phone number according to your own wish for the person mentioned in problem no 12.
update  customer1 set phone=734658 where fname='ravi' and lname ='shridhar';
#14.Display the unique customer ids from movie table.
select cust_id from movie group by cust_id;
#15.Remove the not null constraint from Star column in movie table.
alter table customer1 modify lname varchar(20) not null;
alter table movie modify star varchar(10);
#16.Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer1 where cust_id='A06';
#17.Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from movie where cust_id='A05';
#18.Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customer1;#cannot drop table 'customer1' referenced by a foreign key constraint 'movie_ibfk_1' on table 'movie'
#19.Drop the Movie table. If you cannot drop, then note the error message displayed.
drop table movie;
#20.Drop the foreign key from Movie table.
ALTER TABLE movie DROP FOREIGN KEY cust_id;

