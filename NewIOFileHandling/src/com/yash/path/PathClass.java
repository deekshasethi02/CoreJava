package com.yash.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {
public static void main(String[] args) throws IOException {
//	Path p1 = Paths.get("gunjan.txt");
//	System.out.println(Files.exists(p1));
//	Files.createFile(p1);
//	System.out.println(Files.exists(p1));
	Path p2 = Paths.get("c://directory");
	Files.createDirectory(p2);
	Path p3 = Paths.get("c://directory//love.txt");
	Files.createFile(p3);
	System.out.println(p3.getFileName());
	System.out.println(p3.getName(0));
	System.out.println(p3.getRoot());
	System.out.println(p3.subpath(0, 1));
	System.out.println(p3.toString());
}
}
