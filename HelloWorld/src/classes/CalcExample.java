package classes;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calculator.plus(23.5, 23.1);		//static(고정된 값을 사용할 때 사용 하는 것이 좋다. 예- pi값이나 지구 반지름 등..)
											
		Calculator cal = new Calculator();
		
		System.out.println("첫번째 값을 입력하시요 :");
		int a = sc.nextInt();
		System.out.println("두번째 값을 입력하시오 :");
		int b = sc.nextInt();
		cal.execute(a,b);

	}

}
