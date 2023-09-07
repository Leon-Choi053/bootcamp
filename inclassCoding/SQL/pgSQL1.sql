CREATE TABLE STAFF (
	ID INTEGER NOT NULL,
	NAME VARCHAR(20) NOT NULL,
	SALARY NUMERIC(10,2)
);

select * from staff;

insert into staff (id, name, salary)
	values (1, 'John Lau', 10000.23);
insert into staff (name, id, salary)
	values ('Eric Cheung', 4, 23000.05);