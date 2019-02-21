package DAOImplementation;

import java.util.Iterator;
import java.util.List;

public class DAOMain {

	public static void main(String[] args) {
		
	 IssueService list = new IssueServiceImpl();
	 List<Issue> dateWiselist = list.getIssueByDate("22/07/2018");
	 Iterator<Issue> iterator = dateWiselist.iterator();
	 while(iterator.hasNext()) {
		 Issue is = iterator.next();
		 System.out.println(is.getName());
	 }
	 
	}

}
