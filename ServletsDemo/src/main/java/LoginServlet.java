import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		RequestDispatcher rd;
		res.setContentType("text/html");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
//		req.setAttribute("email", email);
		if("demo@gmail.com".equals(email) && "demo".equals(password)) {
			rd=req.getRequestDispatcher("/welcome"); 
			rd.forward(req, res);
			  	
//			res.sendRedirect("welcome");
		}
		else {
			out.println("<h4>Invalid email or password<h4>");
			rd = req.getRequestDispatcher("/login.html");
			rd.include(req, res);
		}
		
	}
}
