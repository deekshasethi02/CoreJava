package com.yash.docapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.yash.docapp.domain.Document;

public class Repository {

public  static List<Document> documentList = new ArrayList<>();
private  static Repository repository;
public Repository() {
documentList.add(new Document(101, "test1", "desc of test 1"));
documentList.add(new Document(103, "test3", "desc of test 3"));
}

	public static  Repository getDocumentRepository() {
		if(repository == null) {
			repository = new Repository();
		}
		return repository;

	}
}
