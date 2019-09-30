package com.yedam.exception;

public class ThrowsExample {
	public static void main(String[] args) {
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("findClass()호출후.");

	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = null;
		
		clazz = Class.forName("java.lang.String2");	//String2가 있는지 없는지 체크 있으면 clazz리턴, 없으면 classNotfoundException
													//e.printStackTrace();는 에러메시지내역을 보여준다.
			
		System.out.println(clazz.getName());
		
	}
	
}
