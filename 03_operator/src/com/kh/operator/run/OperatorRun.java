package com.kh.operator.run;

import com.kh.operator.service.A_LogicalNegation;
import com.kh.operator.service.B_InDecrement;
import com.kh.operator.service.C_Arithmetic;
import com.kh.operator.service.D_Comparison;
import com.kh.operator.service.E_Logic;
import com.kh.operator.service.F_Compound;
import com.kh.operator.service.G_Triple;


public class OperatorRun {
	
	public static void main (String[] args) {
		// �� ���� ������
		A_LogicalNegation al = new A_LogicalNegation();
			
			//al.example();
		
		// ���� ������	
		B_InDecrement bi = new B_InDecrement();
		
			//bi.example();
			//bi.example2();
			//bi.example3();
		
		// ��� ������
		C_Arithmetic ca = new C_Arithmetic();	
		
			//ca.example1();
		
		// �� ������
		D_Comparison dc = new D_Comparison();
		
			//dc.example1();
		
		// �� ������
		E_Logic el = new E_Logic();
		
			//el.example1();
			//el.example2();
			//el.example3();
			//el.example4();
		F_Compound fc = new F_Compound();
			//fc.example1();
		
		G_Triple gt = new G_Triple();
			//gt.example1();
			//gt.example2();
		
	} 

}
