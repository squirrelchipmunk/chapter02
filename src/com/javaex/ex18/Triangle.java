package com.javaex.ex18;

public class Triangle extends Shape implements Drawable {

	private int width;
	private int height;
	
	// 생성자
		public Triangle() {
			//super()
		}

		public Triangle(String lineColor, String fillColor, int width, int height) {
			super(lineColor, fillColor);
			this.width = width;
			this.height = height;
		}

		// 메소드 g/s

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		
		// 메소드일반
		@Override
		public String toString() {
			return "Triangle [width=" + width + ", height=" + height + ", LineColor=" + getLineColor()
					+ ", FillColor=" + getFillColor() + "]";
		}

		public void draw() { // 인터페이스 메소드 구현
			System.out.println("선색:"+super.getLineColor() +" 면색:"+super.getFillColor()+" 가로:"+width+" 세로:"+height+" 삼각형을 그렸습니다.");
		}

		public double area() {
			double result = width * height / 2;
			return result;
		}
	
}
