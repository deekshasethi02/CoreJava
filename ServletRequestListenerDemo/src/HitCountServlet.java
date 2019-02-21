

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hitCount")
public class HitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void init() throws ServletException {
		System.out.println("init() called :" + this.getClass().getName());
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2> This is target servlet </h2>");
		out.println("hits on this app :" + MyServletRequestListener.count);
		
	}

	public void destroy() {
		System.out.println("destroy() called :" + this.getClass().getName());
	}

	

}
