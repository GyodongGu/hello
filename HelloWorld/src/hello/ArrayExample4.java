package hello;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str ={"hello","world","good", "morning"};
		String[] copystr = new String[str.length];
		
		
		
//		for(int i =0; i< str.length; i++) {
//			copystr[i] = str[i];
//		}
//		
//		for(String i : copystr) {
//			System.out.println(i);
//		}
		
		System.arraycopy(str, 0, copystr, 0, 2);
		for(String i : copystr) {
			System.out.println(i);
		}
		

	}

}
