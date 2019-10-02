package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		
		
		for(int i =0; i<1000000; i++) {
//			list1.add(0, String.valueOf(i));	//첫번째 위치에 값을 넣는다.
			list1.add(String.valueOf(i));		//마지막 위치에 값을 넣는다.(성능우수)
		}
		
		endTime = System.nanoTime();
		System.out.println("arrayList의 걸린시간은 : "+ (endTime-startTime));
		
		
		
		startTime = System.nanoTime();
		
		
		for(int i =0; i<1000000; i++) {
//			list2.add(0, String.valueOf(i));	//첫뻔째 위치에 값을 넣는다.(성능우수)
			list2.add(String.valueOf(i));		//마지막 위치에 값을 넣는다.
		}
		
		endTime = System.nanoTime();
		System.out.println("Linkedlist의 걸린시간은 : "+ (endTime-startTime));
		
		
	}
}
