

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Servlet implementation class CountUserListener
 */
//@WebServlet("/CountUserListener")
public class CountUserListener implements HttpSessionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
ServletContext ctx = null;
static int totalUserCount = 0,currentUserCount =0;
  
    public void sessionCreated(HttpSessionEvent httpSessionEvent)  { 
    	System.out.println("sessionCreated() called : " +this.getClass().getName());
    	
    	totalUserCount++;
    	currentUserCount++;
    	
    	ctx = httpSessionEvent.getSession().getServletContext();
    	
    	ctx.setAttribute("totalusers", totalUserCount);
    	ctx.setAttribute("currentusers", currentUserCount);
    }

	
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)  { 
    	System.out.println("sessionDestroyed() called : " +this.getClass().getName());
    	currentUserCount--;
    	ctx.setAttribute("currentusers", currentUserCount);
    	
    }

}
