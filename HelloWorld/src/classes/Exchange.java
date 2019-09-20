package classes;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("금액을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		
		int money = sc.nextInt();
		int[] x = {50000, 10000, 5000, 1000, 500, 100, 50 , 10, 1};	//지폐종류
		int[] y = new int[9];	//지폐 갯수
		
		for(int i=0; i<x.length; i++) {
			y[i] = money/x[i];
			money = money%x[i];
		}
		
		for(int i=0; i<y.length; i++) {
			
			System.out.println(x[i]+"원 :"+y[i]+"장");
		}
		
		

	}

}
