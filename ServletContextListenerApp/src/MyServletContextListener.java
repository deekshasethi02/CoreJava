

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyServletContextListener
 */
@WebServlet("/MyServletContextListener")
public class MyServletContextListener implements ServletContextListener {
	private static final long serialVersionUID = 1L;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("/n###########");
	System.out.println("contextInitialized() : " +this.getClass().getName());
	ServletContext servletContext =  servletContextEvent.getServletContext();
	System.out.println(servletContext + " is initialized or created ");
	System.out.println("/n###########");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("\n###########");
		System.out.println("contextDestroyed() : " +this.getClass().getName());		
		ServletContext servletContext =  servletContextEvent.getServletContext();
		System.out.println(servletContext + " is DESTROYED ");
		System.out.println("\n###########");
		
	}

   

}
