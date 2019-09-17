package hello;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][] = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<x.length; i++) {
			for(int j= 0; j<x[i].length; j++) {
				System.out.println("배열 값을 입력하시오");
				x[i][j] = sc.nextInt();
			}	
		}
		
		for(int i =0; i<x.length; i++) {
			for(int j= 0; j<x[i].length; j++) {
				
				System.out.print("|" + x[i][j] + "|");
			}
			System.out.println();
			System.out.println("-----------");
		}
		

	}

}
	