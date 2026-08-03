package com.jdbcapp.main;

import java.util.Scanner;

import com.jdbcapp.mysql.MySQLApp;
import com.jdbcapp.oracle.OracleApp;

/**
 * ============================================================
 * Project Name : JDBCAPP - Database Application
 * Class Name   : JDBCAPP
 * Description  : Entry point of the application.
 * ============================================================
 */

public class JDBCAPP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n==========================================");
            System.out.println("      JDBCAPP - DATABASE APPLICATION");
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

                System.out.println("\nThank You for Using JDBCAPP.");
                scanner.close();
                System.exit(0);

                break;

            default:

                System.out.println("\nInvalid Choice. Please Try Again.");

            }

        }

    }

}
