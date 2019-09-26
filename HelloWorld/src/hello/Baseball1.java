package hello;

import java.util.Scanner;


class create{
	int Strike;
	int ball;
	
	create(){
		
	}
	
	void Random(int[] x) {
		boolean k = true;
		while(k) {
			
			for(int i =0; i<x.length; i++) {
				x[i] = (int)(Math.random()*9)+1;
			}
			if(x[0] == x[1] || x[0] == x[2] || x[1] == x[2]) {
				k = true;
			}else if(x[0] != x[1] && x[0] != x[2] && x[1] != x[2]){
				k = false;
			}
		}
		
	}
	
	void Count(int[]x, int[]y) {
		this.Strike = 0;
		this.ball = 0;
		for(int i =0; i<x.length; i++) {
			if(x[i] == y[i]) {
				Strike++;
			}
			for(int j= 0; j<y.length; j++) {
				if(x[i] != y[i] && x[i] == y[j]) {
					ball++;
				}
			}
		}
		
	}
	
	
}

public class Baseball1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[3];
		
		create random = new create();
		random.Random(ary);
		
//		boolean k = true;
//		while(k) {
//			
//			for(int i =0; i<ary.length; i++) {
//				ary[i] = ((int)(Math.random()*10)+1)%10;
//			}
//			if(ary[0] == ary[1] || ary[0] == ary[2] || ary[1] == ary[2]) {
//				k = true;
//			}else if(ary[0] != ary[1] && ary[0] != ary[2] && ary[1] != ary[2]){
//				k = false;
//			}
//		}
		
		int[] ans = new int[3];
		
		boolean x = true;
		
		while(x) {
			for(int i =0; i<ans.length; i++) {
				System.out.println((i+1)+"구 :");
				ans[i] = sc.nextInt();
			}
//			int Strike = 0;
//			int ball = 0;
//			for(int i =0; i<ary.length; i++) {
//				if(ary[i] == ans[i]) {
//					Strike++;
//				}
//				for(int j= 0; j<ans.length; j++) {
//					if(ary[i] != ans[i] && ary[i] == ans[j]) {
//						ball++;
//					}
//				}
//			}
			random.Count(ary, ans);
			
			if(random.Strike == 3) {
				System.out.println("3Strike out");
				break;
			}
			
			for(int i =0; i<=ans.length; i++) {
				if(i == random.Strike) {
					System.out.println(i + "strike");
				}
				if(i== random.ball) {
					System.out.println(i + "ball");
				}
			}
				
		}
	}
}
