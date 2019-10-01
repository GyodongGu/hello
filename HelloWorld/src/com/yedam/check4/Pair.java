package com.yedam.check4;

public class Pair<N,A> {
	private N name;
	private A age;
	
	public Pair(N name, A age) {
		super();
		this.name = name;
		this.age = age;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	public A getAge() {
		return age;
	}

	public void setAge(A age) {
		this.age = age;
	}
	
	

	
	
}
