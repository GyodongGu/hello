package com.yedam.check4;

public class Util {
	
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getName()== k) {
			return p.getAge();
		}
		else {
			return null;
		}
	}

}
