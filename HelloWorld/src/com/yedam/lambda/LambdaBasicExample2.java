package com.yedam.lambda;

interface MyInterfaceNoArgs {
	public void method1();
}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithReturn {
	public int method3(int a, int b);
}

public class LambdaBasicExample2 {
	public static void main(String[] args) {

		MyInterfaceNoArgs fina = () -> {
			System.out.println("no arguments expression.");
		};
		fina.method1();

		MyInterfaceWithArgs fiwa = a ->{
			System.out.println("result : " + (a*5));
		};
		fiwa.method2(5);
		
		MyInterfaceWithReturn fiwr = (a,b)->{
			return a+b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값은 : "+result);
	}
}
