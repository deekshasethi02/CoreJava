import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init() called : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String userName = req.getParameter("username");
		out.println("Welcome" + userName);

		HttpSession session = req.getSession();
		session.setAttribute("uname", userName);
		ServletContext ctx = getServletContext();
		int totalUsers = (int) ctx.getAttribute("totalusers");
		int currentUsers = (int) ctx.getAttribute("currentusers");

		out.print("<br>total users : " + totalUsers);
		out.print("<br>current users : " + currentUsers);
		out.print("<br><a href = 'logout'>logout</a> ");
		out.close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy() called : " + this.getClass().getName());
	}

}
