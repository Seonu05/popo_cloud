package com.kh.inherit.chpa02.model.vo;

public class Book extends Object {
	//extends Object 미작성시
	//JVM에 의해서 컴파일 단계에서 자동 추가
	
	//Object 클래스는 자바 클래스들 중 최상위 부모 클래스
	// --> 모든 클래스는 Object의 후손 클래스이다.
	
	private String title;
	private String author;
	private int price;
	
	//기본 생성자
	public Book() {}
	
	//매개변수가 있는 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	//getter / setter
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	//모든 필드 정보를 반환
	//public String selectField() {}
	
	
	
	/*@Override 어노테이션
	 *  - 어노테이션(Annotation) :
	 *  	컴파일러에게 특정 코드나 상황을 알려주는 역할
	 *  
	 *  - @Overfide :
	 *  	컴파일러에게 해당 부모 메소드가 
	 *  	자식에 의해서 오버라이딩(재정의)이 되었다라는 것을 알려줌.
	 *  
	 *  + 과거에는 @Override표시가 필수였으나
	 *  	현재는 없어도 가능은 함.
	 *  	대신 개발자들 간의 코드 공유시 가독성을 위하여
	 *  	필히 작성하는게 좋음.
	 *  
	 * */
	
	@Override
	public String toString() {
		//Object.toString() 용도
		//생성된 객체의 필드 정보를 모두 출력하는 메소드를
		//따로 만들지말고 이를 오버라이딩해서 사용하도록
		//Java에서 제공하는 메소드
		
		return title + " / " + author + " / " + price;
	
	}

	
		
	//Object.equals() 오버라이딩
	//객체가 같은지를 판별
	//오버라이딩 전 equals() : 두 객체의 시작주소가 같은지를 판별
	//오버라이딩 후 equals() : 객체가 가지고 있는 필드 값이 같은지 판별
		
		
//	@Override
//	public boolean equals(Object obj) {
//		
//		//1. 객체의 시작 주소가 같은지 비교
//		//		시작주소가 같다 == true(같은 객체)
//		if(this == obj) {
//			return true;
//		}
//	
//		//2. 전달받은 주소가 null인지 판별
//		// null의 의미 : 참조하는 곳이 없다.
//		// 전달받은 주소가 null인 경우 비교 가치가 없음. 무조건 false
//		if(obj == null) {
//			return false;
//		}	
//		
//		//클래스 형변환
//		//obj는 Object를 참조하는 변수 였지만
//		//이를 Book을 참조하는 변수로 형변환
//		Book other = (Book)obj;
//		
//		//3. 두 객체간의 필드 값 비교 시작
//		if(this.title != null && other.title !=null) {
//			//두 Book객체에 모두 title이 있는 경우
//			
//		if(!this.title.equals(other.title)) {
//			//title이 같지 않다면 다른 것 --> false
//			return false;
//		}
//		
//		}else {//둘 중 하나 또는 둘다 null인 경우는 다른것 --> false
//			return false;
//			
//		}
//		
//		if(this.author !=null &&other.author != null) {
//		if(!this.author.equals(other.author)) {
//			//저자 비교
//			return false;
//		}
//	
//		}else {
//			return false;
//		}
//		
//		//가격 비교
//		if(this.price != other.price) {
//			//price는 기본 자료형 이기 때문에
//			//주소비교가 필요없고, 값 자체만 비교하면 됨.
//			return false;
//		}
//		
//		//여기까지 코드가 진행디었다는 것을 필드값이 모두 같다는 뜻
//		//이를 "동등객체다"라고 표현한다.
//		return true;
//		
//		//동등  vs 동일
//		//동등 : 서로 다른객체지만 값이 같다
//		//동일 : 완전 같은 객체
//		
//	}	
	
	// hashCode()
	// 동일 객체 검사, 검색속도 향상
	// HashSet, HashMap, HashTable 등등에서 사용됨
	
	@Override
	public int hashCode() {
		//중복되지않는 hashCode를 만드는 데 왜 31을 사용하는가?
		// -->31은 홀수이면서 적당히 큰 소수이고
		//	  비트연산이 굉장히 빠르게 진행 될수 있는 수이고
		//	  이 수를 통해 만들어지는 hashCode의 충돌이 가장 적어서
		//	  전통적으로 사용되고 있음.
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}	
	
	
	public String informationTransfer() {
					//정보 전달
		return "내부에 작성된 정보를 읽는 사람에게 전달한다.";
	}
	
	
	
}















