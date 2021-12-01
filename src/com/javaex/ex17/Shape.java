package com.javaex.ex17;

public abstract class Shape {

	private String lineColor;
	private String fillColor;
	
	public Shape() {
		
	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}



	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}



	public String getFillColor() {
		return fillColor;
	}



	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}



	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() { // 자식클래스에서 꼭 재정의해야 하는 것은 아님.
		System.out.println("선색:"+lineColor +" 면색:"+ fillColor+" 도형을 그렸습니다.");
	}

	//만들 수 없음. 껍데기만 만들기
	public abstract double area(); // 내부코드 작성할 수 없는 상황. 자식클래스에서 내부코드를 꼭 구현해야 함

	
	
	
	
}
