package com.controller;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
  
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.deploy.LoginConfig;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	//	PrintWriter out = response.getWriter();
	//	out.println("<h1>Unauthorized access to this page!</h1>");
	//	out.println("<h3><a href=\"login.html\">Please Login</a></h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		if(name.equals(pwd))
		{
		RequestDispatcher rd= request.getRequestDispatcher("final");
		rd.forward(request, response);
		/*
		out.println("<h1>");
		out.println("Welcome ! "+name);
		out.println("</h1>");
		*/
		}
		else {
		out.println("<h1>Sorry invalid credentials..</h1>");
		RequestDispatcher rd= request.getRequestDispatcher("login.html");
		rd.include(request, response);
		/*
		out.println("<h1>Sorry invalid credentials..</h1>");
		out.println("<h3>To try again <a href=\"login.html\">Click here</a></h3>");
		*/
		}
		}}

	


