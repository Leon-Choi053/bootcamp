use sys;
show tables;

CREATE table if not exists student(
	ID INTEGER not null, -- auto_increment
    NAME varchar(20) not null,
    AGE numeric(3) not null, -- NUMERIC(3) means Integer
    NATIONALITY varchar(2) not null,
    MEMBERSHIP varchar(1) not null
    );
-- Select data from table, * means all columns
select * from student;
select id, name, age from student;
-- Insert records
insert into student (id, name, age, nationality, membership)
	values (0, 'John Lau', 23, 'HK', 'G');
insert into student values(2 ,'mary chan', 27, 'CN', 'G');
--

create TABLE if not exists staff (
    id INT NOT NULL,
    name VARCHAR(20) NOT NULL,
    salary NUMERIC(10 , 2 )
);
-- All column alias
insert into staff (id, name, salary)
	values (1, 'John Lau', 10000.23);
insert into staff values (2, 'mary chan', null);
insert into staff (id, name) values (3, 'peter chu');
insert into staff (id, name, salary) values (5, 'peter chung', 20000.00);
-- update
update staff set salary = salary + 1000;
-- select data by criteria
select * from staff where id = 1;
select * from staff where name = 'peter chung' and salary < 30000;
select id from staff where name = 'peter chung' and salary < 30000;
-- sub-array
select id from staff where salary = (select max(salary) from staff);
update staff set salary = salary * 0.9 where id = (select max(salary) from staff);

create view vcustomer_orderd
as 
select C.*, O.AMOUNT
from customers c, orders O
where C.ID = O.customer_id
;

select * from vcustomer_orders;

DROP PROCEDURE INSERT_RESULT;
-- PROCEDURE INSERT_RESULT
DELIMITER //

CREATE PROCEDURE INSERT_RESULT()

BEGIN	
	DECLARE RES_AVG_AMT DECIMAL(10,2);
    DECLARE cust_id INT;

    DECLARE customer_cursor CURSOR FOR
			SELECT C.ID
			FROM customers c
            ;

    OPEN customer_cursor;
	LOOP     -- Loop through departments
    FETCH customer_cursor INTO cust_id;
		-- logic
		CALL CALC_AVG_AMOUNT(cust_id, RES_AVG_AMT);
        -- INESRT TO RESULT TABLE
        INSERT INTO CUSTOMER_ORDER_REPORT (CUSTOMER_ID, ORDER_AVG_AMT)
        VALUES (cust_id, RES_AVG_AMT);
	END LOOP;
    CLOSE customer_cursor;
END;
//
DELIMITER ;


DROP PROCEDURE CALC_AVG_AMOUNT;
-- CREATE PROCEDURE CALC_AVG_AMOUNT
DELIMITER //

CREATE PROCEDURE CALC_AVG_AMOUNT(IN CID INTEGER, OUT AVG_AMT DECIMAL(10,2))

BEGIN	
		DECLARE cust_id INT;
        DECLARE avg_amount DECIMAL(10,2);

		DECLARE calc_cursor CURSOR FOR
			SELECT o.customer_id, (SUM(o.amount) / count(1)) as avg_order_amt
			FROM customers c, orders o
            where c.id = o.customer_id
            and c.id = CID
            group by o.customer_id
            ;

		OPEN calc_cursor;
		calc_cursor: LOOP     -- Loop through departments
        FETCH calc_cursor INTO cust_id, avg_amount;
		END LOOP;
        CLOSE calc_cursor;

		SET AVG_AMT = avg_amount;
END;
//

DELIMITER ;