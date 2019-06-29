/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udem.java2.ejemplo1.sampleservlets;

import com.google.gson.Gson;
import edu.udem.java2.ejemplo1.sampleservlets.vo.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author s206e19
 */
public class FirstServlet extends HttpServlet {

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

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(
                    "<form action=\"FirstServlet\" method=\"POST\" >\n"
                    + "  <div class=\"container\">\n"
                    + "    <h1>Register</h1>\n"
                    + "    <p>Please fill in this form to create an account.</p>\n"
                    + "    <hr>\n <label for=\"email\"><b>nombre</b></label>\n"
                    + "    <input type=\"text\" placeholder=\"Enter Email\" name=\"nombre\" required>\n"
                    + "    \n"
                    + "    <label for=\"email\"><b>apellido</b></label>\n"
                    + "    <input type=\"text\" placeholder=\"Enter Email\" name=\"apellido\" required>\n"
                    + "    \n"
                    + "    <label for=\"email\"><b>usuario</b></label>\n"
                    + "    <input type=\"text\" placeholder=\"Enter Email\" name=\"usuario\" required>\n"
                    + "\n"
                    + "   <label for=\"psw\"><b>Password</b></label>\n"
                    + "    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n"
                    + "\n"
                    + "    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n"
                    + "    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\n"
                    + "    <hr>\n"
                    + "    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n"
                    + "\n"
                    + "    <button type=\"submit\" class=\"registerbtn\">Register</button>\n"
                    + "  </div>\n"
                    + "  \n"
                    + "  <div class=\"container signin\">\n"
                    + "    <p>Already have an account? <a href=\"#\">Sign in</a>.</p>\n"
                    + "  </div> "
                    + "</form>"
            );
        }
        //processRequest(request, response);
    }
    //HGhghhhh
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

        Persona p = new Persona();
        p.setApellido(request.getParameter("nombre"));
        p.setNombre(request.getParameter("apellido"));
        p.setUsuario(request.getParameter("usuario"));

        String personaJsonString = new Gson().toJson(p);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(personaJsonString);
        out.flush();
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
