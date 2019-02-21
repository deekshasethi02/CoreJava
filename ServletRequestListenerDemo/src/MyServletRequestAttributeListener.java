

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyServletRequestAttributeListener
 */
@WebServlet("/MyServletRequestAttributeListener")
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("attributeAdded() called on :" +this.getClass().getName());
		
		System.out.println("newly added attribute : " +servletRequestAttributeEvent.getName() + "value : " +servletRequestAttributeEvent.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	System.out.println("attributeRemoved() called on :" +this.getClass().getName());
		
		System.out.println("Removed attribute : " +servletRequestAttributeEvent.getName() + "value : " +servletRequestAttributeEvent.getValue());
			
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	System.out.println("attributeReplaced() called on :" +this.getClass().getName());
		
		System.out.println("Replaced attribute : " +servletRequestAttributeEvent.getName() + "value : " +servletRequestAttributeEvent.getValue());
		
	}
       
   

}
