
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Servlet implementation class MyHttpSessionListener
 */
@WebServlet("/istenerTest")
public class MyHttpSessionListener extends HttpServlet implements HttpSessionListener {
	private static final long serialVersionUID = 1L;

	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		System.out.println("\n###########");
		
		System.out.println("sessionCreated() : " +this.getClass().getName());		
HttpSession session = httpSessionEvent.getSession();
		System.out.println(session + "Created :");
		System.out.println("ID = " + session.getId() +" MaxInactiveInterval"+ session.getMaxInactiveInterval() );
		
		System.out.println("\n###########");
		
	}

	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
System.out.println("\n###########");
		
		System.out.println("sessionDestroyed() : " +this.getClass().getName());		
		HttpSession session = httpSessionEvent.getSession();
		System.out.println(session + "Destroyed :");
		System.out.println("ID = " + session.getId() +" MaxInactiveInterval"+ session.getMaxInactiveInterval() );
		
		System.out.println("\n###########");
		
	}
}