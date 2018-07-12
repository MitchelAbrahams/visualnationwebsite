package MvcCore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MvcBase", urlPatterns = {"/mvcbase"})
public class MvcBase extends HttpServlet {

    private Database db = new Database();
    private List<String> namesList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ResultSet names = db.single("mitchel");

        try {
            while (names.next()) {
                if(names.getString("username").equals("inge")) {
                    namesList.add(names.getString("username"));
                } else {
                    namesList.add("this is not working");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

//        String[] namesList = {"Mitchel", "inge", "niels"};

        request.setAttribute("student_list", namesList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/names_test.jsp");

        dispatcher.forward(request, response);
    }
}
