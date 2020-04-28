package com.kh.inherit.chpa01.model.vo;

public class Car extends Product{
	private String engine;
	private String color;
	private String carType;
	//private String pName;
	//private int price;
	
	
	public Car() {}

	
	public Car(String engine, String color, String carType, 
									String pName, int price) {
		//super();//�θ� �⺻ ������
		super(pName, price); //�θ��� �ϰ����� �ִ� ������
		this.engine = engine;
		this.color = color;
		this.carType = carType;
		//this.pName = pName;
		//this.price = price;
	}

	
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public String selectCar() {
		return engine + " / " + color + " / " + carType
				+ " / "+ super.selectField(); 
					//==> pName + " / " + price;
		// super ���� ����
		// - �ڽ� ��ü ���� �θ� ���� �κ��� �����ϴ� ����
		// - �θ��� �ʵ�� �޼ҵ忡 �����ؾ��� �� ���.
	}
	

}
