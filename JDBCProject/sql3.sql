SQL : 
	basic idea about the database 
	

=========================

constrients 
			primary key 
			not null 
			check 
			default 
			uniquee
			forign key 

 create table employee(ID number(5), NAME varchar(10) ,AGE number(3), SALARY number(7), DESIG varchar(10),gender char(5));
 insert into employee values(100,'Bharath',-34,00000,'Tester','Male');
select * from employee;

With COnstriests : 

create table employee(ID number(5) primary key, NAME varchar(10)  not null,AGE number(3) check (age > 18 ), SALARY number(7) check (salary > 25000), DESIG varchar(10) default 'GET', gender char(5),PAN varchar(10) unique);

insert into employee(id,name,age,salary,gender,pan) values(700,'Abi',25,50000,'M','ABC829');

insert into employee values(500,'Charan',19,25001,'Tester','M','ABC127');
=====================================================================================================================

	data types 
			Number 
			varchar 
			char 
			date 
			boolean
=======================================================================================================
	DDL . DML . DRL ,DCL , TCL 

DDL :Data Defination lang 
	Drop Rename  Create Alter Truncate  
DML : Datas Manupulation lang 
	Update Insert Delete 
DRL : Data Retrivel lang 
	select
DCL : Data Control lang 
	Gront 
	revoke 

TCL :Transection control  lang
	commit 
	rolback 


 ================================
User :
	create ing user is called as Scheam
========================================================================================
	joins 
		Inner joion 
		full jiin 
		right join
		left jooin
=============================================================

operators 
		like 
		order 
		and 
		or 
		not 
select * from employee where name like 'M%';
select * from employee order by salary;
SQL> select * from employee order by salary desc;
select * from employee  where salary> 40000 and desig='Tester';
select * from employee  where salary> 40000 or desig='Tester';

====================================================
	

	Views

 create view igt_emp_view as select id, name ,desig from employee;

View created.

SQL> select * from  igt_emp_view;

        ID NAME       DESIG
---------- ---------- ----------
       200 Abi        Tester
       300 Charan     Tester
       500 Charan     Tester
       600 Abi
       700 Abi        GET
       540 Charan     Tester
       990 Abi        CEO
       910 Manoj      Manager

8 rows selected.

SQL>

===============================================
Sequences 


create sequence igt_emp start with 1 maxvalue 10 ;
insert into emp1 values(igt_emp.nextval,'ABI',35);

============================================================
Single row function'
	upper 
	lower 
	flore
	ciel
	
Aggreation funtions 
	min 
	max
	avg
	sum 
	count