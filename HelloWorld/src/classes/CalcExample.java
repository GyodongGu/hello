package classes;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("첫번째 값을 입력하시요 :");
		int a = sc.nextInt();
		System.out.println("두번째 값을 입력하시오 :");
		int b = sc.nextInt();
		cal.execute(a,b);

	}

}
