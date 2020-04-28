package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {
	
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int width, int height) {
		//사각형 넓이 계산 기능
		
		//객체 필드 초기화
		r.setX(x); 
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height); 
				
		//사각형 넓이
		double area = width * height;
				
		return "사각형 넓이 : " + r.toString() + " / " + (int)area;
	}
	
	
	public String calcPerimeter(int x, int y, int width, int height) {
		//사각형 둘레 계산 기능
		
		//객체 필드 초기화
		r.setX(x); 
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height); 
				
		//사각형 둘레
		double perimeter = 2 * (width + height);
				
		return "사각형 둘레 : " + r.toString() + " / " + (int)perimeter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
