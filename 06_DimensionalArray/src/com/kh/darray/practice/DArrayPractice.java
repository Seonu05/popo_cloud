package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {
	
	
	public void practice1() {
		
		String [][] arr = new String [3][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = "("+ i + ", " + j +")";
				System.out.print(arr[i][j]+" ");
				
				//System.out.print("("+ i + ", " + j +")");
			}System.out.println();
			
		}
	}
	
	public void practice2() {
		
		int [][] arr = new int [4][4];
		int index = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				
				
				arr[i][j] = index++;
				
				System.out.printf("%3d", index);
				
			}System.out.println();
			
		}
		
	}
	
	
	public void practice3() {
		
		int [][] arr = new int[4][4];
		
		int index1 = 16;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = index1--;
				
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}
		
		
	}
	
	
	
	
	public void practice4() {
		
		int [][] arr = new int[4][4];
		int sum = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				
			sum += arr[i][j];
			
			}
			
		}
		
	}
	public void practice5() {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("행 크기 : ");
	       int num1 = sc.nextInt();
	       sc.nextLine();
	       
	       if (num1 > 0 && num1 < 11) {
	          System.out.print("열 크기 : ");
	          int num2 = sc.nextInt();
	          sc.nextLine();
	          if (num2 > 0 && num2 < 11) {
	             char[][] arr = new char[num1][num2];
	             for(int i=0;i<arr.length;i++) {
	                
	                for(int j=0; j<arr[i].length;j++) {
	                   arr[i][j]  = (char)((Math.random()*91+1));
	                   if (arr[i][j] < 65) {
	                      j--;
	                      
	                   }else {
	                      System.out.print(arr[i][j]+" ");
	                   }
	                   
	                   
	                }System.out.println();
	             }
	             
	          }else {
	             System.out.println("1~10사이의 정수를 입력해주세요.");
	             return;
	          }
	            
	       } else {
	          System.out.println("1~10사이의 정수를 입력해주세요.");
	          return;
	       }
	          
	       
	    }
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "!", "더", "!!"}};
											
				for(int i=0; i<strArr.length; i++) {
					
					for(int j=0; j<strArr[i].length; j++) {
						
						System.out.print(strArr[j][i]+" ");
					}
					
				}							
											
											
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("행의 크기 :");
		int a = sc.nextInt();
		sc.nextLine();
		
		int [][] arr = new int[a][];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( i + "열의 크기 : ");
			
			int b = sc.nextInt();
			sc.nextLine();
			
			arr[i] = new int [b];
		}
		
		//출력
		char num = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				
				//대입과 동시에 출력
				System.out.print((char)arr[i][j] + " ");
			}
				System.out.println();
		}
	
	
		
		/*arr[]
				
				arr[0] = new int[2];
				arr[1] = new int[4];
				arr[2] = new int[3]; */
					
		
		
	}

}















