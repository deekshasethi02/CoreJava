package DAOImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IssueServiceImpl implements IssueService {

	@Override
	public List<Issue> getIssueByDate(String date) {
	IssuesDAO issuedao = new IssuesDAoImpl(); 
		//issuedao.listIssues();
		
		ArrayList<Issue> datelist = new ArrayList<Issue>();
		Iterator<Issue> iterator = (Iterator<Issue>) issuedao.listIssues();
		while(iterator.hasNext()) {
			if(iterator.next().getCreatedDate().contains("/07/"));
			System.out.println("datecheck");
			datelist.add(iterator.next());
		}
		System.out.println(datelist);
		return datelist;
	}

}
