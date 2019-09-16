package hello;

public class TestMux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = 0;
		
		for(int i=1; i<10; i++) {
			for(int j= 1; j<10; j++) {
				res = i*j;
				System.out.print(j + " * " + i + " = " + res+"       ");
			}
			System.out.println();
		}

	}

}
