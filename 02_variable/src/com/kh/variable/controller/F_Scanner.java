package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {
	
	//徹左球稽 戚硯聖 脊径閤焼
	//"ししし 還 発慎杯艦陥." 虞澗 庚切伸 莫殿稽 窒径馬奄
	
	public void scannerEx1() {
		
		Scanner sc = new Scanner(System.in);
		//Scanner澗 java拭辞 脊径聖 襲惟 拝 呪 赤亀系 薦因背爽澗 適掘什稽
		//java.util 鳶徹走拭 匂敗 鞠嬢赤陥.

		System.out.print("雁重税 戚硯精 巷譲脊艦猿?  ");
		
		String name = sc.nextLine();
		
		System.out.println(name + "還 発慎杯艦陥.");
		
		
	}
	
	
	//戚硯, 蟹戚, 失紺聖 脊径閤焼
	//"ししし還精 しし室,し切, 徹 ししし.しcm脊艦陥." 莫殿稽 窒径馬奄
	public void scannerEx2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// -->import 姥庚聖 拙失馬走 省壱
		// 陥献 適掘什研 条嬢神澗 号狛
		
		System.out.print("戚硯: ");
		
		String name = sc.nextLine();
		//sc.nextLine() : 徹左球稽 脊径吉 廃 匝税 庚切伸聖 (脊径獄遁拭辞) 石嬢身.
		// + 殖斗(\n)猿走 匂敗背辞 石嬢身
		
		System.out.print("蟹戚 : ");
		int age = sc.nextInt();
		// sc.nextInt() : 徹左球稽 脊径吉 舛呪 葵聖 石嬢身. 100 0
		// + 脊径 獄遁拭辞 因拷, 句嬢床奄, 匝郊嘩 戚穿 猿走幻 石嬢身.
		
		sc.nextLine(); //脊径獄遁拭 赤澗 匝郊嘩 庚切(\n) 薦暗 遂亀
		
		System.out.print("失紺(害/食) : ");
		char gender = sc.nextLine().charAt(0);
		// char(index) : 庚切伸拭辞 index腰�� 庚切 馬蟹研 嗣製
		// + index澗 0採斗 獣拙
		
		
		System.out.print("徹(cm) : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("%s還精 %d室 %c切 %.1f cm 脊艦陥.\n", name, age, gender, height);
	}

}























