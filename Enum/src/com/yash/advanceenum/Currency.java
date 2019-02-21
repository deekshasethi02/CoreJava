package com.yash.advanceenum;

public enum Currency {
	
	PENNY(1) {

		@Override
		public String color() {
			// TODO Auto-generated method stub
			return "COPPPER";
		}
		
	},
	DIME(2) {

		@Override
		public String color() {
			// TODO Auto-generated method stub
			return "SILVER";
		}
		
	},
	NICKLE(5){

		@Override
		public String color() {
			// TODO Auto-generated method stub
			return "GOLD";
		}
		
		
	},
	QUATER(25){

		@Override
		public String color() {
			// TODO Auto-generated method stub
			return "BRONZE";
		}
		
	};
		

	private int value;

	private Currency(int value) {
		this.value = value;
	}

	public abstract String color();

	@Override
	public String toString() {
		switch (this) {
		case PENNY:
			System.out.println("penny " + value);

			break;
		case DIME:
			System.out.println("DIME " + value);

			break;
		case NICKLE:
			System.out.println("NICKLE " + value);

			break;

		
		case QUATER:
			System.out.println("QUATER " + value);

			break;

		
		
		}

		return super.toString();
	}

}
