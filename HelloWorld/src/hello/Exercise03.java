package hello;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = 0;
		for(int i = 1; i<100; i++) {
			if(i%3 == 0) {
				res += i;	
			}
		}
		System.out.println(res);
	}
}
