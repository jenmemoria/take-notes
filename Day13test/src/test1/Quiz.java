package test1;

import java.util.Arrays;
import java.util.Random;

// 선택정렬 함수를 만들기
// 중복없는 랜덤 정수 6개로 구성된 배열을 반환하는 함수를 만들기 (1 ~ 45 사이의 랜덤정수)
// 한 줄당 6개, 총 5줄의 정수를 출력하는 프로그램을 작성
// 리스트 및 컬렉션 사용 금지
// 하나의 배열 당 중복된 정수가 사용되면 안 됨.

public class Quiz {
	
	static int[] by() {		// 배열 만드는 함수
		int[] arr = new int[6];
		Random ran = new Random();
		int num = 0;
		while(num != 6) {
			arr[num] = ran.nextInt(45)+1;
			num++;
			for(int i = 0; i < num; i++) {		// 중복이면 앞으로 미는 거.
				for(int j = i + 1; j < num; j++) {
					if(arr[i] == arr[j]) {
						num--;
					}
				}
			}
		}
		return arr;
//		for(int i = 0; i < arr.length; i++) {	// 중복이면 앞으로 미는 거
//			arr[i] = ran.nextInt(45)+1;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//				}
//			}
//
//		
//	}
	
}
	
	static void selectionSort(int[] arr) {	// 선택정렬
			
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	static void show(int[] arr) {	// 출력
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1) {
				System.out.printf("%2d, ", arr[i]);
			}
			else {
				System.out.printf("%2d" , arr[i]);
			}
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("응시자 : 왕제은\n");
		int[] arr = null;
//		for(int i = 1; i<= 30; i++) {
//			for(int j = 0; j <= 5; j++) {
//				int num_temp = ran.nextInt(45)+1;
//			}
//		}
		
//		for(int i = 0; i < arr.length; i++) {	// 중복이면 앞으로 미는 거
//			arr[i] = ran.nextInt(45)+1;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		for(int i = 0; i < 5; i++) {
			arr = by();
			selectionSort(arr);
			show(arr);
		}
	
		
//		System.out.println(Arrays.toString(arr));
//		for(int i = 0; i < arr.length; i++) {
//			if(i > 0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		
	}
}
