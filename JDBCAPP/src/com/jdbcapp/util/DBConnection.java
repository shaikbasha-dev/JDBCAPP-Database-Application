package com.jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ==========================================================
 * Project Name : JDBCAPP - Database Application
 * Class Name   : DBConnection
 * Purpose      : Establishes database connections for
 *                MySQL and Oracle databases.
 * ==========================================================
 */

public class DBConnection {

    // ==========================
    // MySQL Database Details
    // ==========================

    private static final String MYSQL_DRIVER =
            "com.mysql.cj.jdbc.Driver";

    private static final String MYSQL_URL =
            "jdbc:mysql://localhost:3306/jdbcapp";

    private static final String MYSQL_USERNAME =
            "root";

    private static final String MYSQL_PASSWORD =
            "root";

    // ==========================
    // Oracle Database Details
    // ==========================

    private static final String ORACLE_DRIVER =
            "oracle.jdbc.driver.OracleDriver";

    private static final String ORACLE_URL =
            "jdbc:oracle:thin:@localhost:1521:xe";

    private static final String ORACLE_USERNAME =
            "jdbcapp";

    private static final String ORACLE_PASSWORD =
            "jdbcapp";

    /**
     * Creates and returns a MySQL database connection.
     */
    public static Connection getMySQLConnection() {

        Connection connection = null;

        try {

            Class.forName(MYSQL_DRIVER);

            connection = DriverManager.getConnection(
                    MYSQL_URL,
                    MYSQL_USERNAME,
                    MYSQL_PASSWORD);

            System.out.println("\nMySQL Database Connected Successfully.");

        } catch (ClassNotFoundException exception) {

            System.out.println("\nMySQL JDBC Driver Not Found.");

            exception.printStackTrace();

        } catch (SQLException exception) {

            System.out.println("\nUnable to Connect to MySQL Database.");

            exception.printStackTrace();

        }

        return connection;

    }

    /**
     * Creates and returns an Oracle database connection.
     */
    public static Connection getOracleConnection() {

        Connection connection = null;

        try {

            Class.forName(ORACLE_DRIVER);

            connection = DriverManager.getConnection(
                    ORACLE_URL,
                    ORACLE_USERNAME,
                    ORACLE_PASSWORD);

            System.out.println("\nOracle Database Connected Successfully.");

        } catch (ClassNotFoundException exception) {

            System.out.println("\nOracle JDBC Driver Not Found.");

            exception.printStackTrace();

        } catch (SQLException exception) {

            System.out.println("\nUnable to Connect to Oracle Database.");

            exception.printStackTrace();

        }

        return connection;

    }

    /**
     * Closes the database connection safely.
     */
    public static void closeConnection(Connection connection) {

        if (connection != null) {

            try {

                connection.close();

                System.out.println("\nDatabase Connection Closed Successfully.");

            } catch (SQLException exception) {

                System.out.println("\nError While Closing Database Connection.");

                exception.printStackTrace();

            }

        }

    }

}