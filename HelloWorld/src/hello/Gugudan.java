package hello;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = 0;
		
		for(int i=1; i<10; i++) {
			for(int j= 1; j<10; j++) {
				res = i*j;
				System.out.print(j + " * " + i + " = " + res+"     ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int i = 1;
		while(i<10) {
			int j = 1;
			while(j<10) {
				System.out.print(j + " * " + i + " = " + (j*i)+"     ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
