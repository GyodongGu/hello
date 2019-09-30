package api;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		
		byte[] bytes1 = str.getBytes();								//utf-8로 설정해놨기 때문에 한글 한글자당 3byte씩 차지한다.
		System.out.println("bytes1.length: " + bytes1.length);		//그래서 15로 나타난다.
		String str1 = new String(bytes1);
		System.out.println("bytes1->String:" + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");					//euc-kr은 한글 한글자당 2byte식 차지한다.
			System.out.println("bytes2.length: " + bytes2.length);	//그래서 10으로 나타난다.
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("byte2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
