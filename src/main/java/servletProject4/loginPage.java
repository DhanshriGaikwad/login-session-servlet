package servletProject4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginPage extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
//	out.print(name);
//	out.print(password);
	
	if(name.equals("Dhanshri Gaikwad") && password.equals("pass@1234")) {
		out.println("<h2 style=color:green>name and password match</h2>");
		
//		req.setAttribute("name", "dhanshri gaikwad");
		HttpSession session=req. getSession();
		session.setAttribute("name", "Dhanshri Gaikwad");
		
		RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
		rd.forward(req, resp);
	}else {
		out.println("<h2 style=color:red >name and password dosn't match</h2>");
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.include(req, resp);
	}
}
}
