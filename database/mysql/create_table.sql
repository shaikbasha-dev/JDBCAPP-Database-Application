/*
==============================================================
 Project Name : JDBCAPP - Database Application
 File Name    : create_table.sql
 Description  : Creates the Employee table.
==============================================================
*/

-- Select the Database
USE jdbcapp;

-- Delete the Employee table if it already exists
DROP TABLE IF EXISTS Employee;

-- Create the Employee table
CREATE TABLE Employee
(
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    emp_salary DOUBLE NOT NULL,
    emp_department VARCHAR(100) NOT NULL
);

-- Display the Table Structure
DESC Employee;

-- Display All Tables
SHOW TABLES;