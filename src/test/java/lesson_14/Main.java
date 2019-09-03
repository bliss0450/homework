package lesson_14;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "qig6fbjx";

    static Connection conn;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
                initDB();

                while (true) {
                    System.out.println("1: add Employee");
                    System.out.println("2: check Employees salary");
                    System.out.print("-> ");

                    String s = sc.nextLine();
                    switch (s) {
                        case "1":
                            addEmployee(sc);
                            break;
                        case "2":
                            selectEmployee(sc);
                            break;
                        default:
                            return;
                    }
                }
            } finally {
                sc.close();
                if (conn != null) conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return;
        }
    }

    private static void initDB() throws SQLException {
        Statement st = conn.createStatement();
        try {
            st.execute("DROP TABLE IF EXISTS Employees");
            st.execute("CREATE TABLE Employees (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20) NOT NULL, salary INT)");
        } finally {
            st.close();
        }
    }

    private static void addEmployee(Scanner sc) throws SQLException {
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        String sAge = sc.nextLine();
        int salary = Integer.parseInt(sAge);

        PreparedStatement ps = conn.prepareStatement("INSERT INTO Employees (name, salary) VALUES(?, ?)");
        try {
            ps.setString(1, name);
            ps.setInt(2, salary);
            ps.executeUpdate();
        } finally {
            ps.close();
        }
    }

    private static void selectEmployee(Scanner sc) throws SQLException {
        System.out.print("Enter employee salary from: ");
        String from = sc.nextLine();
        int fromP = Integer.parseInt(from);
        System.out.print("Enter employee salary to: ");
        String to = sc.nextLine();
        int toP = Integer.parseInt(to);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employees WHERE salary BETWEEN ? AND ?");
            ps.setInt(1, fromP);
            ps.setInt(2, toP);
        try {
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();

                for (int i = 1; i <= md.getColumnCount(); i++)
                    System.out.print(md.getColumnName(i) + "\t\t");
                System.out.println();

                while (rs.next()) {
                    for (int i = 1; i <= md.getColumnCount(); i++) {
                        System.out.print(rs.getString(i) + "\t\t");
                    }
                    System.out.println();
                }
            } finally {
                rs.close();
            }
        } finally {
            ps.close();
        }
    }
}
