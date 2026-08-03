/*
==============================================================
 Project Name : JDBCAPP - Database Application
 File Name    : sample_data.sql
 Description  : Inserts sample records into the Employee table.
==============================================================
*/

-- Select the Database
USE jdbcapp;

-- Insert Sample Employee Records
INSERT INTO Employee VALUES
(101, 'Rahul', 45000.00, 'HR'),
(102, 'Priya', 52000.00, 'Finance'),
(103, 'Arjun', 60000.00, 'Development'),
(104, 'Sneha', 48000.00, 'Testing'),
(105, 'Kiran', 55000.00, 'Support');

-- Display All Employee Records
SELECT * FROM Employee;