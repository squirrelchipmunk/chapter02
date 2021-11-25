package com.javaex.ex09;

public class MyMath {

	//필드
	private static double pi = 3.14159;
	//생성자 > 디폴트
	
	// 메소드 g/s x
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static double plus(double a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double circleArea(int radius) {
		double area = radius*radius*pi;
		return area;
	}
	
	public static double circle(int radius) {
		double round = 2*radius*pi;
		return round;
	}
}
