package hello;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int ary[] = new int[3];
		
		for(int i =0; i<ary.length; i++) {
			ary[i] = (int)(Math.random()*10) +1;	
		}
		
		int ans[] = new int[3];
		boolean x= true;
		
		while(x) {
			for(int i=0; i<ans.length; i++) {
				System.out.println((i+1)+"구");
				ans[i] = sc.nextInt(); 
			}
			int count = 0;
			for(int i=0; i<ary.length; i++) {
				
				for(int j=0; j<ans.length; j++) {
					if(ary[i] ==ans[j])
						count++;	
				}
			}
			if(count ==0) {
				System.out.println("ball");						
			}else if(count ==1) {
				System.out.println("1strike");
			}else if(count ==2) {
				System.out.println("2strike");
			}else if(count ==3) {
				System.out.println("3strike out");
				x=false;
			}
				
		}
		
	}

}
