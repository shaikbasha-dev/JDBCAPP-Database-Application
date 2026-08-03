# Project Modules

The **JDBCAPP - Database Application** is divided into multiple modules. Each module performs a specific task, making the application easy to understand, develop, and maintain.

Instead of writing all the functionality in a single program, the application is organized into different modules that work together.

---

# What is a Module?

A module is a separate part of a program that performs a particular task.

Each module has its own responsibility and helps keep the application organized.

---

# Modules Available in JDBCAPP

The application contains the following modules:

1. Database Selection
2. Database Connection
3. Create Table
4. Insert Record
5. Update Record
6. Delete Record
7. Search Record
8. Display Records
9. Exit Application

---

# Module 1 – Database Selection

This is the first module executed after starting the application.

The user selects the database to work with.

Available databases:

- MySQL
- Oracle

Example:

```text
==============================
     SELECT DATABASE
==============================

1. MySQL

2. Oracle

Enter Your Choice :
```

---

# Module 2 – Database Connection

After selecting the database, the application establishes a connection with the selected database.

If the connection is successful, the application proceeds to the main menu.

Otherwise, an appropriate error message is displayed.

---

# Module 3 – Create Table

This module creates the required table inside the selected database.

The table is created only once.

If the table already exists, the application informs the user.

---

# Module 4 – Insert Record

This module inserts new employee information into the database.

The user enters:

- Employee ID
- Employee Name
- Employee Salary
- Employee Email
- Employee Department

The application stores the information in the selected database.

---

# Module 5 – Update Record

This module updates an existing employee record.

The user enters:

- Employee ID

Then modifies the required employee information.

---

# Module 6 – Delete Record

This module removes an employee record from the database.

The record is deleted using the Employee ID.

---

# Module 7 – Search Record

This module searches for a specific employee using the Employee ID.

If the record exists, the employee information is displayed.

Otherwise, an appropriate message is shown.

---

# Module 8 – Display Records

This module displays all employee records available in the selected database.

The information is presented in a readable format.

---

# Module 9 – Exit Application

This module safely terminates the application.

Before exiting, all database resources are properly closed.

---

# Complete Module Flow

```text
Start Application
        │
        ▼
Select Database
        │
        ▼
Connect to Database
        │
        ▼
Display Main Menu
        │
        ▼
Choose Operation
        │
        ▼
Create Table
Insert Record
Update Record
Delete Record
Search Record
Display Records
        │
        ▼
Exit Application
```

---

# Advantages of Module-Based Design

- Easy to Understand
- Easy to Maintain
- Easy to Debug
- Better Code Organization
- Easy to Expand
- Beginner-Friendly

---

# Learning Outcome

After completing this section, you will be able to:

- Understand the purpose of each module.
- Identify the sequence of operations.
- Understand how the application works.
- Prepare for the implementation phase.

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**.

Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

The functionality of the JDBCAPP application is now clearly divided into individual modules.

Understanding these modules will make the implementation process much easier in the following sections.

Happy Learning and Keep Coding!
