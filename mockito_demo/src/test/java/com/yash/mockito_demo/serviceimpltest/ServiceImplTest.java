package com.yash.mockito_demo.serviceimpltest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.yash.mockito_demo.issuedao.Issue;
import com.yash.mockito_demo.issuedaoimplstub.IssueDAOImplStub;
import com.yash.mockito_demo.issueservice.IssueService;
import com.yash.mockito_demo.issueserviceimpl.IssueServiceImpl;

public class ServiceImplTest {
	@Test
	public void testGetIssueByDate_ShouldReturnDate() throws Exception {
//		IssueService issueService = new IssueServiceImpl();
//		List<Issue> dateWiseIssue = issueService.getIssueByDate();
//		assertEquals(0,dateWiseIssue.size() );

		IssueService issueService = new IssueServiceImpl(new IssueDAOImplStub());
		List<Issue> issues = issueService.getIssueByDate();
		
	}

}
