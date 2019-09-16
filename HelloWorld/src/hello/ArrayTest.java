package hello;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int intAry[] = new int[5];
		Scanner ary = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<intAry.length; i++) {
			System.out.println("배열의 입력 값을 입력하시오");
			intAry[i] = ary.nextInt();
		}
		
		for(int i=0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		for(int i =0; i<intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("합계"+sum);
	}
}