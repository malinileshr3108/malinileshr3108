DROP SCHEMA IF EXISTS education_db;

CREATE SCHEMA education_db;
USE education_db;
   
create table student(
	student_id INT AUTO_INCREMENT,
	student_name VARCHAR(50) not null,
	email_id VARCHAR(50) not null,
	country_interested VARCHAR(50) not null,
	intake_year INT not null,
	study_level VARCHAR(20) not null,
	course_interested VARCHAR(20) not null,
	
   CONSTRAINT ps_student_id_pk PRIMARY KEY (student_id)
);





INSERT INTO student VALUES(1001,'Shivaji','shivaji@gmail.com', 'Mexico',2022,'Graduation','Machine Learning');
INSERT INTO student VALUES(1002,'Jenny','jenny@gmail.com', 'Dubai',2023,'PHd','Statistics');
INSERT INTO student VALUES(1003,'Ruby','ruby99@gmail.com', 'America',2022,'MS','Computers');
INSERT INTO student VALUES(1004,'Alex','alex23@gmail.com', 'New zealand',2022,'Graduation','AI');



commit;

select * from student;

