package com.kh.inherit.chpa01.model.vo;

//Computer 클래스가 product 클래스를 상속
//상속 키워드 : extends(확장하다)
//부모의 멤버 + 자식의 멤버 -> 부모보다 몸집이 확장됨
public class Computer extends Product {
	
	//필드
	private String cpu;
	private int ram;
	//private String pName;
	//private int price;
	
	//기본생성자
	public Computer() {
		super();
		//super() 기본 생성자는 
		//작성하지 않아도
		//JVM에 의해서 컴파일 단계에서 자동으로
		//생성자 제일 위쪽에 추가됨.
	}

	//매개변수가 있는 생성자
	//자동생성 가능
	public Computer(String cpu, int ram, String pName, 
			int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		//this.pName = pName;
		//this.price = price;
	}

	
	// getter/setter
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
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
	
	//필드 정보 출력

	public String selectField() {
		return cpu + " / " + ram + " / " ;
				//+ pName + " / " + price;
	}
}
