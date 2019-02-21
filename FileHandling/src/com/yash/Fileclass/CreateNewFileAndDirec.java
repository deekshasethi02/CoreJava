package com.yash.Fileclass;

import java.io.File;
import java.io.IOException;

public class CreateNewFileAndDirec {

	public static void main(String[] args) throws IOException {
		File file = new File("Deeksha.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.createNewFile());
		File newfile = new File("ashish");
		newfile.mkdir();
		File fileInDire = new File(newfile, "Deeksha.txt");
		fileInDire.createNewFile();
		System.out.println(fileInDire.delete());
		System.out.println(newfile.delete());;
		File myfile = new File("sethi.txt");
	file.renameTo(myfile);
	}
	
}
