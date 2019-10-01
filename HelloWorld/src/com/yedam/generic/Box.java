package com.yedam.generic;

public class Box<T> {
	private T obj;				//타입 최상위 클래스

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
