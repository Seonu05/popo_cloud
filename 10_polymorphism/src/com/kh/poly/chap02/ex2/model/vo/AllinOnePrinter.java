package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner{
		//�������̽��� ���� ����� �����ϴ�!
		//Ŭ�������� ��ӿ����� ���� ���
		
		//�߻� Ŭ����
		// -> �߻� �޼ҵ尡 0�� �̻� �����ϴ� Ŭ����
	
	private String brand;
	private String pName;
	
	public AllinOnePrinter() {}	//�⺻ ������
	//�߻�Ŭ����, �������̽��� �̿��Ͽ� ��ü�� ���� �� �ִ�? no
	//why?  �̿ϼ� Ŭ�����δ� ��ü ���� �Ұ�

	//�߻� Ŭ������ �� �����ڸ� �ۼ�?
	//�ڽ� ��ü ���� �� ���п� �θ� �κ��� �����ϱ� ���ؼ� �ʿ�� ������
	//�̸� �̿��Ͽ� ���� �θ� ��ü�� ���� �� ����.
	
	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}
	
	
	
	
	
	
	
}
