package com.yash.BufferedWriterReaderClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("arju.txt");
	BufferedWriter br = new BufferedWriter(fw);
	br.write("aman : ashish hate you");
	br.newLine();
	br.write("ashish : deeksha hate you");
	br.flush();
	br.close();
	
	
	File f1 = new File("arju.txt");
	FileReader f2 = new FileReader(f1);
	BufferedReader bw = new BufferedReader(f2);
	System.out.println(bw.readLine());

	System.out.println(bw.readLine());
}
}
