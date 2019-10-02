package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50);	//key값이 중복이면 맨 마지막에 들어온 값이 남아 있는다.(중복제거 후)
		
		System.out.println("Entry 갯수 : " + map.size());
		
		System.out.println("방법1"); // key를 set에 담아서 iterator로 가져옴.
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		
		while(iter.hasNext()) {	//가져올 객체가 있으면 true, 없으면 false
			String key = iter.next();	//객체를 가져온다.
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
	}
}
