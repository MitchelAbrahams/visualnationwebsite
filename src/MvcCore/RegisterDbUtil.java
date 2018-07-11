package MvcCore;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegisterDbUtil {

    private Database db = new Database();
    private boolean userFound;


    public boolean isRegistered(){
        return userFound;
    }

    public void register(String username, String email, String password) {
        String query = "INSERT INTO users (username, email, password) VALUES (?,?,?)";
        ResultSet users = db.resultSet();

        //check if email already exists
        try {
            while (users.next()) {
                if (users.getString("username").equals(username)) {
                    userFound = true;
                } else {
                    userFound = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //create new user with email
        if(userFound == false){
            db.query(query);
            db.bind(1, username);
            db.bind(2, email);
            db.bind(3, password);
            db.excecute();
        }
    }
}
