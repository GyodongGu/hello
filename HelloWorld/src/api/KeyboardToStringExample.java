package api;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		
		byte[] bytes = new byte[100];						//byte배열공간 100칸을 생성
		
		System.out.println("입력 : ");	
		int readByteNo = System.in.read(bytes);				//system.in.read()메소드는 주어진 byte배열에 값을 저장하고 읽은 바이트 수를 리턴한다.
		
		String str = new String(bytes, 0, readByteNo-2);	//-2 하는 이유는 캐리지리턴(\r)과 라인피드(\n)을 빼기위함
		System.out.println(str);
		System.out.println(bytes[5]);						//캐리지 리턴\r값
		System.out.println(bytes[6]);						//라인피드\n값
	}

}
