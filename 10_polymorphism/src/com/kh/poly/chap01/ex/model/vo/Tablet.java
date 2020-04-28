package com.kh.poly.chap01.ex.model.vo;

public class Tablet extends Electronics {
	
	private String touchscreen;
	
	public Tablet() {}

	public Tablet(boolean power, String brand, String sNum, String touchscreen) {
		super(power, brand, sNum);
		this.touchscreen = touchscreen;
	}

	public String getTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(String touchscreen) {
		this.touchscreen = touchscreen;
	}

	@Override
	public String toString() {
		return "Tablet "+ super.toString() +", touchscreen = " + touchscreen + "]";
	}
	
	

}
