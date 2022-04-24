
/**
 * Write jdbc program that accept department from user and display the employee information who gave max salary from that departmentF
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Department {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            // Use database name & password according to your "dbname","pass"
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "dsk");
            psmt = conn.prepareStatement(
                    "select * from dept where salary = (select max(salary) from dept where dname=?)");

            System.out.println("Enter Dept Name :");
            String dep = sc.nextLine();
            psmt.setString(1, dep);

            rs = psmt.executeQuery();
            while (rs.next()) {
                System.out
                        .println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
            }

            psmt.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}