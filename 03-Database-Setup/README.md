# Database Setup

Before writing any Java code, a database must be created. The database stores all the information entered through the JDBC application.

In this project, two relational database management systems (RDBMS) are used:

- MySQL
- Oracle

The application allows the user to connect to either database and perform the same database operations.

---

# What is a Database?

A database is an organized collection of related data that can be stored, managed, and retrieved whenever required.

Example:

An employee management system stores employee information such as:

- Employee ID
- Employee Name
- Employee Salary
- Employee Email
- Employee Department

Instead of storing this information in files, it is stored inside a database.

---

# Database Used in this Project

The project supports the following databases:

- MySQL Database
- Oracle Database

The user can choose either database while running the application.

---

# Database Creation

The first step is creating the database.

Example Database Name:

```sql
jdbcapp
```

---

# Table Creation

Inside the database, an **Employee** table will be created.

The Employee table stores all employee information required by the application.

The table contains the following fields:

| Column Name | Description |
|-------------|-------------|
| emp_id | Employee ID |
| emp_name | Employee Name |
| emp_salary | Employee Salary |
| emp_email | Employee Email Address |
| emp_department | Employee Department |

---

# Database Workflow

```text
Create Database
        │
        ▼
Select Database
        │
        ▼
Create Employee Table
        │
        ▼
Insert Employee Records
        │
        ▼
Perform CRUD Operations
```

---

# Why Database Setup is Important?

A properly configured database helps to:

- Store application data.
- Retrieve information quickly.
- Update existing records.
- Delete unnecessary records.
- Maintain data consistency.

Without a database, the JDBC application cannot perform any operations.

---

# Learning Outcome

After completing this section, you will be able to:

- Understand the purpose of a database.
- Identify the database used in the project.
- Understand the Employee table.
- Prepare the database for the JDBC application.

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**.

Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

The database is the backbone of every JDBC application.

Once the database is created successfully, the next step is to understand the overall project architecture and how different components work together.

Happy Learning and Keep Coding!
