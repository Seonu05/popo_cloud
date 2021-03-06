package com.kh.poly.chap01.practice.model.service;

import com.kh.poly.chap01.practice.vo.Book;
import com.kh.poly.chap01.practice.vo.ComicBook;
import com.kh.poly.chap01.practice.vo.CookBook;
import com.kh.poly.chap01.practice.vo.Member;

public class LibraryService {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	//기본 생성자
	public LibraryService() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new ComicBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new ComicBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
		
	public Book[] selectAll() {
			return bList;
		}
	
	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열을 bList에 크기만큼 생성
		Book[] searchList = new Book[bList.length];
		
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면
		// HINT : Java 8 API문서에서 java.lang.String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기  HINT : count 이용
		int count = 0;
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
			}
		}
		// 해당 검색결과의 도서목록 주소 값 리턴
		return searchList;
	} 
	
	public int rentBook(int index) {
		
		int result = 0;
		// 전달 받은 index의 bList 객체가 만화책을 참조하고 있고
		if(bList[index] instanceof ComicBook) {
			// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
			if(	((ComicBook)bList[index]).getAccessAge() > mem.getAge() ) {
				// result를 1로 초기화   나이제한으로 대여 불가
				result = 1;
			}
			
		}
		
		
		// 전달 받은 index의 bList 객체가 요리책을 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “유”일 경우
		// 회원의 couponCount 1 증가 처리 후
		// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰 발급
		else if(bList[index] instanceof CookBook) {
			
			if(	((CookBook)bList[index]).isCoupon()	){
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		
		
		// result 값 리턴
		return 0;
	}
	
}
