package hello;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][] = new int[5][5];
		
		int y = 0;
		
		for(int i =0; i<x.length; i++) {
			for(int j = 0; j<x[i].length; j++) {
				y += 1;
				x[i][j] =y;
				System.out.print(x[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
			
		for(int m = x.length-1; m>=0; m--) {
			for(int n =0; n<x[m].length; n++) {
				System.out.print(x[n][m] + "|");
			}
			System.out.println();
		}
		
	}

}
