package com.visualnation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/visualnation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "lolhan_capuser";
        String password = "Z3pVH5AgA58IpCzh";

        try {
            System.out.println("trying to connect to database visualnation");
            Connection myCon = DriverManager.getConnection(url,username,password);
            System.out.println("succesfull connection");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
