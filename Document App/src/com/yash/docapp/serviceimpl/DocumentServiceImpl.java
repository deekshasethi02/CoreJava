package com.yash.docapp.serviceimpl;

import java.nio.channels.NoConnectionPendingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.domain.Document;
import com.yash.docapp.repository.Repository;
import com.yash.docapp.service.DocumentService;
import com.yash.docapp.util.CompareId;
import com.yash.docapp.util.NoElementFoundException;

public class DocumentServiceImpl<E> implements DocumentService {
	private DocumentDAO documentDAO;

	public DocumentServiceImpl(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}

	@Override
	public void addDocument(Document document) {
		documentDAO.insert(document);

	}

	@Override
	public void updateDocument(Document document) {
		
		documentDAO.update(document);

	}

	@Override
	public void deleteDocument(int documentId) throws NoElementFoundException {
		List<Document> documentList = documentDAO.list();
		try {
			if (documentList.size() == 0) {
				throw new NoElementFoundException();
			}
		} catch (Exception e) {
			
		}
		documentDAO.delete(documentId);

	}

	@Override
	public List<Document> listDocuments() throws NoElementFoundException {
		List<Document> documentList = documentDAO.list();
		if (documentList.size() == 0) {
			throw new NoElementFoundException();
		}
		return documentList;
	}

	@Override
	public List<Document> sortDocuments() {
		List<Document> documentlist = Repository.documentList;
		 Collections.sort(documentlist, new CompareId()); 
		 
		return documentlist;
	}

	@Override
	public List<Document> searchDocument(String searchTitle) {

		List<Document> documents = documentDAO.list();
		List<Document> filterDocs = new ArrayList<>();
		for (Document document: documents) {
			if (document.getTitle().contains(searchTitle)) {
				filterDocs.add(document);
			}
		}

		return filterDocs;
	}

	@Override
	public Document findByID(int searchId) {
		List<Document> documents = documentDAO.list();
		Document document = null;
		for (Document doc: documents) {
			if(doc.getId()==searchId) {
				document = doc;
			}
		}

		return document;
	}

	

	@Override
	public List<Document> findDuplicate() {
	List<Document> documentlist = documentDAO.list();
	List<Document> duplicate = new ArrayList();
	
	for(int i=0; i < documentlist.size(); i++) {
		for(int j=i+1; j<documentlist.size(); j++) {
			
			if(documentlist.get(i).getId()==documentlist.get(j).getId() && i!= j && documentlist.get(i).getTitle() == documentlist.get(j).getTitle() && documentlist.get(i).getDescription() == documentlist.get(j).getDescription()) {
				
				duplicate.add(documentlist.get(i));
				break;
			}
			
		}
		
	}
		return duplicate;
	}

}
