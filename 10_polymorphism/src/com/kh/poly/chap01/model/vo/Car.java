package com.kh.poly.chap01.model.vo;

public class Car {
	
	private String engine;
	private String color;
	
	//
	public Car() {}
   
	//
	public Car(String engine, String color) {
		super();
		this.engine = engine;
		this.color = color;
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

	//alt + shift + s
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", color=" + color + "]";
	}

	
	
	//���ε� Ȯ��
	// - ���ε�? ���� ������ �޼ҵ�� ȣ�� �Ǵ� �޼ҵ带 ���� �ϴ� ��
	public String drive() {
		return "�޸���.";
	}
	// �������� ����� ����  ex) Car c = new Bentley();
	// c.drive() �� ȣ���ϸ� 
	//������ �ܰ迡���� Car�� �ִ� drive()�� ���ε��� ������.
	// == ���� ���ε�
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
