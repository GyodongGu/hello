package api;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));			//대소문자가 다르기 때문에 false출력
		
		String lowerStr1 = str1.toLowerCase();			//모두 소문자로 바꾼 뒤에 리턴
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));//둘다 소문자이기 때문에 같다 true출력
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 구분을 하지 않고 비교하기 때문에 같다 true출력
	}

}
