package api;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	//arr1 전체를 arr2로 복사

		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);	//(arr1배열에서 1번째 값부터 3번째값까지를 복사(3번째값은 제외)

		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);	//arr1의 0번째에서 arr4의 0번째부터 복사를한다.
		for(int i =0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
		
	}
}
