CREATE TABLE students(
id INT PRIMARY KEY,
name VARCHAR(50),
age  INT NOT NULL
);

INSERT into students VALUES(1,"SANDESH", 20);
INSERT into students VALUES(2,"HLOO", 10);

SELECT * FROM students;


SHOW DATABASES;

CREATE DATABASE xyz;
use xyz;

CREATE TABLE employee_info(
id INT PRIMARY KEY,
name VARCHAR(20),
salary FLOAT
);

INSERT INTO employee_info(id,name, salary) VALUES(5,"ADAM",25000);
INSERT INTO employee_info VALUES(2,"BOB",3000);

SELECT * FROM employee_info;


CREATE DATABASE college;
USE college ;

CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(25),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(20)
);

TRUNCATE TABLE student;

INSERT INTO student 
(rollno,name,marks,grade,city) 
VALUES 
(10,"san", 58 ,"B","Ason"),
(102,"sa", 25, "A","lalit"),
(101,"s", 90, "C","pur"),
(100,"sad", 82, "B","Ason");

SELECT name, marks FROM student;


SELECT DISTINCT city FROM student;
SELECT * FROM student ;

SELECT * FROM student WHERE marks>80 AND city ="Ason";

SELECT * FROM student WHERE marks+10>90;

SELECT * FROM student LIMIT 1;

SELECT * FROM student ORDER BY marks ASC;

SELECT MAX(marks)
FROM student ;

SELECT COUNT(marks)
FROM student ;

 
SELECT city , COUNT(rollno) 
FROM student
GROUP BY city ;

SELECT city 
FROM student
GROUP BY city 
HAVING MAX(marks)>85;


UPDATE student 
SET grade="O"
WHERE grade ="A";

UPDATE student 
SET grade="P"
WHERE grade ="B";


UPDATE student
 SET marks=49
WHERE rollno=102;

UPDATE student 
SET grade="A"
WHERE marks BETWEEN 80 AND 90;

SELECT * FROM student;
