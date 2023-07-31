package com.ktdsuniversity.edu.enumtest;

public class EnumTest {
//
//	private static final int ADD = 1;
//	private static final int SUB = 2;
//	private static final int MUL = 3;
//	private static final int DIV = 4;
//	
	public void calc(CalcType type, int num1, int num2) {
		System.out.println(type);
		
		
		if(type == CalcType.ADD) {
			System.out.println(num1 + num2);
		}
		else if (type == CalcType.SUB) {
			System.out.println(num1 - num2);
		}
		else if (type == CalcType.MUL) {
			System.out.println(num1 * num2);
		}
		else if (type == CalcType.DIV) {
			System.out.println(num1 / num2);
		}
	}
	
	public static void main(String[] args) {
		EnumTest et = new EnumTest();
		et.calc(CalcType.ADD, 10, 20);
		et.calc(CalcType.SUB, 30, 20);
		et.calc(CalcType.MUL, 50, 20);
		et.calc(CalcType.DIV, 60, 20);
		
	}

}
