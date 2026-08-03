/*
==============================================================
 Project Name : JDBCAPP - Database Application
 File Name    : create_table.sql
 Description  : Creates the Employee table in Oracle.
==============================================================
*/

-- Connect as JDBCAPP user before executing this script.

-- Delete the Employee table if it already exists.
DROP TABLE Employee;

-- Create the Employee table.
CREATE TABLE Employee
(
    emp_id NUMBER(5) PRIMARY KEY,
    emp_name VARCHAR2(100) NOT NULL,
    emp_salary NUMBER(10,2) NOT NULL,
    emp_department VARCHAR2(100) NOT NULL
);

-- Display the table structure.
DESC Employee;