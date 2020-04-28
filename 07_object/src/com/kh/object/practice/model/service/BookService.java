package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book bk1 = new Book();
		System.out.println(bk1.selectBook());
		Book bk2 = new Book("자바의 정석",30000,0.2,"남궁성");
		System.out.println(bk2.selectBook());
		
		System.out.println("=============================");
		System.out.println("수정 된 결과 확인");
		
		bk1.SetTitle("C언어");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("홍길동");
		
		System.out.println(bk1.selectBook());
		System.out.println("=============================");
		
		System.out.println("도서명 = " + bk1.getTitle());
		System.out.println("할인된 가격 = " + (int)(bk1.getPrice() -
							(bk1.getPrice()*bk1.getDiscountRate()))+ "원");
		System.out.println("도서명 = " + bk2.getTitle());		
		System.out.println("할인된 가격 = " + (int)(bk2.getPrice() -
				(bk2.getPrice()*bk2.getDiscountRate()))+ "원");
	
		
		
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
