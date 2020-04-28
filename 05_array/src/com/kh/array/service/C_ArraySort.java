package com.kh.array.service;

import java.util.Arrays;

public class C_ArraySort {
	
	
	public void example1(){
	// 두 변수의 값을 서로 바꾸기
			
		int a = 10;
		int b = 20;
		
		//두변수의 값을 바꾸기 위한 임시 변수 선언
		int tmp;
		
		tmp = a; // a:10, b:20, tmp:10
		a = b; //a:20, b:20, tmp:10
		b= tmp; //a:20, b:10, tmp:10
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
	
	public void example2() {
		//배열 내에서 인덱스 값 바꾸기
		int[] arr = {2, 1, 3};
		
		int tmp = arr[0];
		
		arr[0] = arr[1];
		arr[1] = tmp;

		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void example3() {
		int[] arr = {2, 5, 4, 1, 3};
		//오름차순으로 정렬
		
		//삽입 정렬은 두 번째 값(1번 인덱스) 부터 시작
		for(int i=1; i<arr.length; i++) {
			// i에 의해서 선택된 인덱스 : 비교 주체
			
			for(int j=0; j<i; j++) {
				//i와 비교되기 위한 j 인덱스 : 비교 대상

				//오름차순 정렬을 위한 비교 수행
				if(arr[i] < arr[j]) {
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public void example4() {
		//선택 정렬(selection sort)
		//비교되지않은 배열 전체를 탐색하여
		//최소값을 찾아
		//배열의 앞쪽 부터 채워나가는 정렬 방식
		// 데이터의 양이 적을 경우 좋은 성능을 보이는 정렬 방식
		//100개 이상 성능 저하가 급격하게 일어남
		
		int[] arr = {2,1,4,5,3};
		int min = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			//선택 정렬은 배열의 길이 -1바퀴째에서 정렬이 완료됨
			
			min = i;
			for(int j = i+1; j<arr.length; j++) {
				//앞쪽을 제외하고 뒤쪽에서 가장 작은 수를 찾음
						
				
				if(arr[j]<arr[min]) { 
					min = j;
					
				}
				
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1 + "바퀴" + Arrays.toString(arr));
			
		}
		
		
	}
	
	
}

















