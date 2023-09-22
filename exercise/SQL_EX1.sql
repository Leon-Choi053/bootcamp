create database bootcamp_exercise1;
use bootcamp_exercise1;
SHOW tables;

create table regions(
	region_id integer not null,
	region_name varchar(25) not null,
    primary key (region_id)
);

create table countries(
	country_id char(2) not null,
    country_name varchar(40) not NULL,
    region_id integer not null,
    primary key (country_id),
    foreign key (region_id) references regions (region_id)
);

create table locations(
	location_id integer not null,
    street_address varchar(25) not null,
    postal_code varchar(12) not null,
    city varchar(30) not null,
    state_province varchar(12) not null,
    country_id char(2) not null,
    primary key (location_id),
    foreign key (country_id) references countries (country_id)
);

create table departments(
	department_id integer not null,
    department_name varchar(30) not null,
    manager_id integer not null,
    location_id integer not null,
    primary key (department_id),
    foreign key (location_id) references locations (location_id)
);

create table jobs(
	job_id varchar(10) not null,
    job_title varchar(35) not null,
    min_salary integer not null,
    max_salary integer not null,
    primary key (job_id)
);

create table job_history(
	employee_id integer not null,
    start_date date not null,
    end_date date not null,
    job_id varchar(10) not null,
    department_id integer not null,
    primary key (employee_id),
    primary key (start_date),
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id)
);

create table employees(
	employee_id integer not null,
    first_name varchar(20) not null,
    last_name varchar(25) not null,
    email varchar(25) not null,
    phone_number varchar(20) not null,
    hire_date date not null,
    job_id varchar(10) not null,
    salary integer not null,
    commission_pct integer not null,
    manager_id integer not null,
    department_id integer not null,
    primary key (employee_id),
    foreign key (employee_id) references job_history (employee_id),
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments(department_id)
);

create table job_grades(
	grade_level varchar(2) not null,
    lowest_sal integer not NULL,
    highest_sal integer not null,
    primary key (grade_level)
);

insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1000, '1297 Via Cola di Rie', 989, 'Roma', ' ', 'IT');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1100, '93091 Via Cola di Rie', 10934, 'Venice', ' ', 'IT');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1200, '2017 Via Cola di Rie', 1689, 'Tokyo', 'Tokyo Prefectu', 'JP');
insert into locations (location_id, street_address, postal_code, city, state_province, country_id)
	values (1400, '2014 Via Cola di Rie', 26192, 'Southlake', 'Texas', 'US');
select * from locations;

insert into countries (country_id, country_name, region_id)
	values ('DE', 'Germany', 1);
insert into countries (country_id, country_name, region_id)
	values ('IT', 'Italy', 1);
insert into countries (country_id, country_name, region_id)
	values ('JP', 'Japan', 3);
insert into countries (country_id, country_name, region_id)
	values ('US', 'United State', 2);
select * from countries;

insert into departments (department_id, department_name, manager_id, location_id)
	values (10, 'administration', 200, 1100);
insert into departments (department_id, department_name, manager_id, location_id)
	values (20, 'marketing', 201, 1200);
insert into departments (department_id, department_name, manager_id, location_id)
	values (30, 'purchasing', 202, 1400);
select * from departments;

insert into employees (employee_id, first_name, last_name, email, phone_number, country_id, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (100, 'Steven', 'King', 'SKING', 515-1234567, 1987-06-17, 'ST_CLEEK', 24000.00, 0.00, 109, 10);
insert into employees (employee_id, first_name, last_name, email, phone_number, country_id, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (101, 'Neena', 'Kochhar', 'NKOCHHAR', 515-1234568, 1987-06-18, 'MK_REP', 17000.00, 0.00, 103, 20);
insert into employees (employee_id, first_name, last_name, email, phone_number, country_id, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (102, 'Lex', 'De Haan', 'LDEHAAN', 515-1234569, 1987-06-19, 'IT_PROG', 17000.00, 0.00, 108, 30);
insert into employees (employee_id, first_name, last_name, email, phone_number, country_id, hire_date, job_id, salary, commission_pct, manager_id, department_id)
	values (103, 'Alexander', 'Hunold', 'AHUNOLD', 590-4234567, 1987-06-20, 'MK_REP', 9000.00, 0.00, 105, 20);
select * from employees;

insert into job_history (location_id, street_address, postal_code, city, state_province, country_id)
	values (1000, '1297 Via Cola di Rie', 989, 'Roma', ' ', 'IT');
insert into job_history (location_id, street_address, postal_code, city, state_province, country_id)
	values (1100, '93091 Via Cola di Rie', 10934, 'Venice', ' ', 'IT');
insert into job_history (location_id, street_address, postal_code, city, state_province, country_id)
	values (1200, '2017 Via Cola di Rie', 1689, 'Tokyo', 'Tokyo Prefectu', 'JP');
insert into job_history (location_id, street_address, postal_code, city, state_province, country_id)
	values (1400, '2014 Via Cola di Rie', 26192, 'Southlake', 'Texas', 'US');
select * from job_history;