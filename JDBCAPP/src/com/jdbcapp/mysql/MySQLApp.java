package com.jdbcapp.mysql;

import java.sql.*;
import java.util.Scanner;
import com.jdbcapp.util.DBConnection;

public class MySQLApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        Connection connection = DBConnection.getMySQLConnection();
        if (connection == null) return;

        int choice;
        do {
            System.out.println("\n========== MySQL Database Menu ==========");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Record");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Search Record");
            System.out.println("6. Display Records");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> createTable(connection);
                case 2 -> insertRecord(connection);
                case 3 -> updateRecord(connection);
                case 4 -> deleteRecord(connection);
                case 5 -> searchRecord(connection);
                case 6 -> displayRecords(connection);
                case 7 -> DBConnection.closeConnection(connection);
                default -> System.out.println("Invalid Choice.");
            }
        } while (choice != 7);
    }

    public static void createTable(Connection connection) {
        String sql = """
            CREATE TABLE IF NOT EXISTS Employee(
              emp_id INT PRIMARY KEY,
              emp_name VARCHAR(100) NOT NULL,
              emp_salary DOUBLE NOT NULL,
              emp_department VARCHAR(100) NOT NULL
            )
            """;
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(sql);
            System.out.println("Employee table created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertRecord(Connection connection) {
        String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            System.out.print("ID: ");
            int id = scanner.nextInt(); scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble(); scanner.nextLine();
            System.out.print("Department: ");
            String dept = scanner.nextLine();

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDouble(3,salary);
            ps.setString(4,dept);

            System.out.println(ps.executeUpdate()>0 ? "Inserted." : "Failed.");
        } catch(SQLException e){ e.printStackTrace(); }
    }

    public static void updateRecord(Connection connection) {
        String sql="UPDATE Employee SET emp_name=?, emp_salary=?, emp_department=? WHERE emp_id=?";
        try(PreparedStatement ps=connection.prepareStatement(sql)){
            System.out.print("Employee ID: ");
            int id=scanner.nextInt(); scanner.nextLine();
            System.out.print("New Name: ");
            String name=scanner.nextLine();
            System.out.print("New Salary: ");
            double sal=scanner.nextDouble(); scanner.nextLine();
            System.out.print("New Department: ");
            String dep=scanner.nextLine();

            ps.setString(1,name);
            ps.setDouble(2,sal);
            ps.setString(3,dep);
            ps.setInt(4,id);

            System.out.println(ps.executeUpdate()>0?"Updated.":"Employee not found.");
        }catch(SQLException e){e.printStackTrace();}
    }

    public static void deleteRecord(Connection connection){
        try(PreparedStatement ps=connection.prepareStatement("DELETE FROM Employee WHERE emp_id=?")){
            System.out.print("Employee ID: ");
            ps.setInt(1,scanner.nextInt());
            System.out.println(ps.executeUpdate()>0?"Deleted.":"Employee not found.");
        }catch(SQLException e){e.printStackTrace();}
    }

    public static void searchRecord(Connection connection){
        try(PreparedStatement ps=connection.prepareStatement("SELECT * FROM Employee WHERE emp_id=?")){
            System.out.print("Employee ID: ");
            ps.setInt(1,scanner.nextInt());
            try(ResultSet rs=ps.executeQuery()){
                if(rs.next()){
                    System.out.printf("%d %s %.2f %s%n",
                        rs.getInt("emp_id"),
                        rs.getString("emp_name"),
                        rs.getDouble("emp_salary"),
                        rs.getString("emp_department"));
                }else{
                    System.out.println("Employee not found.");
                }
            }
        }catch(SQLException e){e.printStackTrace();}
    }

    public static void displayRecords(Connection connection){
        try(Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM Employee")){
            while(rs.next()){
                System.out.printf("%d | %s | %.2f | %s%n",
                    rs.getInt("emp_id"),
                    rs.getString("emp_name"),
                    rs.getDouble("emp_salary"),
                    rs.getString("emp_department"));
            }
        }catch(SQLException e){e.printStackTrace();}
    }
}

