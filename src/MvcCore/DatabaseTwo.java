package MvcCore;

import java.sql.DriverManager;
import java.sql.*;

public class DatabaseTwo {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lolhan_capwatch?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "lolhan_capuser", "Z3pVH5AgA58IpCzh");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM products");

                while (rs.next()) {
                    System.out.println(rs.getString("name"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

