package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book bk1 = new Book();
		System.out.println(bk1.selectBook());
		Book bk2 = new Book("�ڹ��� ����",30000,0.2,"���ü�");
		System.out.println(bk2.selectBook());
		
		System.out.println("=============================");
		System.out.println("���� �� ��� Ȯ��");
		
		bk1.SetTitle("C���");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("ȫ�浿");
		
		System.out.println(bk1.selectBook());
		System.out.println("=============================");
		
		System.out.println("������ = " + bk1.getTitle());
		System.out.println("���ε� ���� = " + (int)(bk1.getPrice() -
							(bk1.getPrice()*bk1.getDiscountRate()))+ "��");
		System.out.println("������ = " + bk2.getTitle());		
		System.out.println("���ε� ���� = " + (int)(bk2.getPrice() -
				(bk2.getPrice()*bk2.getDiscountRate()))+ "��");
	
		
		
	}

}

/*public Book() {}

public Book(String title, int price, double discountRate,
		String author) {
	this.title = title;
	this.price = price;
	this.discountRate = discountRate;
	this.author = author;
	
}*/
