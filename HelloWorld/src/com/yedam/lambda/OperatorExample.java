package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}

		return result;
	}

	public static void main(String[] args) {
		int result = 0;
		IntBinaryOperator oper = new IntBinaryOperator() {
			int result = 0;
			@Override
			public int applyAsInt(int a, int b) {
				result = (a >= b ? a : b);
				return result;
			}
			
		};
		
		int results = minOrMax(oper);
		System.out.println("max : " + results);
		
		int result2 = minOrMax((x,y)->{
			return (x<=y ? x : y);
		});
		
		System.out.println("min : " + result2);
	
	}
	
	

}
