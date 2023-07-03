SQL> desc emp1;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER(2)
 NAME                                               VARCHAR2(10)
 AGE                                                NUMBER(2)

SQL> desc emp2;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER(2)
 PLACE                                              VARCHAR2(10)
 PIN                                                NUMBER(6)

SQL> insert into emp1 values(1,'ABI',25);

1 row created.

SQL> insert into emp1 values(2,'ABI',25);

1 row created.

SQL> insert into emp1 values(3,'ABI',25);

1 row created.

SQL> insert into emp1 values(4,'ABI',25);

1 row created.

SQL> select * from emp1;

        ID NAME              AGE
---------- ---------- ----------
         1 ABI                25
         2 ABI                25
         3 ABI                25
         4 ABI                25

SQL> insert into emp1 values(1,'UP',550033);
insert into emp1 values(1,'UP',550033)
                               *
ERROR at line 1:
ORA-01438: value larger than specified precision allowed for this column


SQL> insert into emp1 values(1,'UP',55);

1 row created.

SQL> insert into emp1 values(2,'MP',55);

1 row created.

SQL> insert into emp1 values(5,'Kolkatha',55);

1 row created.

SQL> insert into emp1 values(6,'Mumbai',55);

1 row created.

SQL> select * from emp1;

        ID NAME              AGE
---------- ---------- ----------
         1 ABI                25
         2 ABI                25
         3 ABI                25
         4 ABI                25
         1 UP                 55
         2 MP                 55
         5 Kolkatha           55
         6 Mumbai             55

8 rows selected.

SQL> select * from emp2;

no rows selected

SQL> insert into emp2 values(1,'UP',550033);

1 row created.

SQL> insert into emp2 values(2,'MP',55);

1 row created.

SQL> insert into emp2 values(5,'Kolkatha',55);

1 row created.

SQL> insert into emp2 values(6,'Mumbai',55);

1 row created.

SQL> select * from emp1;

        ID NAME              AGE
---------- ---------- ----------
         1 ABI                25
         2 ABI                25
         3 ABI                25
         4 ABI                25
         1 UP                 55
         2 MP                 55
         5 Kolkatha           55
         6 Mumbai             55

8 rows selected.

SQL> select * from emp2;

        ID PLACE             PIN
---------- ---------- ----------
         1 UP             550033
         2 MP                 55
         5 Kolkatha           55
         6 Mumbai             55

SQL> delete from emp1 where name='UP'
  2
SQL> delete from emp1 where name='UP';

1 row deleted.

SQL> delete from emp1 where name='MP;';

0 rows deleted.

SQL> delete from emp1 where name='MP';

1 row deleted.

SQL> delete from emp1 where name='Kolkatha';

1 row deleted.

SQL> delete from emp1 where name='Mumbai';

1 row deleted.

SQL> select * from emp2;

        ID PLACE             PIN
---------- ---------- ----------
         1 UP             550033
         2 MP                 55
         5 Kolkatha           55
         6 Mumbai             55

SQL> select * from emp1;

        ID NAME              AGE
---------- ---------- ----------
         1 ABI                25
         2 ABI                25
         3 ABI                25
         4 ABI                25

SQL> select * from emp1 inner join emp2 on emp1.id = emp2.id;

        ID NAME              AGE         ID PLACE             PIN
---------- ---------- ---------- ---------- ---------- ----------
         1 ABI                25          1 UP             550033
         2 ABI                25          2 MP                 55

SQL> select * from emp1 full join emp2 on emp1.id = emp2.id;

        ID NAME              AGE         ID PLACE             PIN
---------- ---------- ---------- ---------- ---------- ----------
         1 ABI                25          1 UP             550033
         2 ABI                25          2 MP                 55
                                          5 Kolkatha           55
                                          6 Mumbai             55
         4 ABI                25
         3 ABI                25

6 rows selected.

SQL> select * from emp1 left join emp2 on emp1.id = emp2.id;

        ID NAME              AGE         ID PLACE             PIN
---------- ---------- ---------- ---------- ---------- ----------
         1 ABI                25          1 UP             550033
         2 ABI                25          2 MP                 55
         4 ABI                25
         3 ABI                25

SQL> select * from emp1 right join emp2 on emp1.id = emp2.id;

        ID NAME              AGE         ID PLACE             PIN
---------- ---------- ---------- ---------- ---------- ----------
         1 ABI                25          1 UP             550033
         2 ABI                25          2 MP                 55
                                          6 Mumbai             55
                                          5 Kolkatha           55

SQL> select * from emp1 right join emp2 on emp1.id = emp2.id where emp1.id=1;

        ID NAME              AGE         ID PLACE             PIN
---------- ---------- ---------- ---------- ---------- ----------
         1 ABI                25          1 UP             550033

SQL> select id,name from emp1 right join emp2 on emp1.id = emp2.id where emp1.id=1;
select id,name from emp1 right join emp2 on emp1.id = emp2.id where emp1.id=1
       *
ERROR at line 1:
ORA-00918: column ambiguously defined


SQL> select emp1.id,emp1.name from emp1 right join emp2 on emp1.id = emp2.id where emp1.id=1;

        ID NAME
---------- ----------
         1 ABI