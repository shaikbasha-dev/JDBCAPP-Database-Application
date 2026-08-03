/*
==============================================================
 Project Name : JDBCAPP - Database Application
 File Name    : create_database.sql
 Description  : Creates the Oracle user/schema for the project.
==============================================================
*/

-- Connect as SYSTEM user before executing this script.

-- Delete the user if it already exists.
DROP USER jdbcapp CASCADE;

-- Create a new user.
CREATE USER jdbcapp IDENTIFIED BY jdbcapp;

-- Grant required privileges.
GRANT CONNECT, RESOURCE TO jdbcapp;

-- Grant unlimited tablespace.
GRANT UNLIMITED TABLESPACE TO jdbcapp;

-- Display created user.
SELECT USERNAME
FROM ALL_USERS
WHERE USERNAME = 'JDBCAPP';