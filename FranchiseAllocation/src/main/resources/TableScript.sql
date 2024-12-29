DROP SCHEMA IF EXISTS franchise_db;

CREATE SCHEMA franchise_db;
USE franchise_db;
   
create table franchise(
	franchise_id INT AUTO_INCREMENT,
	franchise_name VARCHAR(50) not null,
	location VARCHAR(50) not null,
	quoted_price double not null,
	registration_date date not null,
	start_up_date date not null,
	tax_number VARCHAR(50) not null,
	tenure double not null,
	
   CONSTRAINT ps_franchise_id_pk PRIMARY KEY (franchise_id)
);





INSERT INTO franchise VALUES(1001,'Tea Point','Gachibowli', '1000000',sysdate(),sysdate(),'23-ASDFGHJK-234-I-5',1500000.0);

INSERT INTO franchise VALUES(1002,'Cloth Store','Gachibowli', '1500000',sysdate(),sysdate(),'98-QWERTYUIO-598-I-1',2000000.0);



commit;

select * from franchise;

