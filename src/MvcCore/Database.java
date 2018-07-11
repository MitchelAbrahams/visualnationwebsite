package MvcCore;

import com.mysql.cj.protocol.ResultsetRow;

import java.sql.*;

public class Database {

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ResultsetRow rsw = null;
    private PreparedStatement prep = null;


   public Database() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:8889/visualnation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
           stmt = con.createStatement();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void query(String sql){
       try {
           prep = con.prepareStatement(sql);
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   public void excecute(){
        try {
            prep.execute();
            prep.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void bind(int index, String value){
        try {
            prep.setString(index, value);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   public ResultSet resultSet(){
       try {
           rs = stmt.executeQuery("SELECT * FROM users");
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return rs;
   }

   public ResultSet single(){
       try {
           rs = stmt.executeQuery("SELECT * FROM users");
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return rs;
   }
}
