/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lion's Life
 */
public class login extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String uname=request.getParameter("uname");
String pass=request.getParameter("pass");        
String user=getServletConfig().getInitParameter("uname");
String passwd=getServletConfig().getInitParameter("pass");
if(uname.equals(user)&&pass.equals(passwd)){
out.println("Welcome user:"+uname);
}
else
    out.println("Goodbye");
//processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
