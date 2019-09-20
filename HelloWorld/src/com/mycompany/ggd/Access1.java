package com.mycompany.ggd;


class Access2{
	public Access2(){
		System.out.println("Access2");
	}
}


public class Access1 {
	
	public int field1;
	int field2;
	private int field3;
	
	public void method1() {			//다른 패키지에서도 사용 가능
		this.field3 = 10;
		System.out.println("method1");
	}
	void method2() {				// 이 패키지에서 사용 가능
		System.out.println(field3);
		System.out.println("method2");
	}
	private void method3() {		//이 클래스 안에서만 사용 가능
		System.out.println("method3");
	}
	
	public Access1() {
		System.out.println("Access1");
	}
}