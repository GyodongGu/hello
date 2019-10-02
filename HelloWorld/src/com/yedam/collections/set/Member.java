package com.yedam.collections.set;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.name.equals(this.name) && mem.age == this.age;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {	//유니크한 값을 만들려고 hash값을 가지고 있다.
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.name.hashCode()+ age;
	}
	
	
	
	
}
