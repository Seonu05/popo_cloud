package com.kh.inherit.practice.model.vo;

public class Circle extends Point {
	
	private int radius; //반지름
	
	public Circle() {
		super();
	}//기본생성자

	public Circle(int x, int y, int radius) {
		super(x, y); //부모 클래스에 있는 매개변수 가져오는 동시에 초기화
		this.radius = radius;
	}

	//getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//필드 정보 반환
	@Override
	public String toString() {
		return super.toString() + "," + radius;
	}
	
	
	
	

}
