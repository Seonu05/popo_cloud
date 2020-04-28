package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	
	public void example1() {
	//문제 : int형 배열 arr을 선언하여 5칸 할당 후
	//각 인덱스에 값을 입력받아 저장.
	//단, 중복되는 값은 저장하지않음.
	//(중복값 입력 시 "중복값 존재" 출력)	
		
	int[] arr = new int[5];
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<arr.length;i++) {
		System.out.print(i + "번째 인덱스 값 : ");
		arr[i] = sc.nextInt();
		sc.nextLine();
		
		for(int j=0; j<i; j++) {
			if(arr[i] == arr[j]) {
				System.out.println("중복값 존재");
				i--; //바깥쪽 for문 현재 바퀴 유지
				break;
			}
		}
		
		
		
	}System.out.println(Arrays.toString(arr));
	
}
	
	public void example2() {
		//로또 번호 생성기
		//1~45까지의 번호가 존재 --> 난수(math.random())
		//6개 랜덤 추출 --> int형 배열 6칸 할당
		//중복X --> 중복 제거
		//오름차순 정렬
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			//1~45 난수를 발생시켜 대입
			double ran = Math.random()*45 +1;
			//0 <= ran < 1
			//0.xxx <= ran < 45.xxx			
			//1.xxx <= ran < 46.xxx
			//1 <= (int)ran < 46
			
			lotto[i] = (int)ran;
			
			//중복 검사
			for(int j=0; j<i; j++){
				if(lotto[i] == lotto[j]) {
					//같은 배열이 존재하는 경우
					i--;
					break;
					
				}
				
			}
			
		}
		
		/*for(int i = 1; i<lotto.length; i++) {
			
			for(int j = 0; j<i; j++) {
				
				
				if(lotto[i]<lotto[j]) {
					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;	
				}
			}
		}*/
		
		Arrays.sort(lotto);
		
		System.out.println("이게 1등 번호 : " + Arrays.toString(lotto));
	}
	
	
}














