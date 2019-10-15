package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaExample5 {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin((p,q)->{
			return (p>=q ? p : q);
		});
		System.out.println("최대값 : " + max);
		
		int min = maxOrMin((p,q)->{
			return (p<=q ? p : q);
		});
		System.out.println("최소값 : " + min);
	}
}
