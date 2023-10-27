package array;

import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		int[] arr = {9, 54, 23, 72, 99, 85, 31, 16, 49, 62};
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요.
		int sum1 = 0;
		int sum2 = 0;
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				sum1 += 1;
				s1 = "홀수";
			}
			else {
				sum2 += 1;
				s2 = "짝수";
			}
		}System.out.printf("%s의 개수는 %d개, %s의 개수는 %d개\n", s1, sum1, s2, sum2);
		
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				sum1 += arr[i];
			}
		}
		System.out.printf("홀수의 합 : %d\n", sum1);
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2를 저장하고 출력하세요.
		// [] : 배열 생성시에는 길이를 지정한다 (리터럴 및 변수 사용 가능)
		//		생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다.
		
		// 원본 배열의 길이는 10이고, 새로운 배열의 길이는 4다.
		// 길이가 서로 다르기 때문에, 원본 배열의 index와 신규배열의 index를 따로 관리해야 한다.
		
		int[] arr2 = new int[sum2];
		int k = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr2[k] = arr[i];
				k++;
			}
			
		}System.out.println(Arrays.toString(arr2));
		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3을 만들어서 출력하세요.
		int[] arr3 = new int[arr.length];
//		k = 0;
//		for(int i = arr.length - 1; i >= 0; i--) {
//			arr3[k] = arr[i];
////			System.out.print(arr3[k] + " ");
//			k++;
//		}
		for(int i = 0; i < arr.length; i++) {
			int q = arr.length - 1 -i;
			arr3[q] = arr[i];
		}
		System.out.println("4) arr3 : " + Arrays.toString(arr3));
//		System.out.print(Arrays.toString(arr3));
//		System.out.println();
		// 5) arr를 내림차순 정렬한 후 다시 출력하세요.
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {	// 오름차순과 내림차순은 크기 비교에 의해서 결정된다.
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
			
		}System.out.println(Arrays.toString(arr));
		
	}
}
