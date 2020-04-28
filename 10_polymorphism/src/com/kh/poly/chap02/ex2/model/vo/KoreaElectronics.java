package com.kh.poly.chap02.ex2.model.vo;

public interface KoreaElectronics {
	
	public static final int VOLT = 220;
		//공유 영역에 저장되는 변형않되는 값
	
	//인터페이스는 묵시적으로 public abstract 메소드다.
	public abstract void powerOn();
	void powerOff();

}
