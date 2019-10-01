package com.yedam.check4;

public class Util {
	
	
	public static <N,A> int getValue(Pair<N,A> p, String s) {
		
		boolean b = p.getName().equals(s);
		if(b) {
			return (int) p.getAge();
		}
		return 0;
	}
	
	
}
