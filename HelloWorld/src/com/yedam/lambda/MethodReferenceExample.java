package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator{
	static int staticSum(int x, int y) {
		return x+y;
	}
	int instanceSum(int x, int y) {
		return x+y;
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = 0;
		int result2 = 0;
		
		Calculator.staticSum(a, b);
		
		Calculator cal = new Calculator();
		cal.instanceSum(a, b);
		
		IntBinaryOperator oper;
//		oper = new IntBinaryOperator() {
//
//			@Override
//			public int applyAsInt(int left, int right) {
//				// TODO Auto-generated method stub
//				return Calculator.staticSum(left, right);
//			}
//			
//		};
		
//		oper = (x,y)->{
//			return Calculator.staticSum(x, y);
//		};
		
		oper = Calculator :: staticSum;
		
		result = oper.applyAsInt(a, b);
		System.out.println("정적메소드참조 : "+result);
		
//-----------------------------------------------------------------------		
		
		IntBinaryOperator oper2;
		
//		oper2 = (x,y)->{
//			return cal.instanceSum(x, y);
//		};
		
		oper2 = cal::instanceSum;
		
		result2 = oper2.applyAsInt(a, b);
		System.out.println("인스턴스메소드참조 : " + result2);
		
	}
}
