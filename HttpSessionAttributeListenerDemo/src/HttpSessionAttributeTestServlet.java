
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/listenerTest")
public class HttpSessionAttributeTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init() called:" + this.getClass().getName());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		sleep();
		session.setAttribute("CompanyName", "Wipro");

		sleep();
		session.setAttribute("CompanyName", "Infosys");
		sleep();
		session.removeAttribute("CompanyName");

	}

	private void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		System.out.println("destroy() called : " + this.getClass().getName());
	}

}