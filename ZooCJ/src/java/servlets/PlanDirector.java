/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import prototype.abstractEntities.*;
import prototype.client.*;
import prototype.concreteEntities.*;

/**
 *
 * @author jackl
 */
public class PlanDirector extends HttpServlet {
    private static Ticket info;

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
        Assignator selection = new Assignator();
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlanDirector</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PlanDirector at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            info=selection.assignation(Integer.parseInt(request.getParameter("selection_plan")));
            info.setInTime(request.getParameter("time_in"));
            info.setOutTime(request.getParameter("time_out"));
            info.setVisiterAmmount(request.getParameter("visiter_ammount"));
          
        }
    }
    public static Ticket getTicket(){
        return info;
    }


}
