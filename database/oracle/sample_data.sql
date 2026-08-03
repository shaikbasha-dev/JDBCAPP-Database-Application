/*
==============================================================
 Project Name : JDBCAPP - Database Application
 File Name    : sample_data.sql
 Description  : Inserts sample records into the Employee table.
==============================================================
*/

-- Connect as JDBCAPP user before executing this script.

-- Insert Sample Employee Records
INSERT INTO Employee VALUES
(101, 'Rahul', 45000, 'HR');

INSERT INTO Employee VALUES
(102, 'Priya', 52000, 'Finance');

INSERT INTO Employee VALUES
(103, 'Arjun', 60000, 'Development');

INSERT INTO Employee VALUES
(104, 'Sneha', 48000, 'Testing');

INSERT INTO Employee VALUES
(105, 'Kiran', 55000, 'Support');

-- Commit the transaction
COMMIT;

-- Display All Employee Records
SELECT * FROM Employee;