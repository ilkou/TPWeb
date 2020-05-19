package com.ENSAK.TPWeb;
import com.ENSAK.TPWeb.Metier.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControleEtudiant
 */
@WebServlet("/ControleEtudiant")
public class ControleEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Etudiant> list = TraitementEtudiant.getAll();
		request.setAttribute("ControleEtudiant", list);
		getServletConfig().getServletContext().getRequestDispatcher("ProjetWeb/ListeEtudiant.jsp").forward(request,response);
	}

}
