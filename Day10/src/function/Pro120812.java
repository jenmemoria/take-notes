package function;

public class Pro120812 {
	class Solution {
		public int solution(int[] array) {
			// 원소의 최대값을 먼저 구하고, 그 길이만큼의 배열을 생성하여 횟수체크에 사용한다.
			// 이과정을 생략하고 싶다면 길이 1001의 배열을 생성하면 된다.
			// +1이 들어가는 이유는 0부터 시작한는 index의 특성상 계산이 번거로워져서

			// 최빈값을 answer에 담아서 반환하면 된다.
			// array에서 가장 많이 등장한 값을 찾아야 함.
			// array의 각 값의 등장한 횟수를 체크.
			// 횟수에서 최대값을 찾아서, 횟수가 아닌 가장 맣이 등장한 값을 answer에 담는다.
			// 만약, 횟수에서 최대값이 중복된다면 answer에 -1을 담는다.

			// int[] counts = new int[1001]; // 횟수를 체크하기 위한 배열
		int answer = 0; // 최빈값
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		int[] counts = new int[max + 1];
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int answer1 = s.solution(new int[] {1, 2, 3, 3, 3, 4});
		int answer2 = s.solution(new int[] {1, 1, 2, 2});
		int answer3 = s.solution(new int[])
	}
}
