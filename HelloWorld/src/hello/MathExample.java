package hello;

public class MathExample {
	public static void main(String[] args) {
		
		
		int a = (int) (Math.random()*100);
		a = a/10;
		
		switch(a) {
		
		case 9:
			System.out.println(a + "	A Grade");
			break;
		case 8:
			System.out.println(a + "	B Grade");
			break;
		case 7:
			System.out.println(a + "	C Grade");
			break;
		case 6:
			System.out.println(a + "	D Grade");
			break;
		default:
			System.out.println(a + "	F Grade");
		}
		
//		System.out.println(a);
//		
//		if(a>=90) {
//			System.out.println(a + "	A Grade");
//		}
//		else if(a>=80) {
//			System.out.println(a + "	B Grade");
//		}
//		else if(a>=70) {
//			System.out.println(a + "	C Grade");
//		}
//		else if(a>=60) {
//			System.out.println(a + "	D Grade");
//		}
//		else {
//			System.out.println(a + "	F Grade");
//		}
		
		
		
	}

}
