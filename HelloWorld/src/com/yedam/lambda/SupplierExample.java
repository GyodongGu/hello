package com.yedam.lambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSup = () ->{
			int num = (int)(Math.random()*6+1);
			return num;
		};
		int result = intSup.getAsInt();
		System.out.println("결과값은 : " + result);
	}
	
}
