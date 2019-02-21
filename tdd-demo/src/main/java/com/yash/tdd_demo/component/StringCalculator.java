package com.yash.tdd_demo.component;

import java.util.Arrays;

public class StringCalculator {

	public int add(String input) {
		
	if(input.isEmpty()) {
		return 0;
	}
	else {
		return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
	}
//	else if(input.indexOf(",") != -1){
//		String[] stringValues = input.split(",");
//		int sum =0;
//		for (String stringValue : stringValues) {
//			sum += Integer.parseInt(stringValue);
//		}
//		return sum;
//	}
//	else {
//			return Integer.parseInt(input);	
//		}
		
	}
	

}
