package hello;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int y[] = {1, 2, 3, 4, 5};
		
		AryAvg(y);
		
		int sum2 = Sum(y);
		System.out.println("y배열의 합은 = "+sum2);
		
		good(183, 85);
		
		if(Kilo(183, 85) == 0) {
			System.out.println("적정체중");
		}else if(Kilo(183, 85)<0) {
			System.out.println("저체중");
		}else {
			System.out.println("과체중");
		}

	}
	
	public static void good(double k, double m) {
		
		double x = (k-100) * 0.9;//적정 몸무게
		if(x<m) {
			System.out.println("과체중");
		}else if(x==m) {
			System.out.println("적정체중");
		}else {
			System.out.println("저체중");
		}

	}
	
	public static double Kilo(double k, double m) {
		
		double x = (k-100) * 0.9;//적정 몸무게
		
		return m-x;
	}
	
	
	public static void AryAvg(int x[]) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println((double)sum/x.length);
	}
	
	public static int Sum(int x[]) {
		int sum =0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	

}
