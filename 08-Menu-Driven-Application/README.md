# Menu-Driven Application

A Menu-Driven Application is a program that allows users to interact with the system by selecting options from a menu.

Instead of remembering commands, the user simply enters the corresponding option number to perform the required operation.

In this project, the entire application works through menus, making it simple, organized, and beginner-friendly.

---

# What is a Menu-Driven Application?

A Menu-Driven Application is an application that displays a list of options to the user.

The user selects one option at a time, and the application performs the corresponding task.

---

# Why Do We Use a Menu-Driven Application?

A menu-driven application provides an easy way for users to interact with the program.

It helps to:

- Improve user experience.
- Reduce typing errors.
- Make navigation simple.
- Organize application features.
- Allow beginners to use the application easily.

---

# Application Flow

The application contains two levels of menus.

## Menu 1 – Database Selection

This menu is displayed when the application starts.

```text
====================================
        SELECT DATABASE
====================================

1. MySQL

2. Oracle

Enter Your Choice :
```

The user selects the database to connect.

---

## Menu 2 – Main Menu

After establishing the database connection successfully, the application displays the main menu.

```text
====================================
            MAIN MENU
====================================

1. Create Table

2. Insert Record

3. Update Record

4. Delete Record

5. Search Record

6. Display Records

7. Exit

Enter Your Choice :
```

The user selects the required operation.

---

# Application Execution Flow

```text
Start Application
        │
        ▼
Display Database Menu
        │
        ▼
User Selects Database
        │
        ▼
Establish Database Connection
        │
        ▼
Display Main Menu
        │
        ▼
User Selects an Operation
        │
        ▼
Execute Selected Module
        │
        ▼
Display Result
        │
        ▼
Return to Main Menu
        │
        ▼
Exit Application
```

---

# User Navigation

The application follows a continuous loop.

```text
Display Menu

↓

Accept User Choice

↓

Execute Selected Option

↓

Display Result

↓

Return to Menu

↓

Exit Only When User Chooses Exit
```

This approach allows the user to perform multiple operations without restarting the application.

---

# Advantages of a Menu-Driven Application

- Easy to Understand
- Beginner-Friendly
- Interactive
- Organized Navigation
- Reduces User Errors
- Supports Multiple Operations
- Easy to Maintain

---

# Learning Outcome

After completing this section, you will be able to:

- Understand the concept of a menu-driven application.
- Navigate through different application menus.
- Understand the flow of user interaction.
- Understand how the application processes user requests.

---

# Support

If this repository helps you in your learning journey, interview preparation, or future reference, please consider giving it a **Star ⭐**.

Your support is greatly appreciated and motivates me to continue creating high-quality educational repositories.

---

# Conclusion

The menu-driven approach makes the JDBCAPP easy to use and understand.

In the next section, we will study the complete execution flow of the application, from starting the program to performing database operations and exiting safely.

Happy Learning and Keep Coding!
