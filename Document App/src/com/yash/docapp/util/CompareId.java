package com.yash.docapp.util;

import java.util.Comparator;

import com.yash.docapp.domain.Document;

public class CompareId implements Comparator<Document> {

	@Override
	public int compare(Document doc1, Document doc2) {
			
	        return (doc1.getId() - doc2.getId()) ; 
	    
	}

}
