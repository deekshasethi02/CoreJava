package com.yash.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("ashish");
		list.add("aman");
		list.add("arju");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add("deeksha");
			//list.remove(1);
			iterator.remove();
		}
		System.out.println(list);

	}

}
