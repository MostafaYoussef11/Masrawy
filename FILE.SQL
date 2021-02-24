CREATE TABLE daily(
	id int,
	date_day date,
	price double(10,2),
	note varchar(1024),
	name_table varchar(50),
	CONSTRAINT PK_Person PRIMARY KEY (id,name_table)
);

CREATE TABLE _type(
	id_type int PRIMARY KEY,
	name_type varchar(512) NOT NULL
);

ALTER TABLE account ADD COLUMN id_type int not null;

UPDATE account SET id_type = 2  WHERE id_account = 1 ;
UPDATE account SET id_type = 2  WHERE id_account = 2 ;
UPDATE account SET id_type = 2  WHERE id_account = 3 ;
UPDATE account SET id_type = 2  WHERE id_account = 4 ;
UPDATE account SET id_type = 2  WHERE id_account = 5 ;
UPDATE account SET id_type = 2  WHERE id_account = 6 ;
UPDATE account SET id_type = 2  WHERE id_account = 7 ;
UPDATE account SET id_type = 2  WHERE id_account = 8 ;
UPDATE account SET id_type = 2  WHERE id_account = 9 ;
UPDATE account SET id_type = 2  WHERE id_account = 10 ;
UPDATE account SET id_type = 2  WHERE id_account = 11 ;
UPDATE account SET id_type = 2  WHERE id_account = 12 ;
UPDATE account SET id_type = 2  WHERE id_account = 13 ;
UPDATE account SET id_type = 2  WHERE id_account = 14;
UPDATE account SET id_type = 2  WHERE id_account = 15;
UPDATE account SET id_type = 2  WHERE id_account = 16 ;
UPDATE account SET id_type = 2  WHERE id_account = 17 ;
UPDATE account SET id_type = 3  WHERE id_account = 18 ;
UPDATE account SET id_type = 5  WHERE id_account = 19 ;
UPDATE account SET id_type = 5  WHERE id_account = 20 ;
UPDATE account SET id_type = 4  WHERE id_account = 21 ;
UPDATE account SET id_type = 4  WHERE id_account = 22 ;
UPDATE account SET id_type = 3  WHERE id_account = 23 ;
UPDATE account SET id_type = 7  WHERE id_account = 24 ;
UPDATE account SET id_type = 1  WHERE id_account = 25 ;
UPDATE account SET id_type = 1  WHERE id_account = 26 ;
UPDATE account SET id_type = 6  WHERE id_account = 27 ;
UPDATE account SET id_type = 6  WHERE id_account = 28 ;
UPDATE account SET id_type = 6  WHERE id_account = 29 ;


ALTER TABLE account ADD FOREIGN KEY (id_type) REFERENCES _type(id_type); 