package com.yash.mockito_demo.issueserviceimpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yash.mockito_demo.issuedao.Issue;
import com.yash.mockito_demo.issuedaoimplstub.IssueDAOImplStub;
import com.yash.mockito_demo.issueservice.IssueService;

public class IssueServiceImpl implements IssueService {
	

	private IssueDAOImplStub issuedao;

	public IssueServiceImpl(IssueDAOImplStub issuedao) {
		this.issuedao = issuedao;
	}

	public List<Issue> getIssueByDate() {
		List<Issue> issuelist = IssueDAOImplStub.initializelist();
		ArrayList<Issue> datelist = new ArrayList<Issue>();
		
		return datelist;
	}

	

}
