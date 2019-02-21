
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCounterSample
 */
@WebServlet("/SessionCounterSample")
public class SessionCounterSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. get session object
		boolean create = true; // it will create session object on first request or will return the session if
								// available
		HttpSession session = request.getSession();
		// 2. get the session data
		Integer counter = (Integer) session.getAttribute("myCounter");
		if (counter == null) {
			counter = 1;

		} else {
			counter++;
		}
		session.setAttribute("myCounter", counter);
		// 3. output the page

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Tracking Demo </title></head>");
		out.println("<body>");
		out.println("<h1>Seesion Tracking  counter sample</h1>");
		out.println("you have hit this page : " + counter + "  times <br>");
		out.println("your session cookie " + request.getHeader("Cookie"));
		out.println("<br> your session id : " + session.getId());
		out.println("</body>");
		out.println("</html>");

	}

}
