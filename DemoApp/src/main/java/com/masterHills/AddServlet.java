package com.masterHills;

import java.io.IOException;
import java.io.PrintWriter;

//import com.masterHills.*;
import com.masterHills.Subtract;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet{
//	public void doGet(HttpServletRequest req,  HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		Subtract obj = new Subtract();
//		
//		PrintWriter out = res.getWriter();
//		out.println("The result is " + obj.takeAway(i,j));
//	}
	public void doGet(HttpServletRequest req,  HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
//		Subtract obj = new Subtract();
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		out.println("The result is " + k);
	}
}
