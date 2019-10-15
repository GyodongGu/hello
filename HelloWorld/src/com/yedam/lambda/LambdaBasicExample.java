package com.yedam.lambda;
@FunctionalInterface			//functional interface 선언해주고 이것이 람다식 표현이 가능하다는 것을 나타낸다.
interface MyInterface {
	int print(int a, int b);// 추상 메소드
}

class MyInterfaceClass implements MyInterface { // 인터페이스에서 만들어 놓은 추상 메소드를 구현해주어야 한다.

	@Override
	public int print(int a, int b) { // <-구현
		// TODO Auto-generated method stub
		return a + b;
	}

}

public class LambdaBasicExample {				//인터페이스중에 구현해야하느 메소드가 하나만 있는 것을 functional interface라고 한다.
	public static void main(String[] args) {	//functional interface가 람다 표현식의 대상이 된다.
//		MyInterface mi = new MyInterfaceClass(); // 인터페이스에서 만들어 놓은 추상메소드를 이용해서 clss에 메소드를 구현하고 그것을사용
//													// 하기 위해서 인스턴스를 생성
//		int result = mi.print(4, 9);
//		System.out.println("결과값은  : " + result);
		int result = 0;

		MyInterface mi = (a,  b) ->{						//매개값을 이용해서 mi를 정의
				return a * b;
			};

		result = mi.print(3, 5);
		System.out.println("결과값은  : " + result);
	
		mi = new MyInterface() {

			@Override
			public int print(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
		};
		result = mi.print(7, 4);
		System.out.println("결과값은  : " + result);
		
		MyInterface mm = (a,b) ->{
			return a/b;
		};
		System.out.println("mm.print(8,4) --> 결과값은 : " + mm.print(8, 4));
		
		

	}
}
