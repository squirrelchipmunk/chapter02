package com.javaex.ex14;

public class Rectangle extends Shape{
	// 필드
		private int width;
		private int height;

		// 생성자
		public Rectangle() {
			//super()
		}

		public Rectangle(String lineColor, String fillColor, int width, int height) {
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
		
		//부모쪽에 같은 메소드가 있음. 부모쪽 메소드를 사용하지 못하게 재정의.
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + getLineColor()
					+ ", fillColor=" + getFillColor() + "]";
		}
		
		public void draw() {
			System.out.println("선색:"+getLineColor() +" 면색:"+getFillColor()+" 가로:"+width+" 세로:"+height+" 사각형을 그렸습니다.");
			//System.out.println("선색:"+super.getLineColor() +" 면색:"+super.getFillColor()+" 가로:"+this.width+" 세로:"+this.height+" 사각형을 그렸습니다.");
		}
		
}
