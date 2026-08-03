# JDBCAPP - Java JDBC Application

A console-based Java JDBC application that demonstrates database connectivity and CRUD operations using JDBC API.

This module contains the complete Java implementation for connecting with MySQL and Oracle databases and performing database operations.

---

# Module Overview

The JDBCAPP module contains:

- Java source files
- JDBC connection management
- MySQL database operations
- Oracle database operations
- JDBC Driver configuration

The application follows a structured package-based architecture.

---

# Technologies Used

## Programming Language

- Java

## Database Connectivity

- JDBC (Java Database Connectivity)

## Supported Databases

- MySQL
- Oracle Database

## JDBC Driver

- MySQL Connector/J

---

# Source Code Structure

```
JDBCAPP
│
├── lib
│   └── mysql-connector-j.jar
│
└── src
    │
    └── com.jdbcapp
        │
        ├── main
        │   └── JDBCAPP.java
        │
        ├── mysql
        │   └── MySQLApp.java
        │
        ├── oracle
        │   └── OracleApp.java
        │
        └── util
            └── DBConnection.java
```

---

# Package Description

## com.jdbcapp.main

Contains the main application class.

File:

```
JDBCAPP.java
```

Responsibilities:

- Start application execution
- Display main menu
- Allow database selection
- Redirect execution to MySQL or Oracle modules

---

## com.jdbcapp.mysql

Contains MySQL database operations.

File:

```
MySQLApp.java
```

Responsibilities:

- Connect with MySQL database
- Create tables
- Insert employee records
- Update records
- Delete records
- Search records
- Display records

---

## com.jdbcapp.oracle

Contains Oracle database operations.

File:

```
OracleApp.java
```

Responsibilities:

- Connect with Oracle database
- Perform database operations
- Manage employee records

---

## com.jdbcapp.util

Contains database connection management.

File:

```
DBConnection.java
```

Responsibilities:

- Load JDBC drivers
- Create database connections
- Manage MySQL connection
- Manage Oracle connection
- Close connections

---

# JDBC Connection Flow

```
JDBCAPP.java

      |
      ↓

MySQLApp.java / OracleApp.java

      |
      ↓

DBConnection.java

      |
      ↓

JDBC Driver

      |
      ↓

Database
```

---

# MySQL Implementation

The MySQL module connects using:

```
MySQL Connector/J
```

Connection details:

```
Database : jdbcapp
Host     : localhost
Port     : 3306
User     : root
```

---

# CRUD Operations

The application supports:

## Create

Creates database tables using SQL queries.

---

## Insert

Adds new employee records.

Example:

```
ID: 106
Name: Basha
Salary: 70000
Department: Java
```

---

## Read

Retrieves employee details from the database.

---

## Update

Updates existing employee information.

---

## Delete

Deletes employee records.

---

## Search

Searches employee details using employee ID.

---

# Running the Application

## Step 1: Navigate to Source Folder

```
JDBCAPP/src
```

---

## Step 2: Compile Source Files

```bash
javac -cp "..\lib\mysql-connector-j.jar" com\jdbcapp\util\DBConnection.java com\jdbcapp\mysql\MySQLApp.java com\jdbcapp\oracle\OracleApp.java com\jdbcapp\main\JDBCAPP.java
```

---

## Step 3: Execute Application

```bash
java -cp ".;..\lib\mysql-connector-j.jar" com.jdbcapp.main.JDBCAPP
```

---

# Application Flow

```
Start Application

        ↓

Select Database

        ↓

Connect Database

        ↓

Select Operation

        ↓

Execute SQL Query

        ↓

Display Result
```

---

# Database Operations Menu

```
========== MySQL Database Menu ==========

1. Create Table
2. Insert Record
3. Update Record
4. Delete Record
5. Search Record
6. Display Records
7. Exit
```

---

# Exception Handling

The application handles:

- JDBC Driver Errors
- Connection Errors
- SQL Exceptions
- Invalid User Inputs

---

# Project Learning

This module provides practical understanding of:

- JDBC Architecture
- Database Connectivity
- SQL Execution from Java
- PreparedStatement
- ResultSet
- Exception Handling
- CRUD Application Development

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**. Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

The JDBCAPP module demonstrates how Java applications communicate with relational databases using JDBC.

It provides a strong foundation for developing real-world database-driven Java applications.

---

Happy Learning and Keep Coding!