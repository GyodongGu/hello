package api;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);	//substring : 0번째부터 6개 문자열 출력
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	//substring : 7번째 부터 문자열 출력
		System.out.println(secondNum);
	}

}
