package com.kh.inherit.chpa01.model.vo;

//Computer Ŭ������ product Ŭ������ ���
//��� Ű���� : extends(Ȯ���ϴ�)
//�θ��� ��� + �ڽ��� ��� -> �θ𺸴� ������ Ȯ���
public class Computer extends Product {
	
	//�ʵ�
	private String cpu;
	private int ram;
	//private String pName;
	//private int price;
	
	//�⺻������
	public Computer() {
		super();
		//super() �⺻ �����ڴ� 
		//�ۼ����� �ʾƵ�
		//JVM�� ���ؼ� ������ �ܰ迡�� �ڵ�����
		//������ ���� ���ʿ� �߰���.
	}

	//�Ű������� �ִ� ������
	//�ڵ����� ����
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
	
	//�ʵ� ���� ���

	public String selectField() {
		return cpu + " / " + ram + " / " ;
				//+ pName + " / " + price;
	}
}
