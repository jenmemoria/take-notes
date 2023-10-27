package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// 문자열을 char 배열로 변환 후 선택정렬을 수행하고
		// 다시 문자열로 바꿔서 출력하기
		
		String str = "qwetyuiopasdfghjklzxcvbnm";
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					char tmp = arr[i];		// 좌변과 우변의 자료형은 같아야 한다.
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr);
		
		
	}
}
