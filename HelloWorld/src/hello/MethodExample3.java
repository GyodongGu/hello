package hello;

public class MethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = {1,2,3,4,5};
		int sum =0;
		for(int i =0; i< intAry.length; i++) {
			sum += intAry[i];
			}
		
		int intAry2[] = {1,2,3,4,5,6};
		sum = sumArray(intAry2);
		System.out.println(sum);
//		printStar2(4,5);
//		printStar3(6);
//		
//		diamond2(9,9);
		
		int [] ary = showArray(1,2,3,4,5);
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		for(int a : ary) {
			System.out.println(a);
		}
		
	}
	
	
	public static int[] showArray1(int... arg) { //매개변수를 유동적으로 변경하기 쉽다.
		int[] aAry = new int[arg.length];
		for(int i= 0; i<aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}
	

	public static int[] showArray(int a, int b, int c, int d, int e) {
		int [] ary = {a,b,c,d,e};
		return ary;
	}
	
	
	
	
	
	public static void printStar(int a, String str) {
		for(int i = 0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	
	public static void printStar2(int a, int b) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printStar3(int a) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void diamond(int a, int b) {
		for(int i=0; i<a; i++) {
			for(int j=1; j<b; j++) {
				if(j<=(b/2)+i && j>=(b/2)-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=a; i++) {
			for(int j=1; j<b-i; j++) {
				if(i>=j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	
	
	public static void diamond2(int a, int b) {
		for(int i=0; i<a; i++) {
			if(i<=(a/2)) {
				for(int j=0; j<b; j++) {
					if(j<=(b/2+i) && j>=(b/2-i)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else {
				for(int j=0; j<b-(i-b/2); j++) {
					if(i>j+b/2) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}	
		}
	}
	
	public static int sumArray(int[] ary) {
		int sum =0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	

}
