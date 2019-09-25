package com.yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r*r;
	}
	
}

class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
}

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.areaCircle(10);

		Calculator cal = new Calculator();
		cal.areaCircle(10);
		
		
		System.out.println(com.areaCircle(10));
		System.out.println(cal.areaCircle(10));
	}

}
