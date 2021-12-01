package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Point p01 = new Point(5,5);
//		p01.draw();
//		System.out.println(p01.getX());
//		
//		Drawable p02 = new Point(114,117);
//		p02.draw();
//		System.out.println(((Point)p02).getX());  // 직접 접근 불가. 다운캐스팅하여 접근
		
		Drawable [] dArray = new Drawable[4];
		
		Drawable p01 = new Point(1,1);
		Drawable r01 = new Rectangle("빨강","빨강",5,7);
//		r01.draw();
//		System.out.println(((Rectangle)r01).getWidth());
//		System.out.println(((Rectangle)r01).getFillColor());
		Drawable c01 = new Circle("파랑","파랑",12);
		Drawable t01 = new Triangle("노랑","노랑",22,55);
		
		
		dArray[0]=p01;
		dArray[1]=r01;
		dArray[2]=c01;
		dArray[3]=t01;
		//그리기
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		//면적출력
		for(int i=0;i<dArray.length;i++) {
			if(dArray[i] instanceof Shape)
				System.out.println(((Shape)dArray[i]).area());
		}
		
		
	}

}
