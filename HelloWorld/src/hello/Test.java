package hello;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int a = 1;
		int b = 10;
		for(int i =a; i<=b; i++) {
			
			if(i%2 ==1) {
			sum += i;
			System.out.println(i);
			}
		}
		System.out.println(a + "~"+ b +"까지 홀수의 합 = "+sum);
		
	}

}
