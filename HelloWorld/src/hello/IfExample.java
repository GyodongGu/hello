package hello;

public class IfExample {
	public static void main(String[] args) {
		
		int b = 70;
		for(int i = 0; i<3; i++) {
			
			if(b>90) {
				System.out.println("A");
			}
			else if(b>80) {
				System.out.println("B");
			}
			else if(b>70) {
				System.out.println("C");
			}
			else {
				System.out.println("F");
			}
			b = b+10;
			
		}
		
		
	}

}
