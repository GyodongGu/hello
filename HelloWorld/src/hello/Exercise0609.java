package hello;

import java.util.Scanner;

public class Exercise0609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		 
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}	
			}else if(selectNo == 3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}	
				
			}else if(selectNo == 4) {
				int maxValue = 0;
				int sum =0;
				
				for(int i=0; i<scores.length; i++) {
					maxValue = (maxValue > scores[i] ? maxValue : scores[i]);
				}
				for(int j=0; j<scores.length; j++) {
					sum +=scores[j];
				}
				System.out.println("최고 점수 : " + maxValue);
				System.out.println("평균점수 : " + (double)(sum/scores.length));
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
