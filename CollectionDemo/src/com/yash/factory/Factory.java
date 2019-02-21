package com.yash.factory;

import java.util.ArrayList;
import java.util.List;

import com.yash.bike.Bike;

public class Factory {
	List<Bike> list = new ArrayList<>();

	public void placeOrder(int items) {
		for (int i = 0; i < items; i++) {
			Bike b1 = new Bike();
			list.add(b1);
		}
		System.out.println(list);
	}

}
