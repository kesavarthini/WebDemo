package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;

	public ConfigDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		name = config.getInitParameter("user");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.getWriter().println("<h1> Good morning " + name + " </h1>");
		ServletContext ctxContext = request.getServletContext();
		String comp = ctxContext.getInitParameter("company");
		out.println("Welcome to " + comp + "</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		doGet(request, response);
	}

}
