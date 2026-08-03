# JDBC Driver Configuration

Before a Java application can communicate with a database, a JDBC Driver must be added to the project.

A JDBC Driver acts as a bridge between the Java application and the database.

Without the JDBC Driver, the Java application cannot establish a connection with MySQL or Oracle.

---

# What is a JDBC Driver?

A JDBC Driver is a software component that enables a Java application to communicate with a database.

It converts the JDBC API calls made by the Java program into database-specific commands that the database can understand.

---

# Why is JDBC Driver Required?

The JDBC Driver is required because Java cannot communicate directly with a database.

The driver acts as an intermediary between:

- Java Application
- Database Management System (DBMS)

Without a JDBC Driver:

- Java cannot connect to the database.
- SQL queries cannot be executed.
- Data cannot be inserted, updated, deleted, or retrieved.

---

# JDBC Drivers Used in this Project

This project supports two databases.

## MySQL

Driver:

```text
MySQL Connector/J
```

---

## Oracle

Driver:

```text
Oracle JDBC Driver
```

---

# Add JDBC Driver to Eclipse Project

Follow these steps to add a JDBC Driver.

### Step 1

Right-click the Java project.

```text
JDBCAPP
```

---

### Step 2

Select

```text
Build Path

↓

Configure Build Path
```

---

### Step 3

Open

```text
Libraries
```

Tab.

---

### Step 4

Click

```text
Add External JARs...
```

---

### Step 5

Select the required JDBC Driver.

Example:

```text
mysql-connector-j-x.x.x.jar
```

or

```text
ojdbc.jar
```

---

### Step 6

Click

```text
Apply and Close
```

---

# Project Structure After Adding Driver

```text
JDBCAPP
│
├── src
├── JRE System Library
├── Referenced Libraries
│      ├── mysql-connector-j.jar
│      └── ojdbc.jar
└── README.md
```

---

# How to Verify Driver Configuration?

If the JDBC Driver is added successfully:

- No compilation errors will appear.
- Required JDBC classes can be imported.
- The application will be able to establish a database connection.

---

# Common Problems

### Driver Not Added

Cause

The JDBC Driver JAR file is not included in the project.

Solution

Add the required JDBC Driver using **Build Path**.

---

### Wrong Driver

Cause

The incorrect JDBC Driver is used.

Solution

Use the JDBC Driver that matches your database.

---

### Driver Class Not Found

Cause

The JDBC Driver is missing from the project.

Solution

Verify that the driver JAR file is present under **Referenced Libraries**.

---

# Learning Outcome

After completing this section, you will be able to:

- Understand the purpose of a JDBC Driver.
- Add JDBC Drivers to an Eclipse project.
- Configure MySQL Connector/J.
- Configure Oracle JDBC Driver.
- Verify successful driver configuration.
- Resolve common driver-related issues.

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**.

Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

The JDBC Drivers have now been configured successfully.

The project is ready to communicate with MySQL and Oracle databases.

The next step is to understand the modules available in the JDBCAPP application before implementing the project.

Happy Learning and Keep Coding!
