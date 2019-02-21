package com.yash.amazon;

import java.util.List;

import com.yash.category.Category;

public class Amazon {
	public static void main(String[] args) {
		Category category = new Category();
		List<String> myCart = Category.selectCategory("mobiles");
	}

}
