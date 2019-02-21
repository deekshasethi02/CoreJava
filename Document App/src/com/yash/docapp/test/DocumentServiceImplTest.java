package com.yash.docapp.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.daoimpl.DocumentDAOImpl;
import com.yash.docapp.domain.Document;
import com.yash.docapp.service.DocumentService;
import com.yash.docapp.serviceimpl.DocumentServiceImpl;

public class DocumentServiceImplTest {

	@Test
	public void testfindDuplicate_GivenEmptyList_ReturnNull() {
		DocumentDAO documentDAO = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentDAO.list()).thenReturn(Arrays.asList());
		DocumentServiceImpl documentService = new DocumentServiceImpl(documentDAO);
		assertEquals(0,documentService.findDuplicate().size());
	}
 @Test
public void testfindDuplicate_Given1List_ShouldReturnList() {
	DocumentDAO documentDAO = Mockito.mock(DocumentDAO.class);
	Mockito.when(documentDAO.list()).thenReturn(Arrays.asList(new Document(101,"puneet","puneet docs")));
	DocumentServiceImpl documentService = new DocumentServiceImpl(new DocumentDAOImpl());
	
	assertEquals(0,documentService.findDuplicate().size());
		
	}


@Test
public void testfindDuplicate_Given2List_ShouldReturnList() {
DocumentDAO documentDAO = Mockito.mock(DocumentDAO.class);
Mockito.when(documentDAO.list()).thenReturn(Arrays.asList(new Document(101,"puneets","puneet docs"),new Document(101,"puneets","puneet docs")));
DocumentServiceImpl documentService = new DocumentServiceImpl(new DocumentDAOImpl());

assertEquals(1,documentService.findDuplicate().size());
	
}
}

