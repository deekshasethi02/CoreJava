package com.yash.docapp.service;

import java.util.List;

import com.yash.docapp.domain.Document;
import com.yash.docapp.util.NoElementFoundException;

public interface DocumentService {
void addDocument(Document document);
void updateDocument(Document document);
void deleteDocument(int documentId) throws NoElementFoundException;
List<Document> listDocuments() throws NoElementFoundException;
List<Document> sortDocuments();
List<Document> searchDocument(String searchTitle);
Document findByID(int searchId);
List<Document> findDuplicate();

}
