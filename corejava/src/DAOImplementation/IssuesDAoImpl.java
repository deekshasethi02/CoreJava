package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

public class IssuesDAoImpl implements IssuesDAO {

	@Override
	public List<Issue> listIssues() {
		
		List<Issue> issuelist1 = initializeList();
		return issuelist1;
	}

	

	public static List<Issue> initializeList() {
		ArrayList<Issue> issueslist = new ArrayList<Issue>();
		issueslist.add(new Issue("goal1","22/07/2018",true));
		issueslist.add(new Issue("goal2","23/07/2018",true));
		issueslist.add(new Issue("goal3","24/07/2018",true));
		
		return issueslist;
	}
	
		
		
	}

	


