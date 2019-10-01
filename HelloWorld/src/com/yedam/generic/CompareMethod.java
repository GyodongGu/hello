package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple",10);
		Pair<String, Integer> p2 = new Pair<>("apple",10);
		
		boolean result = Util.compare(p1, p2);
		
		if(result) {
			System.out.println("두 객체가 논리적으로 동일함.");
		}else {
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		}
//---------------------------------------------------------------------------------------		
		Pair<String, String> s1 = new Pair<>("user1","orange");
		Pair<String, String> s2 = new Pair<>("user1","orange");
		
		boolean result1 = Util.compare(s1, s2);
		if(result1) {
			System.out.println("두 객체가 논리적으로 동일함.");
		}else {
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		}	
//--------------------------------------------------------------------------------------		
		Pair<String, Integer> i1 = new Pair<>("orange",10);
		Pair<String, Integer> i2 = new Pair<>("apple",10);
		
		boolean result2 = Util.valueCompare(i1, i2);
		if(result2) {
			System.out.println("두 객체의 value값이 동일함.");
		}else {
			System.out.println("두 객체의 value값이 동일하지 않음.");
		}
		
//--------------------------------------------------------------------------------------		
		Pair<String, String> k1 = new Pair<>("orange", "good");
		Pair<String, String> k2 = new Pair<>("apple", "good");
		
		boolean result3 = Util.valueCompare(k1, k2);
		if(result3) {
			System.out.println("두 객체의 value값이 동일함.");
		}else {
			System.out.println("두 객체의 value값이 동일하지 않음.");
		}
		
		
		Integer intV1 = Util.compare(20, 20);
		System.out.println(intV1);
	}
}
