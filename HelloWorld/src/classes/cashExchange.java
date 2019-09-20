package classes;

import java.util.Scanner;

public class cashExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("금액을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int x = money/50000; //5만원권 갯수
		int xd = money%50000; // 5만원권 제외한 돈
		int y = (xd)/10000; //1만원권 갯수
		int yd = xd%10000; //1만원권 제외한 돈
		int z = (yd)/5000; //5천원권 갯수
		int zd = yd%5000;  //5천원권 제외한 돈
		int w = (zd)/1000; //천원권 갯수
		int wd = zd%1000;  //천원권 제외한 돈
		int q = (wd)/500; //500원 갯수
		int qd = wd%500; //500원 제외한 돈
		int e = qd/100; //100원 갯수
		int ed = qd%100; // 100원 제외한 돈
		int r = ed/50; //50원 갯수
		int rd = ed%50; //50원 제외한 돈
		int t = rd/10; //10원 갯수
		int td = rd%10; //1원 갯수

		
		
		System.out.println("5만원 : "+x+"장");
		System.out.println("1만원 : "+y+"장");
		System.out.println("5천원 : "+z+"장");
		System.out.println("1천원 : "+w+"장");
		System.out.println("500원 : "+q+"개");
		System.out.println("100원 : "+e+"개");
		System.out.println("50원 : "+r+"개");
		System.out.println("10원 : "+t+"개");
		System.out.println("1원 : "+td+"개");
		

	}

}
