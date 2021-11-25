package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	private static int totalCount; // 위험

	//생성자
	public Goods() {
		totalCount++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount++;
	}

	//메소드 g/s
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

	public int getTotalCount() {
		return totalCount;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

	public void showInfo() {
		System.out.println("name: " + name + " price: " + price);
	}

}
