package com.TPWeb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String user = (String) req.getSession().getAttribute("uname");
		Double nbr1 = new Double(req.getParameter("nombre1"));
		Double nbr2 = new Double(req.getParameter("nombre2"));
		Double somme = nbr1 + nbr2;
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello " + user + "</h1>");
		out.println("<h3>la somme est: " + somme.toString() + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}
