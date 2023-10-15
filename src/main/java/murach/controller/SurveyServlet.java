/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.*;
/**
 *
 * @author huynhthihuyentrang
 */
@WebServlet(urlPatterns = {"/survey"})
public class SurveyServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url = "/indexSV.html";
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		// get current action
		String action = req.getParameter("action");
		if (action == null) {
			action = "join"; // default action
		}
		// perform action and set URL to appropriate page
		if (action.equals("join")) {
			url = "/index.html"; // the "join" page
		}
		else if (action.equals("add")) {
			// get parameters from the request
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String email = req.getParameter("email");
			String dOB = (String) req.getParameter("dOB");
			String hear = req.getParameter("hear");
			String cbLike = req.getParameter("cbLike");
			String cbSend = req.getParameter("cbSend");
			String contact = req.getParameter("contact");
			// store data in User object and save User object in database
			if (cbLike == null)
				cbLike = "No";
			else cbLike = "Yes";
			if (cbSend == null)
				cbSend = "No";
			else cbSend = "Yes";
			User user = new User(firstName, lastName, email, dOB, hear, cbLike, cbSend,contact);
			// set User object in request object and set URL
			req.setAttribute("user", user);
			url = "/thanks.jsp"; // the "thanks" page
		}
		// forward request and response objects to specified URL
		getServletContext().getRequestDispatcher(url).forward(req, resp);
	}
        @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
