package com.jdbcapp.main;

import java.util.Scanner;

import com.jdbcapp.mysql.MySQLApp;
import com.jdbcapp.oracle.OracleApp;

/**
 * ==========================================================
 * Project Name : JDBCAPP - Database Application
 * Class Name   : JDBCAPP
 * Purpose      : Entry point of the application.
 * ==========================================================
 */

public class JDBCAPP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("==========================================");
            System.out.println("      JDBCAPP - Database Application");
            System.out.println("==========================================");
            System.out.println("1. MySQL");
            System.out.println("2. Oracle");
            System.out.println("3. Exit");
            System.out.println("==========================================");
            System.out.print("Enter Your Choice : ");

            int choice = scanner.nextInt();

            switch (choice) {

            case 1:

                MySQLApp.start();

                break;

            case 2:

                OracleApp.start();

                break;

            case 3:

                System.out.println();
                System.out.println("Thank You for Using JDBCAPP.");
                System.out.println("Application Closed Successfully.");

                scanner.close();

                System.exit(0);

                break;

            default:

                System.out.println();
                System.out.println("Invalid Choice.");
                System.out.println("Please Enter a Valid Option.");

            }

        }

    }

}