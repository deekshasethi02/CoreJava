package com.webutech.service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseInquiryServlet
 */
@WebServlet("/CourseInquiryServlet")
public class CourseInquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Enumeration parameters = request.getParameterNames();
		StringBuilder sbCourse = new StringBuilder();
		while (parameters.hasMoreElements()) {
			Object obj = parameters.nextElement();
			String param = (String) obj;
			String parValue = request.getParameter(param);
			if(param.equals("course")) {
				String[] courses= request.getParameterValues("param");
				for (String course : courses) {
					sbCourse.append(course + " ");
				}
			}
System.out.println("Param : " +param+ "value :" +parValue);

		}
		System.out.println("Selected Cousrses :" +sbCourse);
	}

}
