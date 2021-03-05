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


UPDATE assets SET id_workgroup = 4  WHERE id_assets = 1 ;
UPDATE assets SET id_workgroup = 3 WHERE id_assets = 2;
UPDATE assets SET id_workgroup = 4 WHERE id_assets = 3;
UPDATE assets SET id_workgroup = 3 WHERE id_assets = 4;















UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 1 )-(SELECT SUM(price_export) FROM exports WHERE id_account = 1) WHERE id_account = 1;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 2 )-(SELECT SUM(price_export) FROM exports WHERE id_account = 2) WHERE id_account = 2;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 3)-(SELECT SUM(price_export) FROM exports WHERE id_account = 3) WHERE id_account = 3;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 4)-(SELECT SUM(price_export) FROM exports WHERE id_account = 4) WHERE id_account = 4;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 5)-(SELECT SUM(price_export) FROM exports WHERE id_account = 5) WHERE id_account = 5;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 6)-(SELECT SUM(price_export) FROM exports WHERE id_account = 6) WHERE id_account = 6;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 7)-(SELECT SUM(price_export) FROM exports WHERE id_account = 7) WHERE id_account = 7;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 8)-(SELECT SUM(price_export) FROM exports WHERE id_account = 8) WHERE id_account = 8;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 9)-(SELECT SUM(price_export) FROM exports WHERE id_account = 9) WHERE id_account = 9;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 10)-(SELECT SUM(price_export) FROM exports WHERE id_account = 10) WHERE id_account =10 ;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 11)-(SELECT SUM(price_export) FROM exports WHERE id_account = 11) WHERE id_account = 11;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 12)-(SELECT SUM(price_export) FROM exports WHERE id_account = 12) WHERE id_account = 12;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 13)-(SELECT SUM(price_export) FROM exports WHERE id_account = 13) WHERE id_account = 13;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 14)-(SELECT SUM(price_export) FROM exports WHERE id_account = 14) WHERE id_account = 14;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 15)-(SELECT SUM(price_export) FROM exports WHERE id_account = 15) WHERE id_account = 15;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 16)-(SELECT SUM(price_export) FROM exports WHERE id_account = 16) WHERE id_account = 16;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 17)-(SELECT SUM(price_export) FROM exports WHERE id_account = 17) WHERE id_account = 17;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 18)-(SELECT SUM(price_export) FROM exports WHERE id_account = 18) WHERE id_account = 18;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 19)-(SELECT SUM(price_export) FROM exports WHERE id_account = 19) WHERE id_account = 19;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 20)-(SELECT SUM(price_export) FROM exports WHERE id_account = 20) WHERE id_account = 20;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 21)-(SELECT SUM(price_export) FROM exports WHERE id_account = 21) WHERE id_account = 21;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 22)-(SELECT SUM(price_export) FROM exports WHERE id_account = 22) WHERE id_account = 22;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 23)-(SELECT SUM(price_export) FROM exports WHERE id_account = 23) WHERE id_account = 23;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 24)-(SELECT SUM(price_export) FROM exports WHERE id_account = 24) WHERE id_account = 24;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 25)-(SELECT SUM(price_export) FROM exports WHERE id_account = 25) WHERE id_account = 25;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 26)-(SELECT SUM(price_export) FROM exports WHERE id_account = 26) WHERE id_account = 26;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 27)-(SELECT SUM(price_export) FROM exports WHERE id_account = 27) WHERE id_account = 27;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 28)-(SELECT SUM(price_export) FROM exports WHERE id_account = 28) WHERE id_account = 28;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 29)-(SELECT SUM(price_export) FROM exports WHERE id_account = 29) WHERE id_account = 29;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 30)-(SELECT SUM(price_export) FROM exports WHERE id_account = 30) WHERE id_account = 30;
UPDATE account SET now_balance =(SELECT balance_account FROM account WHERE id_account = 31)-(SELECT SUM(price_export) FROM exports WHERE id_account =31 ) WHERE id_account = 31;









