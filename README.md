# JDBCAPP - Database Application

A Java-based JDBC Database Application that demonstrates database connectivity and CRUD operations using JDBC API with MySQL and Oracle databases.

This project demonstrates how Java applications communicate with relational databases using JDBC (Java Database Connectivity) and perform database operations such as creating tables, inserting records, updating records, deleting records, searching records, and displaying data.

---

# Project Overview

JDBCAPP is a console-based database application developed using Java JDBC technology.

The main objective of this project is to understand:

- JDBC Architecture
- Database Connectivity
- SQL Integration with Java
- PreparedStatement Usage
- ResultSet Handling
- CRUD Operations
- Real-Time Database Application Development

The application supports:

- MySQL Database Connectivity
- Oracle Database Connectivity
- Database SQL Scripts
- Table Creation
- Sample Data Insertion
- Employee Record Management

---

# Features

## Database Connectivity

- Connect Java applications with MySQL Database
- Connect Java applications with Oracle Database
- Manage database connections using JDBC API
- Handle database exceptions

---

## CRUD Operations

The application supports complete CRUD operations:

### Create

- Create database tables
- Execute SQL CREATE queries

### Read

- Retrieve employee records
- Display database information

### Update

- Modify existing employee details

### Delete

- Remove employee records from database

---

# Technologies Used

## Programming Language

- Java

## Database Technologies

- MySQL
- Oracle Database

## Connectivity Technology

- JDBC (Java Database Connectivity)

## Development Tools

- Visual Studio Code
- MySQL Workbench
- Oracle Database Express Edition

## JDBC Driver

- MySQL Connector/J

---

# JDBC Architecture Flow

```
Java Application
        |
        |
        ↓
JDBC API
        |
        |
        ↓
JDBC Driver
        |
        |
        ↓
Database
(MySQL / Oracle)
```

---

# Project Structure

```
JDBCAPP-Database-Application
│
├── README.md
├── LICENSE
├── .gitignore
│
├── database
│   │
│   ├── mysql
│   │   ├── create_database.sql
│   │   ├── create_table.sql
│   │   └── sample_data.sql
│   │
│   └── oracle
│       ├── create_database.sql
│       ├── create_table.sql
│       └── sample_data.sql
│
└── JDBCAPP
    │
    ├── README.md
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

# Database Setup

## MySQL Database Setup

Execute SQL files in the following order:

### Step 1: Create Database

File:

```
database/mysql/create_database.sql
```

Creates:

```
jdbcapp
```

---

### Step 2: Create Table

File:

```
database/mysql/create_table.sql
```

Creates:

```
Employee
```

Table Structure:

| Column | Data Type |
|--------|-----------|
| emp_id | INT |
| emp_name | VARCHAR |
| emp_salary | DOUBLE |
| emp_department | VARCHAR |

---

### Step 3: Insert Sample Data

File:

```
database/mysql/sample_data.sql
```

Inserts employee records into the Employee table.

---

# Oracle Database Setup

Execute SQL files in the following order:

### Step 1: Create Database

```
database/oracle/create_database.sql
```

---

### Step 2: Create Table

```
database/oracle/create_table.sql
```

---

### Step 3: Insert Sample Data

```
database/oracle/sample_data.sql
```

---

# JDBC Connection Management

Database connection handling is implemented in:

```
src/com/jdbcapp/util/DBConnection.java
```

Responsibilities:

- Load JDBC Driver
- Establish database connection
- Manage MySQL connection
- Manage Oracle connection
- Close database connections

---

# Application Modules

## Main Module

Location:

```
com.jdbcapp.main
```

File:

```
JDBCAPP.java
```

Responsibilities:

- Display main application menu
- Select database option
- Start MySQL or Oracle application

---

## MySQL Module

Location:

```
com.jdbcapp.mysql
```

File:

```
MySQLApp.java
```

Responsibilities:

- Connect with MySQL Database
- Perform CRUD operations
- Manage Employee records

---

## Oracle Module

Location:

```
com.jdbcapp.oracle
```

File:

```
OracleApp.java
```

Responsibilities:

- Connect with Oracle Database
- Perform CRUD operations
- Manage Employee records

---

# How to Run the Application

## Step 1: Add JDBC Driver

Add MySQL Connector JAR:

```
JDBCAPP/lib/mysql-connector-j.jar
```

---

## Step 2: Compile Java Files

Navigate to:

```
JDBCAPP/src
```

Execute:

```bash
javac -cp "..\lib\mysql-connector-j.jar" com\jdbcapp\util\DBConnection.java com\jdbcapp\mysql\MySQLApp.java com\jdbcapp\oracle\OracleApp.java com\jdbcapp\main\JDBCAPP.java
```

---

## Step 3: Run Application

Execute:

```bash
java -cp ".;..\lib\mysql-connector-j.jar" com.jdbcapp.main.JDBCAPP
```

---

# Application Menu

```
==========================================
      JDBCAPP - Database Application
==========================================

1. MySQL
2. Oracle
3. Exit

==========================================
```

---

# MySQL Application Menu

```
========== MySQL Database Menu ==========

1. Create Table
2. Insert Record
3. Update Record
4. Delete Record
5. Search Record
6. Display Records
7. Exit

==========================================
```

---

# Sample Output

## Database Connection

```
MySQL Database Connected Successfully.
```

---

## Display Records

```
101 | Rahul | 45000.00 | HR
102 | Priya | 52000.00 | Finance
103 | Arjun | 60000.00 | Development
104 | Sneha | 48000.00 | Testing
105 | Kiran | 55000.00 | Support
```

---

# CRUD Operations Demonstration

## Insert Record

Example:

```
ID: 106
Name: Basha
Salary: 70000
Department: Java
```

Output:

```
Inserted.
```

---

## Display Record

Output:

```
106 | Basha | 70000.00 | Java
```

---

## Update Record

Output:

```
Updated.
```

---

## Delete Record

Output:

```
Deleted.
```

---

## Search Record

Output:

```
Employee Record Found
```

---

# Learning Outcomes

This project covers:

- Java Database Connectivity
- JDBC API
- JDBC Driver Management
- SQL Integration
- PreparedStatement
- Statement
- ResultSet
- Exception Handling
- Database Transactions
- CRUD Application Development

---

# Real-Time Usage

JDBC concepts learned from this project are used in:

- Banking Applications
- Employee Management Systems
- Inventory Applications
- Student Management Systems
- Enterprise Java Applications

---

# Future Enhancements

Possible improvements:

- Add GUI using Java Swing/JavaFX
- Add Spring JDBC Integration
- Add Hibernate ORM
- Add User Authentication
- Add Connection Pooling
- Convert into Web Application

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**. Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

JDBCAPP - Database Application provides practical knowledge of connecting Java applications with relational databases using JDBC.

This project demonstrates complete database interaction using Java and prepares the foundation for developing enterprise-level database applications.

---

Happy Learning and Keep Coding!