package com.kh.object.practice.run;

import com.kh.object.practice.model.service.BookService;

public class PracticeRun {
	public static void main(String[] args) {
		// + main(args : String[]) : void
		// 클래스 다이어그램에서 밑줄은 static을 의미

		BookService bk = new BookService();
		bk.practice();
	}

}
