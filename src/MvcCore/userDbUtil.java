package MvcCore;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userDbUtil {

    private Database db = new Database();
    private boolean isLoggedIn;
    private String username;

    public void login(String username, String password){

        ResultSet user = db.single(username);

        try {
            if(user.getString("password").equals(password)){
                //1. return username in session
                username = user.getString("username");
                //2. set isLoggedIn to true
                isLoggedIn = true;
            } else {
                isLoggedIn = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
