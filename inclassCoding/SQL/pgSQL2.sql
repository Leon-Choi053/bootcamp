Select * from customers

create table finnhub_stocks (
	id SERIAL PRIMARY KEY,
	country varchar(2) not null,
	company_name varchar(100) not null,
	ipo_date date not null,
	logo varchar(200),
	currency varchar(3) not null,
	market_cap numeric(15,2) not null
)

create table finnhub_stock_prices (
	id SERIAL PRIMARY KEY,
	stock_id integer REFERENCES finnhub_stocks(id),
	datetime TIMESTAMP not null,
	current_price numeric(15, 2) not null,
	day_high numeric(15, 2) not null,
	day_low numeric(15, 2) not null,
	day_open numeric(15, 2) not null,
	prev_day_close numeric(15, 2) not null
)

