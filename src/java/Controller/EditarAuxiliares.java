/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ActivoDAO;
import DAO.AuxiliarDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author anfeg
 */
public class EditarAuxiliares extends HttpServlet {

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
            out.println("<title>Servlet EditarAuxiliares</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarAuxiliares at " + request.getContextPath() + "</h1>");
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
        try {
            AuxiliarDAO dao = new AuxiliarDAO();

            int id_auxiliar = Integer.parseInt(request.getParameter("id_auxiliar"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fechaEntrada = request.getParameter("fechaEntrada");
            String turno = request.getParameter("turno");
            int id_supervisor = Integer.parseInt(request.getParameter("id_supervisor"));

            request.setAttribute("id_auxiliar", id_auxiliar);
            request.setAttribute("nombre", nombre);
            request.setAttribute("apellido", apellido);
            request.setAttribute("fechaEntrada", fechaEntrada);
            request.setAttribute("turno", turno);
            request.setAttribute("id_supervisor", id_supervisor);

            request.getRequestDispatcher("EditarAuxiliar.jsp").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(EditarAuxiliares.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        try {

            int id_auxiliar = Integer.parseInt(request.getParameter("id_auxiliar"));
            String nombre = (String) request.getParameter("nombre");
            String apellido = (String) request.getParameter("apellido");
            String fechaEntrada = (String) request.getParameter("fechaEntrada");
            String turno = (String) request.getParameter("turno");
            int id_supervisor = Integer.parseInt(request.getParameter("id_supervisor"));

            AuxiliarDAO dao = new AuxiliarDAO();
            dao.updateAuxiliar(id_auxiliar, nombre, apellido, fechaEntrada, turno, id_supervisor);

        } catch (SQLException ex) {
            Logger.getLogger(EditarActivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("Auxiliarr");

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

}
