package com.kh.poly.chap02.ex1.model.vo;

public abstract class Bird implements Animal {
	public static final int BIRD_LEG = 2;
	private String wingType;

	//�⺻ ������
	public Bird() {}
	//�����ڸ� ���� �� ������ �ش� �����ڷ� ���� ��ü������ ���� ����.
	//�ڽ��� super()�����ڸ� ����ؾ� �ǹǷ�!
	
	//�� �� �ְų�, ���� ���ų�, ���ƴ� �ٴϳ� ����� �ٸ��ų� �� ���ִ�.
	// --> ��ü������ �ʰ� ��Ȯ���� --> �߻� �޼ҵ�� ǥ��
	public abstract String fly();
	
	public String flappingWing() {
		return "������ �ĴڰŸ�";
	}

	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}


	


}
