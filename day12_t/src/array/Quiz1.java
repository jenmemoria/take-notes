package array;

import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		
		int[] arr = { 9, 54, 23, 72, 99, 85, 31, 16, 49, 62 };
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요
		int oddCount = 0, evenCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.printf("1) 홀수의 개수 : %d, 짝수의 개수 : %d\n\n", oddCount, evenCount);
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		int oddSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddSum += arr[i];
			}
		}
		System.out.println("2) 홀수의 합계 : " + oddSum + "\n");
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		// [] : 배열 생성시에는 길이를 지정한다 (리터럴 및 변수 사용 가능)
		//      생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다
		
		// 원본배열의 길이는 10이고, 새로운 배열의 길이는 4다
		// 길이가 서로 다르기 때문에, 원본배열의 index와 신규배열의 index를 따로 관리해야 한다
		int[] arr2 = new int[evenCount];
		
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//				System.out.println(i + ", " + j);
				arr2[j] = arr[i];
				j++;
			}
		}
		System.out.println("3) arr2 : " + Arrays.toString(arr2) + "\n");
		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3를 만들어서 출력하세요
		int[] arr3 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int k = arr.length - 1 - i;
//			System.out.printf("%d, %d\n", i, k);
			arr3[k] = arr[i];
		}
		System.out.println("4) arr3 : " + Arrays.toString(arr3) + "\n");
		
		// 5) arr를 내림차순 정렬한 후 다시 출력하세요
		for(int i = 0; i < arr.length; i++) {
			for(int k = i + 1; k < arr.length; k++) {
				if(arr[i] < arr[k]) {	// 오름차순과 내림차순은 크기 비교에 의해서 결정된다
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
		}
		System.out.println("5) arr : " + Arrays.toString(arr));
		
	}
}












