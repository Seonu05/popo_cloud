package com.kh.object.chap07_method.model.vo;

public class TV {
	
	private String screen;
	private boolean power;
	public static int voltage;
	
	
	//�⺻ ������
	public TV() {}
	
	public TV(String screen, boolean power, int voltage) {
		this.screen = screen;
		this.power = power;
		this.voltage = voltage;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public static void test() {
		System.out.println("test() �޼ҵ�� static �޼ҵ� �Դϴ�.");
	}
	
	
	
	
}
