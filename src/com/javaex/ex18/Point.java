package com.javaex.ex18;

public class Point implements Drawable {

	private int x;
	private int y;
	
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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

	public void draw() { // 인터페이스 메소드 구현 > 반드시 해야 함
		System.out.println("x:"+x+" y:"+y+" 점을 찍었습니다.");
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
}
