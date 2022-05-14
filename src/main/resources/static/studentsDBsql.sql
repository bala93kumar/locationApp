use mysql; 

select  * from user; 

create database projectDb; 

use projectDB; 

create table students(
id int primary key auto_increment, 
sname  varchar(20), 
scourse varchar(30), 
sfee int ); 

show tables; 

drop table students; 

select * from students; 

create table products(
 prod_id int  primary key auto_increment,
 prod_name varchar(20) ,
 exp_dt  ); 
 
 insert into products value 
 (1, 'eggs', '05-20-2020');  
 
 select * from products; 
 
 delete from products where prod_id = 0; 
 
 drop table products; 
 
 create table location (
 id int primary key  , 
 code varchar(20), 
 name varchar(20), 
 type varchar(10) ); 
 
 select * from location; 

delete from location where id =1;  
 show tables; 
 
 
