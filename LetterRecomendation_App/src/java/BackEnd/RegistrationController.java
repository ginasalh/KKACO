/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import DataAccessLayer.UserInfo;
<<<<<<< HEAD
import DataAccessLayer.UserInterface;
import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
=======
import Interfaces.UserInterface;
import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
>>>>>>> master
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author My Pc
 */
public class RegistrationController extends HttpServlet {
<<<<<<< HEAD
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        try{
            UserInterface userInt = new UserInfo();
            User user = userInt.createUser(request.getParameter("email"),
=======

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user;
        try {
            UserInterface userInt = new UserInfo();
            /* User */
            user = userInt.createUser(request.getParameter("email"),
>>>>>>> master
                    request.getParameter("pw"),
                    request.getParameter("fName"),
                    request.getParameter("lName"));
            request.setAttribute("user", user);
            this.getServletContext().getRequestDispatcher("/userProfile.jsp")
                    .forward(request, response);
<<<<<<< HEAD
        }
        catch(Exception e){
            PrintWriter out = response.getWriter();
            out.println("Error! "+e.getMessage());
        }
    }
}
=======
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration failed. Please try again.');"); //
            out.println("location='index.jsp';");
            out.println("</script>");
            /*
             
             out.println("Error! "+e.getMessage());
             response.sendRedirect("/LetterRecomendation_App");*/
        }
    }
}
>>>>>>> master