package MvcCore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;

@WebServlet(name = "Register", urlPatterns = "/register")
public class Register extends HttpServlet {

    RegisterDbUtil reg = new RegisterDbUtil();
    boolean isRegistered = reg.isRegistered();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reg.register(request.getParameter("username"), request.getParameter("email"), request.getParameter("password"));

        if(isRegistered){
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/homepage.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("registerErr" , "username has already been taken, pick another one.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
