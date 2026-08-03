# Exception Handling

While developing a JDBC application, different types of errors may occur. These errors are called **Exceptions**.

If exceptions are not handled properly, the application may terminate unexpectedly. Therefore, exception handling is an essential part of every JDBC application.

This section explains the importance of exception handling, the common exceptions encountered in JDBC, and how to handle them effectively.

---

# What is an Exception?

An Exception is an unexpected event that occurs during the execution of a program and interrupts the normal flow of the application.

---

# Why is Exception Handling Required?

Exception handling is required to:

- Prevent abnormal program termination.
- Display meaningful error messages.
- Continue program execution whenever possible.
- Improve application reliability.
- Handle database-related errors gracefully.

---

# Common Exceptions in JDBC

The following exceptions are commonly encountered while working with JDBC.

## SQLException

Occurs when an error happens while interacting with the database.

Examples:

- Invalid SQL Query
- Database Not Found
- Table Not Found
- Duplicate Primary Key
- Invalid Column Name

---

## ClassNotFoundException

Occurs when the JDBC Driver cannot be found.

Reason:

- JDBC Driver JAR file is not added to the project.
- Incorrect Driver Class Name.

---

## NullPointerException

Occurs when attempting to use an object that has not been initialized.

Example:

Trying to use a database connection before creating it.

---

## NumberFormatException

Occurs when invalid numeric input is entered.

Example:

Entering text instead of a number.

---

# How to Handle Exceptions?

Java provides the following keywords for exception handling.

- try
- catch
- finally

---

## try Block

The code that may generate an exception is written inside the **try** block.

---

## catch Block

The **catch** block handles the exception and displays an appropriate error message.

---

## finally Block

The **finally** block always executes whether an exception occurs or not.

It is generally used to close database resources such as:

- Connection
- Statement
- PreparedStatement
- ResultSet

---

# Exception Handling Flow

```text
Start

↓

Execute JDBC Code

↓

Exception Occurred?

↓

Yes
 │
 ▼
Handle Exception

↓

Close Resources

↓

Continue / Exit

↓

No
 │
 ▼
Execute Successfully

↓

Close Resources

↓

End
```

---

# Best Practices

- Always use try-catch blocks.
- Display meaningful error messages.
- Close database resources properly.
- Avoid empty catch blocks.
- Handle specific exceptions whenever possible.
- Test both successful and failure scenarios.

---

# Learning Outcome

After completing this section, you will be able to:

- Understand what an exception is.
- Identify common JDBC exceptions.
- Handle exceptions using try, catch, and finally.
- Write more reliable JDBC applications.
- Follow good exception handling practices.

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**.

Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

Exception handling improves the reliability and stability of JDBC applications by preventing unexpected program termination and providing meaningful error handling.

In the next section, we will review important interview questions related to JDBC and this project.

Happy Learning and Keep Coding!
