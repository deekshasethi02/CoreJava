package com.yash.documentTest;


import com.yash.collapi.arrayList.List;
import com.yash.collapi.arrayList.MyArrayList;
import com.yash.document.Document;
import com.yash.document.OfficialDocument;
import com.yash.document.PersonalDocument;

public class DocumentTest {

	public static void main(String[] args) {
		List<Document> document = new MyArrayList<>();
	PersonalDocument personal = new PersonalDocument("training", "training document", "123");
		OfficialDocument official = new OfficialDocument("abc", "info", "100");
		document.add(personal);
		document.add(official);
		personal.showDocumentDetail();
		official.showDocumentDetail();
		
		
	}

}
