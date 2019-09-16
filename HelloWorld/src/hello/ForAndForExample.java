package hello;

public class ForAndForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =2; i<10; i++) {
			System.out.println(i + "단");
			for(int j= 1; j<10; j++) {
				System.out.println(i + "*" + j + " = " + (i*j));
			}		
		}
		
		System.out.println("---------------------");
		
		int i = 1;
		while(i<10) {
			System.out.println(i + "단");
			int j= 1;
			while(j<10) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++;
		}
		

	}

}
