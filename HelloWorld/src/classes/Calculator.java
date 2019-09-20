package classes;

import java.util.Scanner;

public class Calculator {
	
	
	static double plus(double x, double y) {
		return x+y;
	}

	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int a, int b) {
		int sum = plus(a,b);
		double res = (double)sum/2;
		return res;
	}
	
	void execute(int a, int b) {
		
		double result = avg(a,b);
		println("result: " + result);
	}
	
	
	void println(String str) {
		System.out.println(str);
	}
	
}
