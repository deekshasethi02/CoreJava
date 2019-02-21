package com.yash.enumdemo;
class Weekdays{
	public static final int SUNDAY =1;
	public static final int MONDAY =2;
	public static final int TUESDAY =3;
	public static final int WEDNESDAY =4;
	public static final int THURSDAY =5;
	public static final int FRIDAY =6;
	public static final int SATDAY =7;
}
class Day{
	private int day;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
public class EnumDemo {
public static void main(String[] args) {
	Day day = new Day();
	day.setDay(Weekdays.MONDAY);
	//day.setDay(15);
	System.out.println("Day is : "+day.getDay());
	
}
}
