package com.kh.object.chap05_initblock.model.vo;

public class Product {
	
	
	private String pName; //��ǰ��
						
	private int price; //����
	
	{//�ν��Ͻ� �ʱ�ȭ ���
		// �ν��Ͻ� ����(�������)��
		// ��ü ������ ���� �ѹ��� �ʱ�ȭ �ϴ� �뵵
		pName = "������ z�ø�";
		price = 1200000;
	
	}
	
	public String selcetProduct() {
		return pName + " / " + price; //string+int = string		
	}
	
	//public String seleProduct() {}
	
	//getter / setter

}
