package com.iiht.evaluation.eloan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String relation = request.getParameter("relation");

		switch (relation) {
		case "Admin":
			String logid = request.getParameter("logid");
			String password = request.getParameter("password");

			if (logid.contentEquals("admin") && password.contentEquals("admin")) {

				response.sendRedirect("adminhome1.jsp");

			} else {

				response.sendRedirect("errorPage.jsp");

			}
			break;
		case "User":
			String logid1 = request.getParameter("logid");
			String password1 = request.getParameter("password");

			if (logid1.contentEquals("user") && password1.contentEquals("user")) {

				response.sendRedirect("userhome.jsp");

			} else {

				response.sendRedirect("errorPage.jsp");

			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
