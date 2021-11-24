package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw();
		
		Point p2 = new Point(7,7);
//		p2.setX(10);
//		p2.setY(23);
		p2.draw();
		
		Point p3 = new Point(100);
		p3.setY(101);
		p3.draw();

		Point p4 = new Point(55,65);
		p4.draw(true);
		p4.draw(false);
		p4.draw();
	}

}
