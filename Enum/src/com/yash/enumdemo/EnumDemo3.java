package com.yash.enumdemo;

import com.yash.advanceenum.Currency;

public class EnumDemo3 {

	public static void main(String[] args) {
		Currency usCoin = Currency.DIME;
		switch(usCoin) {
		case PENNY :
			System.out.println("penny coin : "+usCoin.color());
			break;
			
		case DIME :
			System.out.println("dime coin : "+usCoin.color());
			break;
			
		case NICKLE :
			System.out.println("nickle coin : "+ usCoin.color());
			break;
		case QUATER :
			System.out.println("quater coin : "+usCoin.color());
			break;
			
			
		}
		
		
	}

}
