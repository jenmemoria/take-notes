package reference;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		boolean flag1 = n1 - n2 > 0;
		
		String s1 = "Hello", s2 = "World";
		boolean flag2 = s1.compareTo(s2) > 0;
		
		System.out.println("n1이 n2보다 크다 : " + flag1);
		System.out.println("s1이 s2보다 크다 : " + flag2);
		
		System.out.println("n1이 n2보다 작다 : " + !flag1);
		System.out.println("s1이 s2보다 작다 : " + !flag2);
		
		// String 클래스의 compareTo(String anotherString)은
		// 두 개의 문자열을 비교하여 글자의 코드값을 비교하여 정수로 반환한다.
		
		Integer[] arr = {50, 30, 20, 40, 10};
		String[] arr2 = {"원빈", "현빈", "우빈", "준빈", "다빈"};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
//		sortIntArray(arr);
//		sortStringArray(arr2);
		
		// 밑에 4줄처럼(주석제외) 정렬은 파이썬, 자바스크립트도 웬만한 정렬은 다 된다.
		// like 평점, 제품이름 등
		Arrays.sort(arr, (a, b) -> a - b);	// int는 클래스가 아니라서, Integer로 변경
		System.out.println(Arrays.toString(arr));
		
		// arr2 배열을 정렬한다. 내부요소를 a와 b라고 할 때, b와 a를 비교한 결과가 정수로 나타난다.
		// 정수가 0보다 크면 바꿔라.
		Arrays.sort(arr2, (a, b) -> a.compareTo(b));
		System.out.println(Arrays.toString(arr2));
		
	}
	// end of main()

	// 정수 배열을 오름차순으로 정렬하는 함수 sortIntArray(int[] arr)
	
	
	static void sortIntArray(Integer[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {	// if(arr[i] - arr[j] > 0){ 앞에 식으로 만들면 이 함수 쓸 때에만 유용
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;					
				}
			}
		}
	}
	// 문자열배열을 오름차순으로 정렬하는 함수 sortStringArray(String[] arr)
	
	static void sortStringArray(String[] arr2) {
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = i + 1; j < arr2.length; j++) {
				if(arr2[i].compareTo(arr2[j]) > 0) {	// if(arr[i] > arr[j]){
					String tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
	}
}
