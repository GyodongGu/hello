package com.yedam.generic;

public class Person {
	private String name;				//필드

	public Person(String name) {		//생성자
		super();
		this.name = name;
	}

	@Override
	public String toString() {			//tostring
		return name;
	}
	
	
	
}
