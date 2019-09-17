package hello;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[][] = new int[2][];
		intAry[0] = new int[3];
		intAry[1] = new int[4];
		
		int a= 8;
		int sum = 0;
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {
				intAry[i][j] = a++;
				sum += intAry[i][j];
			}
			System.out.println(sum);
			sum =0;
		}
	}
}
