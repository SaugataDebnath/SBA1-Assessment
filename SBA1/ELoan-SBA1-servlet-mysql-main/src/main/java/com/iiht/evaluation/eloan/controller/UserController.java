package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.eloan.dao.ConnectionDao;




@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ConnectionDao connDao;

	public void setConnDao(ConnectionDao connDao) {
		this.connDao = connDao;
	}
	@Override
	public void init(ServletConfig config) {
		String jdbcURL = config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername = config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = config.getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL + jdbcUsername + jdbcPassword);
		this.connDao = new ConnectionDao(jdbcURL, jdbcUsername, jdbcPassword);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		String viewName = "";
		try {
			switch (action) {
			case "registernewuser":
				viewName=registernewuser(request,response);
				break;
			case "validate":
				viewName=validate(request,response);
				break;
			case "placeloan":
				viewName=placeloan(request,response);
				break;
			case "application1":
				viewName=application1(request,response);
				break;
			case "editLoanProcess"  :
				viewName=editLoanProcess(request,response);
				break;
			case "registeruser":
				viewName=registerUser(request,response);
				break;
			case "register":
				viewName = register(request, response);
				break;
			case "application":
				viewName = application(request, response);
				break;
			case "trackloan":
				viewName = trackloan(request, response);
				break;
			case "editloan":
				viewName = editloan(request, response);
				break;
			case  "displaystatus" :
				viewName=displaystatus(request,response);
				break;
			default : viewName = "notfound.jsp"; break;
			}
		} catch (Exception ex) {

			throw new ServletException(ex.getMessage());
		}
			RequestDispatcher dispatch =
					request.getRequestDispatcher(viewName);
			dispatch.forward(request, response);
	}

	private String validate(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		/* write the code to validate the user */

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

		return null;
	}
	private String placeloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write the code to place the loan information */

		String applicationNumber = request.getParameter("applicationNumber");
		String loanAmount = request.getParameter("LoanAmount");
		String applicationDate = request.getParameter("applicationDate");
		String businessStructure = request.getParameter("businessType");
		String billingIndicator = request.getParameter("salaried_yes_no");
		String taxIndicator = request.getParameter("tax_yes_no");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String contact = request.getParameter("contactNumber");
		String status = request.getParameter("status");

		// this.connDao.addLoan(applicationNumber, loanAmount, applicationDate,
		// businessStructure, billingIndicator, taxIndicator, address, contact, email,
		// status);

		return null;
	}
	private String application1(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write the code to display the loan application page */

		return null;
	}
	private String editLoanProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to edit the loan info */

		return null;
	}
	private String registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to redirect page to read the user details */
		return "newuserui.jsp";
	}
	private String registernewuser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to create the new user account read from user
		   and return to index page */

		String FirstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		String Gender = request.getParameter("gender");
		String Address = request.getParameter("address");
		String UserID = request.getParameter("username");
		String Password = request.getParameter("password");

		// connDao.registerUser(FirstName, LastName, Gender, Address, UserID, Password);

		return "index.jsp";

	}

	private String register(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write the code to redirect to register page */

		return null;
	}
	private String displaystatus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code the display the loan status based on the given application
		   number
		*/

		return null;
	}

	private String editloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to editloan page */
		return null;
	}

	private String trackloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	/* write a code to return to trackloan page */

		return null;
	}

	private String application(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	/* write a code to return to trackloan page */

		String LoanName = request.getParameter("");
		String LoanAppliedAmount = request.getParameter("");
		String DateofBirth = request.getParameter("");
		String LoanApplicationDate = request.getParameter("");
		String BusinessStructure = request.getParameter("");
		String BillingIndicator = request.getParameter("");
		String TaxIndicator = request.getParameter("");
		String Address = request.getParameter("");
		String PinCode = request.getParameter("");

		// calling details;
		/*
		 * if (true) { response.sendRedirect("loanDetails.jsp"); } else {
		 * response.sendRedirect("errorPage.jsp"); }
		 */

		return null;
	}
}