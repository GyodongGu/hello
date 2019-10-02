package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Member> memSet = new HashSet<>();
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("홍길동", 30));
		System.out.println("memSet의 객체 수 : "+memSet.size());
		
		for(Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}
		
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World"); // 중복허용x

		System.out.println("객체수 : " + set.size());

		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()){	//hasNext() 는 가져올 객체가 있으면 true, 없으면 false
			System.out.println(iter.next());	//next()는 컬렉션에서 하나의 객체를 가져온다. 가져간 객체는 iter에서 없어진다.
		}
		System.out.println("반복자 소진 후 ");
		
		while(iter.hasNext()){	//위에서 반복자(iter)가 전부 소진되었기에 출력되는 것이 없다. hasNext() = false
			System.out.println(iter.next());	
		}
		
		set.remove("Nice");
		
		
		System.out.println("확장for문");
		for(String str : set) {	//반복자에서 값을 가져오는 것이 아니라 set에서 값을 불러 오는 것이다.
			System.out.println(str);
		}
		
		
	}
}
