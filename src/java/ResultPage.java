/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author athithyan
 */
@WebServlet(urlPatterns = {"/ResultPage"})
public class ResultPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ResultPage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String textBox = request.getParameter("myTextBox");
        boolean bool=StringToFile.writeFile(textBox);
        boolean[] status= CheckForJCompilation.check();
        String statusString="<table border = \"1\">";
        statusString+="<tr><td>C</td><td>"+status[1]+"</td></tr>";
        statusString+="<tr><td>C++</td><td>"+status[2]+"</td></tr>";
        statusString+="<tr><td>Java</td><td>"+status[0]+"</td></tr>";
        statusString+="<tr><td>Python</td><td>"+status[3]+"</td></tr>";
        statusString+="<tr><td>Ruby</td><td>"+status[4]+"</td></tr></table>";
        String docType
                = "<!doctype html public \"-//w3c//dtd html 4.0 "
                + "transitional//en\">\n";
        out.println(docType
                + "<html>\n"
                + "<head><title>" +"Mad Code Results"+ "</title></head>\n<h4> Here are your results</h4>"
                + "<body bgcolor=\"aqua\">\n\n"+statusString
                +"<br/><br/>"+describeStatus(status)
                +"</body></html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public String describeStatus(boolean[] status){
        String returnStr="";
    if(status[1])
    {
        returnStr+="<br/><h3>The Given Code can be successfully executed in C language</h3>";
    }
    if(status[2])
    {
        returnStr+="<br/><h3>The Given Code can be successfully executed in C++ language</h3>";
    }
    if(status[0])
    {
        returnStr+="<br/><h3>The Given Code can be successfully executed in Java language</h3>";
    }
    if(status[3])
    {
        returnStr+="<br/><h3>The Given Code can be successfully executed in Python language</h3>";
    }
    if(status[4])
    {
        returnStr+="<br/><h3>The Given Code can be successfully executed in Ruby language</h3>";
    }
    return returnStr;
    }

}
