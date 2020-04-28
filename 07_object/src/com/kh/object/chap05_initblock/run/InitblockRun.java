package com.kh.object.chap05_initblock.run;

import com.kh.object.chap05_initblock.model.vo.Product;

public class InitblockRun {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		
		System.out.println(p1.selcetProduct());
	
		Product p2 = new Product();
		
		System.out.println(p2.selcetProduct());
	}

}
