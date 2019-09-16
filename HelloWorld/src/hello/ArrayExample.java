package hello;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {10,20,30,40,50};
		String b[] = {"nice", "great", "good"};
		
		System.out.println(a[2]);
		System.out.println(b[2]);
		
		for(int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		for(int i =0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		int aAry[] = new int[5];
		int plus = 0;
		int sum=0;

		for(int i = 0; i<aAry.length; i++) {
			plus +=10;
			aAry[i] = plus;
			System.out.println(aAry[i]);
			sum += aAry[i];
		}
		System.out.println(sum);
	}

}
