package com.yash.docapp.main;

import java.util.List;
import java.util.Scanner;

import com.yash.docapp.daoimpl.DocumentDAOImpl;
import com.yash.docapp.domain.Document;
import com.yash.docapp.repository.Repository;
import com.yash.docapp.service.DocumentService;
import com.yash.docapp.serviceimpl.DocumentServiceImpl;
import com.yash.docapp.util.MenuUtil;
import com.yash.docapp.util.NoElementFoundException;

public class ApplicationStartup {

	public static void main(String[] args) {

		startApp(new Scanner(System.in));

	}

	private static void startApp(Scanner scanner) {
		DocumentService documentService = new DocumentServiceImpl(new DocumentDAOImpl());
		Document document =null;
		
		int choice;
		String conti = null;

		do {

			MenuUtil.printMenu();
			System.out.println("Enter choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				createDocument(scanner, documentService);
				
				break;
			case 2:
				
				listDocument(documentService);
				break;

			case 3:
				searchDocument(scanner, documentService);
				break;

			case 4:
				
				findDocumentId(scanner, documentService);
				break;
			case 5:
				System.out.println("enter  document id to be deleted");
				int documentId = scanner.nextInt();
				 try {
					documentService.deleteDocument(documentId);
				} catch (NoElementFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				List documentlist = documentService.sortDocuments();
				listDocument(documentService);
				break;
				
			case 7:
				Document doc =null;
				System.out.println("Enter document by id");
				int id = scanner.nextInt();
				for (Document document1 : Repository.documentList) {
					if(document1.getId() == id) {
						documentService.updateDocument(document1);
					}
				}
				break;
				
			case 0:
				System.out.println("-----THANKYOU------");
				System.exit(0);
				break;

			default:
				System.out.println("----invalid choice----");
				break;
			}
			System.out.println("do you want to continue : [yes/no] :");
			conti = scanner.next();

		} while (conti.equals("yes"));
	}

	private static void findDocumentId(Scanner scanner, DocumentService documentService) {
		System.out.println("enter document id");
		int searchId = scanner.nextInt();
		 Document document3 = documentService.findByID(searchId);
		System.out.println(document3);
	}

	private static void searchDocument(Scanner scanner, DocumentService documentService) {
		System.out.println("enter title");
		String searchTitle = scanner.next();
		List<Document> docu = documentService.searchDocument(searchTitle);
		for (Document doc1 : docu) {
			System.out.println(doc1);
		}
	}

	private static void listDocument(DocumentService documentService) {
		List<Document> documents = null;
		try {
			documents = documentService.listDocuments();
		} catch (NoElementFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Document doc : documents) {
			System.out.println(doc);
		}
	}

	private static void createDocument(Scanner scanner, DocumentService documentService) {
		Document document = new Document();
		System.out.println("Enter id:");
		document.setId(scanner.nextInt());
		System.out.println("Enter title");
		scanner.nextLine();
		document.setTitle(scanner.nextLine());
		System.out.println("enter description");
		document.setDescription(scanner.nextLine());
		
		documentService.addDocument(document);
	}

}
