package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		//사각형 3개를 만든다(메모리 올린다)
		Rectangle r01 = new Rectangle("빨강","노랑",5,5);
		Rectangle r02 = new Rectangle("파랑","노랑",10,20);
		Rectangle r03 = new Rectangle("빨강","빨강",55,77);
		
		
		//사각형 관리를 위해 배열을 만든다.
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 넣는다.
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 그리시오.
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
		//모든 사각형의 선색 출력.
//		for(int i=0;i<rArray.length;i++) {
//			System.out.println(rArray[i].getLineColor());
//		}
		System.out.println("---------------------------------");
		
		// 원 관리할 배열
		Circle [] cArray = new Circle[3];
		
		// 원 3개 만들기
		Circle c01 = new Circle("보라","빨강",10);
		Circle c02 = new Circle("주황","초록",5);
		Circle c03 = new Circle("파랑","검정",20);
		
		// 원 배열에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//모든 원 그리기
		for(int i=0;i<cArray.length;i++) {
			cArray[i].draw();
		}
		System.out.println("---------------------------------");
		Triangle [] tArray = new Triangle[3];
		Triangle t01 = new Triangle("빨강","노랑",10,3);
		Triangle t02 = new Triangle("초록","노랑",5,20);
		Triangle t03 = new Triangle("파랑","빨강",30,20);
		

		t01.draw();
		t02.draw();
		t03.draw();
	}

}
