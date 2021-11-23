package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: "+name);
		System.out.println("가격: "+price);
	}
	
}
