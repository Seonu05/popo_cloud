package com.kh.inherit.chpa01.model.vo;

public class Cup extends Product{
		  //(자식)		//(부모)
	
	//필드
	private String brand;
	private double capacity;
	//private String pName;
	//private int price;

	//기본 생성자 
	//생성자의 역할 : 생성된 객체의 필드를 작성하기위해 
	public Cup() {}
	
	//매개변수 있는 생성자 : 생성된 객체가 전달받은 필드값을 쓰려 준비
	public Cup(String brand, double capacity, 
					String pName, int price) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		setpName(pName);
		setPrice(price);
		//부모로 부터 상속받은 pName과 price는 접근 제한자가 private이므로
		//직접 접근할 수는 없지만
		//부모로부터 상속받은
		
		//this.pName = pName;
		//this.price = price;
	}

	// getter / setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
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
	
	
	public String selectField() {
		return brand + " / " + capacity + " / " +
				getpName() +" / "+ getPrice(); 
				//부모 멤버변수에 간접 접근
				
			//	 pName + " / " + price;// 부모의 멤버변수에 직접접근 불가
	}
}
