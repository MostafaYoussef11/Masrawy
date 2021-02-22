CREATE TABLE daily(
	id int,
	date_day date,
	price double(10,2),
	note varchar(1024),
	name_table varchar(50),
	CONSTRAINT PK_Person PRIMARY KEY (id,name_table)
);

