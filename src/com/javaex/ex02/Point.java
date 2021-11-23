package com.javaex.ex02;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		// 해당 클래스를 메모리에 올리는 일 --> 하나만 쓸 때는 생략 가능하지만 매개변수를 받는 생성자가 있으면 생략 불가능.
		System.out.println("Point()실행");
	}
	public Point(int x) {
		this.x = x;
		System.out.println("Point(1)실행");
	}
	
	/*public Point(int y) {	오류 --> 매개변수의 순서, 자료형, 개수로 구별이 가능.
		this.y = y;
		System.out.println("Point(1)실행");
	}*/
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)실행");
	}

	// 메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다\n", x, y);
	}

}
