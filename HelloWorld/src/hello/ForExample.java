package hello;

public class ForExample {

	public static void main(String[] args) {
		int x = 5;
		for(int i = 0; i<=5; i++) {
			int res = x * 2*i; 
			if(i==0)
				System.out.println(x + " * " + 1 + " = " +x);
			else
				System.out.println(x + " * " + (2*i) + " = " +res);		
		}		
	}

}
