/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import DataAccessLayer.UserInfo;
import JavaBeans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author My Pc
 */
public class RegistrationController extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        try{
            User user = UserInfo.createUser(request.getParameter("email"),
                    request.getParameter("pw"),
                    request.getParameter("fName"),
                    request.getParameter("lName"));
            request.setAttribute("user", user);
            this.getServletContext().getRequestDispatcher("/userProfile.jsp")
                    .forward(request, response);
        }
        catch(Exception e){
            PrintWriter out = response.getWriter();
            out.println("Error! "+e.getMessage());
        }
    }
}