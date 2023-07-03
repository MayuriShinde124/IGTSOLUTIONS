SQL> create table employee(ID number(5) primary key, NAME varchar(10)  not null,AGE number(3) check (age > 18 ), SALARY number(7) check (salary > 25000), DESIG varchar(10) default 'GET', gender char(5),PAN varchar(10) uniquee);
create table employee(ID number(5) primary key, NAME varchar(10)  not null,AGE number(3) check (age > 18 ), SALARY number(7) check (salary > 25000), DESIG varchar(10) default 'GET', gender char(5),PAN varchar(10) uniquee)

                                                                             *
ERROR at line 1:
ORA-00907: missing right parenthesis


SQL> create table employee(ID number(5) primary key, NAME varchar(10)  not null,AGE number(3) check (age > 18 ), SALARY number(7) check (salary > 25000), DESIG varchar(10) default 'GET', gender char(5),PAN varchar(10) unique);

Table created.

SQL> desc employee;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(5)
 NAME                                      NOT NULL VARCHAR2(10)
 AGE                                                NUMBER(3)
 SALARY                                             NUMBER(7)
 DESIG                                              VARCHAR2(10)
 GENDER                                             CHAR(5)
 PAN                                                VARCHAR2(10)

SQL> insert into employee values(100,'Abi',25,50000,'Tester','M','ABC123');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123

SQL> insert into employee values(100,'Abi',25,50000,'Tester','M','ABC123');
insert into employee values(100,'Abi',25,50000,'Tester','M','ABC123')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.SYS_C008270) violated


SQL> insert into employee values(200,'Abi',25,50000,'Tester','M','ABC123');
insert into employee values(200,'Abi',25,50000,'Tester','M','ABC123')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.SYS_C008271) violated


SQL> insert into employee values(200,'Abi',25,50000,'Tester','M','ABC124');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124

SQL> insert into employee values(300,'',25,50000,'Tester','M','ABC125');
insert into employee values(300,'',25,50000,'Tester','M','ABC125')
                                *
ERROR at line 1:
ORA-01400: cannot insert NULL into ("SYSTEM"."EMPLOYEE"."NAME")


SQL> insert into employee values(300,'Charan',25,50000,'Tester','M','ABC125');

1 row created.

SQL> insert into employee values(400,'Charan',15,50000,'Tester','M','ABC126');
insert into employee values(400,'Charan',15,50000,'Tester','M','ABC126')
*
ERROR at line 1:
ORA-02290: check constraint (SYSTEM.SYS_C008268) violated


SQL> insert into employee values(400,'Charan',19,50000,'Tester','M','ABC126');

1 row created.

SQL> insert into employee values(500,'Charan',19,24999,'Tester','M','ABC127');
insert into employee values(500,'Charan',19,24999,'Tester','M','ABC127')
*
ERROR at line 1:
ORA-02290: check constraint (SYSTEM.SYS_C008269) violated


SQL> insert into employee values(500,'Charan',19,25001,'Tester','M','ABC127');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127

SQL> insert into employee values(600,'Abi',25,50000,'','M','ABC129');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129

6 rows selected.

SQL> insert into employee(id,name,age,salary,gender,pan) values(600,'Abi',25,50000,'M','ABC129');
insert into employee(id,name,age,salary,gender,pan) values(600,'Abi',25,50000,'M','ABC129')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.SYS_C008270) violated


SQL> insert into employee(id,name,age,salary,gender,pan) values(700,'Abi',25,50000,'M','ABC829');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829

7 rows selected.

SQL> insert into employee values(540,'Charan',19,25001,'Tester','M','');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M

8 rows selected.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M

8 rows selected.

SQL> insert into employee values(990,'Abi',25,50000,'CEO','M','ABC111');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111

9 rows selected.

SQL> insert into employee values(910,'Manoj',25,50000,'CEO','M','AB333');

1 row created.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 CEO        M     AB333

10 rows selected.

SQL> update employee set desig='Manager' where id= 910;

1 row updated.

SQL> select * from employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

10 rows selected.

SQL> create user manoj identified by tiger;

User created.

SQL> connect manoj/tiger;
ERROR:
ORA-01045: user MANOJ lacks CREATE SESSION privilege; logon denied


Warning: You are no longer connected to ORACLE.
SQL> connect system/tiger;
Connected.
SQL> grant CREATE SESSION privilege to employee;
grant CREATE SESSION privilege to employee
      *
ERROR at line 1:
ORA-00990: missing or invalid privilege


SQL> grant CREATE SESSION  to employee on manoj;
grant CREATE SESSION  to employee on manoj
      *
ERROR at line 1:
ORA-00990: missing or invalid privilege


