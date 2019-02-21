package com.yash.WriterClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewWriterClass {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("ashish");

		FileWriter file = new FileWriter(f1);

		file.write("ashish deeksha ");

		file.flush();

		file.close();

		char ch[] = new char[50];

		FileReader myfile = new FileReader("ashish");

		myfile.read(ch);

		for (char c : ch) {

			System.out.print(c);
		}

	}

}
