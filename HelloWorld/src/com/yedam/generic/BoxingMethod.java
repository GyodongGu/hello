package com.yedam.generic;

public class BoxingMethod {
	public static void main(String[] args) {
		Integer intValue = new Integer(10);
		Box<Integer> box = Util.boxing(intValue);
		System.out.println(box.getObj());
		
		Box<String> strBox = Util.boxing("hello");
		System.out.println(strBox.getObj());
	}
}
