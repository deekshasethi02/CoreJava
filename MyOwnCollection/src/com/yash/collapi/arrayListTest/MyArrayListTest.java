package com.yash.collapi.arrayListTest;

import com.yash.collapi.arrayList.MyArrayList;

public class MyArrayListTest {

	public static void main(String[] args) {
			
		MyArrayList arrayList = new MyArrayList();
		
		addElement(arrayList);
		countElement(arrayList);

	}

	private static void countElement(MyArrayList arrayList) {
		System.out.println("--------count element-----------");
		System.out.println("Size of list "+arrayList.size());
		
	}

	private static void addElement(MyArrayList arrayList) {
		System.out.println("-------Add element---------");
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add("a");
		arrayList.add(4);
		arrayList.add(5);
		

		Object[] objects = arrayList.list();
		for (Object object : objects) {
			System.out.println(object);

		}
	}

}
