package hello;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력.");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력.");
		b = sc.nextInt();
		
		
		
		result = (a > b ? a: b);
		System.out.println("두수중에서 큰 수는 :" + result);
		

	}

}
