package servletProject4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/logout")
public class logoutPage  extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = req.getSession(false);
		session.removeAttribute("name"); // or whatever key you used

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		if(session!=null) {
			session.invalidate();
			out.print(" <h3  style=color:red> you have been logged out. </h3>");

			
		}
		else {
		out.print(" <h3  style=color:orange> No active session found </h3>");
		}
		
		
	}
}
