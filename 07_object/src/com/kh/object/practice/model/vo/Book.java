package com.kh.object.practice.model.vo;

public class Book {
	
	private String title; //������
	private int price; //����
	private double discountRate; //������
	private String author; //���ڸ�

	//������
	
	//�⺻������
	public Book() {}
	
	//�Ű����� �ִ� ������
	public Book(String title, int price, double discountRate,
				String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//�޼ҵ�
	//��� �ʵ� ���� ��ȯ
	public String selectBook() {
		return title + " / " + price + " / " + discountRate +
				" / " + author;
	}
	
	//getter /setter
	
	//������
	public String getTitle() {
		return title;
	}
	public void SetTitle(String title) {
		this.title = title;
	}
	
	//����
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//������
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	//���ڸ�
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}









