package com.yash.test;

import java.util.ArrayList;

import com.yash.arraySize.YashCollection;

public class ArraySizeTest {

	public static void main(String[] args) {

		YashCollection yash = new YashCollection();

		addElement(yash);

		countElement(yash);

		searchElement(yash);

		retrieveElemet(yash);

		removeElement(yash);

		replaceElement(yash);

		insertElement(yash);

		displayElement(yash);

	}

	private static void addElement(YashCollection yash) {
		yash.add(1);
		yash.add(2);
		yash.add("a");
		yash.add(4);
		yash.add(5);
		yash.add(2345.89);
		yash.add(7);
		yash.add(8);
		yash.add(9);
		yash.add(10);
		yash.add(12);
		yash.add(null);

		Object[] objects = yash.list();
		for (Object object : objects) {
			System.out.println(object);

		}

	}

	private static void countElement(YashCollection yash) {
		yash.size();

	}

	private static void searchElement(YashCollection yash) {
		boolean check = yash.contains(null);
		System.out.println(check);
	}

	private static void retrieveElemet(YashCollection yash) {
		yash.get(2);

	}

	private static void replaceElement(YashCollection yash) {
		System.out.println("Replace element :  " + yash.set(3, "ashish"));
		Object[] objects1 = yash.list();
		for (Object object : objects1) {
			System.out.println(object);

		}
	}

	private static void removeElement(YashCollection yash) {
		System.out.println("remove element : " + yash.remove(1));
		Object[] objects2 = yash.list();
		for (Object object : objects2) {
			if (object != null)
				System.out.println(object);

		}
	}

	private static void insertElement(YashCollection yash) {
	Object [] obj =	(Object[]) yash.insert(1, "deeksha");
	for (Object object : obj) {
	System.out.println(object);	
	}
	}

	private static void displayElement(YashCollection yash) {
		yash.display();
	}

}
