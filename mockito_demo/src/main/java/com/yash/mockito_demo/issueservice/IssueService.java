package com.yash.mockito_demo.issueservice;
import java.util.List;

import com.yash.mockito_demo.issuedao.Issue;

public interface IssueService {

	List<Issue> getIssueByDate();

}