SQL> grant CREATE SESSION on manoj to employee;
grant CREATE SESSION on manoj to employee
      *
ERROR at line 1:
ORA-00990: missing or invalid privilege


SQL> GRANT CREATE SESSION TO employee;
GRANT CREATE SESSION TO employee
                        *
ERROR at line 1:
ORA-01917: user or role 'EMPLOYEE' does not exist


SQL> GRANT CREATE SESSION TO manoj;

Grant succeeded.

SQL> connect monoj/tiger;
ERROR:
ORA-01017: invalid username/password; logon denied


Warning: You are no longer connected to ORACLE.
SQL> connect system/tiger;
Connected.
SQL> GRANT CREATE SESSION TO manoj;

Grant succeeded.

SQL> connect monoj/tiger;
ERROR:
ORA-01017: invalid username/password; logon denied


Warning: You are no longer connected to ORACLE.
SQL> connect manoj/tiger;
Connected.
SQL> select * from employee;
select * from employee
              *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> select * from system.employee;
select * from system.employee
                     *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> connect system/tiger;
Connected.
SQL> grant select on employee to manoj;

Grant succeeded.

SQL> connect manoj/tiger;
Connected.
SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       100 Abi                25      50000 Tester     M     ABC123
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

10 rows selected.

SQL> delete from system.employee where id=100;
delete from system.employee where id=100
                   *
ERROR at line 1:
ORA-01031: insufficient privileges


SQL> connect system/tiger;
Connected.
SQL> grant select,delete on employee to manoj;

Grant succeeded.

SQL> connect manoj/tiger;
Connected.
SQL> delete from system.employee where id=100;

1 row deleted.

SQL> update system.employee set salary=555555 where id=200;
update system.employee set salary=555555 where id=200
              *
ERROR at line 1:
ORA-01031: insufficient privileges


SQL> connect system/tiger;
Connected.
SQL> grant update on employee to manoj;

Grant succeeded.

SQL> connect manoj/tiger;
Connected.
SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       400 Charan             19      50000 Tester     M     ABC126
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

9 rows selected.

SQL> delete from system.employee where id=400;

1 row deleted.

SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       200 Abi                25      50000 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

8 rows selected.

SQL> update system.employee set salary=555555 where id=200;

1 row updated.

SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       200 Abi                25     555555 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

8 rows selected.

SQL> connect system/tiger;
Connected.
SQL> revoke all privileges from manoj;
revoke all privileges from manoj
*
ERROR at line 1:
ORA-01952: system privileges not granted to 'MANOJ'


SQL> revoke all privilege from manoj;
revoke all privilege from manoj
*
ERROR at line 1:
ORA-01952: system privileges not granted to 'MANOJ'


SQL> grant all privileges to  manoj;

Grant succeeded.

SQL> connect manoj/tiger;
Connected.
SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       200 Abi                25     555555 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

8 rows selected.

SQL> delete from system.employee where id=400;

0 rows deleted.

SQL> update system.employee set salary=555555 where id=200;

1 row updated.

SQL> alter table employee add( aadar number(10));
alter table employee add( aadar number(10))
*
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> alter table system.employee add( aadar number(10));

Table altered.

SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
     AADAR
----------
       200 Abi                25     555555 Tester     M     ABC124


       300 Charan             25      50000 Tester     M     ABC125


       500 Charan             19      25001 Tester     M     ABC127



        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
     AADAR
----------
       600 Abi                25      50000            M     ABC129


       700 Abi                25      50000 GET        M     ABC829


       540 Charan             19      25001 Tester     M



        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
     AADAR
----------
       990 Abi                25      50000 CEO        M     ABC111


       910 Manoj              25      50000 Manager    M     AB333



8 rows selected.

SQL> alter table  system.employee drop(aadar);

Table altered.

SQL> select * from system.employee;

        ID NAME              AGE     SALARY DESIG      GENDE PAN
---------- ---------- ---------- ---------- ---------- ----- ----------
       200 Abi                25     555555 Tester     M     ABC124
       300 Charan             25      50000 Tester     M     ABC125
       500 Charan             19      25001 Tester     M     ABC127
       600 Abi                25      50000            M     ABC129
       700 Abi                25      50000 GET        M     ABC829
       540 Charan             19      25001 Tester     M
       990 Abi                25      50000 CEO        M     ABC111
       910 Manoj              25      50000 Manager    M     AB333

8 rows selected.

SQL> connect system/tiger;
Connected.
SQL> revoke all privilege from manoj;

Revoke succeeded.

SQL> connect manoj/tiger;
ERROR:
ORA-01045: user MANOJ lacks CREATE SESSION privilege; logon denied


Warning: You are no longer connected to ORACLE.
SQL> select * from system.employee;