
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequestAttributeTestServlet
 */
@WebServlet("/listenerTest")
public class ServletRequestAttributeTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init() method : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		sleep();
		req.setAttribute("CompanyName", "Wipro");
		
		sleep();
		req.setAttribute("CompanyName", "Infosys");
		sleep();
		req.removeAttribute("CompanyName");

	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		System.out.println("destroy() called :  " + this.getClass().getName());
	}

}
