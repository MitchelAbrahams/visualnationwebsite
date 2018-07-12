package MvcCore;

import java.sql.*;

public class Database {

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private PreparedStatement prep = null;


   public Database() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
//           con = DriverManager.getConnection("jdbc:mysql://localhost:8889/visualnation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/visualnation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "lolhan_capuser", "Z3pVH5AgA58IpCzh");
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

   public ResultSet single(String username){
       try {
           rs = stmt.executeQuery("SELECT ? FROM users");
           bind(1,username);
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return rs;
   }
}
