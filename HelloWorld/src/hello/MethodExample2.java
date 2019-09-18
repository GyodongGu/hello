package hello;

import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			menu();

			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				scores = new int[cou(studentNum)];
				
			}else if(selectNo == 2) {
				scores = insert(scores);

			}else if(selectNo == 3) {
				list(scores);
				
			}else if(selectNo == 4) {
				analysis(scores);

			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	
	
	public static int cou(int x) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수> ");
		x = scanner.nextInt();
		return x;
		
	}

	public static void menu() {
		
		System.out.println("--------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("--------------------------------");
		System.out.print("선택> ");
		
	}
	
	public static int[] insert(int x[]) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<x.length; i++) {
			System.out.print("scores[" + i + "]>");
			x[i] = scanner.nextInt();
		}
		return x;
	}
	
	public static void list(int x[]) {
		for(int i = 0; i<x.length; i++) {
			System.out.println("scores[" + i + "]>" + x[i]);
		}	
		
	}
	public static void analysis(int x[]) {
		int maxValue = 0;
		int sum =0;
		for(int i=0; i<x.length; i++) {
			maxValue = (maxValue > x[i] ? maxValue : x[i]);
			sum +=x[i];
		}
		System.out.println("최고 점수 : " + maxValue);
		System.out.println("평균점수 : " + (double)(sum/x.length));
		
	}
	
	
	
}
