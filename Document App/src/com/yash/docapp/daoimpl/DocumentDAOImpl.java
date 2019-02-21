package com.yash.docapp.daoimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.domain.Document;
import com.yash.docapp.repository.Repository;

public class DocumentDAOImpl implements DocumentDAO {
	Repository repository;
	
	public DocumentDAOImpl() {
		Repository repository =  Repository.getDocumentRepository();
	}

	@Override
	public void insert(Document document) {
		
		
		repository.documentList.add(document);
		System.out.println(document);
		System.out.println("Success ! document inserted");
	}

	@Override
	public void update(Document document) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("update document");
		System.out.println("Enter new Title");
		document.setTitle(scanner.nextLine());
		System.out.println("Enter new Description");
		document.setDescription((scanner.nextLine()));
		System.out.println(document);
	}

	@Override
	public void delete(int documentId) {
		System.out.println("delete document");
		List<Document> documentlist = repository.documentList;
		
		Iterator<Document> itr = documentlist.iterator();
		while(itr.hasNext()) {
			Document doc= itr.next();
			if(doc.getId() == documentId) {
				
				itr.remove();
			}
		}
		System.out.println("id "+documentId+ "deleted");
		
	}

	@Override
	public List<Document> list() {
			
		return repository.documentList;
	}

}
