package hello;

import java.util.Scanner;

public class GetMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = 0;
		int x[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println("입력값 :");
			x[i] = sc.nextInt();
		}
		for(int j=0; j<x.length; j++) {
			
			res = (res > x[j] ? res : x[j]);			
		}
		System.out.println("배열의 최대값은 : " +res);	

	}

}
