package com.kh.inherit.practice.model.vo;

public class Circle extends Point {
	
	private int radius; //������
	
	public Circle() {
		super();
	}//�⺻������

	public Circle(int x, int y, int radius) {
		super(x, y); //�θ� Ŭ������ �ִ� �Ű����� �������� ���ÿ� �ʱ�ȭ
		this.radius = radius;
	}

	//getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//�ʵ� ���� ��ȯ
	@Override
	public String toString() {
		return super.toString() + "," + radius;
	}
	
	
	
	

}
