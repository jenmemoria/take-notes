package collection;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Test2> list = new ArrayList<>();
		list.add(new Test2("iu930516", "이지은"));
		list.add(new Test2("yellow", "홍진호"));
		list.add(new Test2("danbi", "나단비"));
		
		for (int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s\n", ob.getId(), ob.getName());
		}
		System.out.println();
		
		// id 오름차순으로 정렬하기	여기서 compareTo : o1 - o2
		list.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
		
		// 정렬하는 거 이용하면 별점순 정렬 , 이런 것들 다 활용할 수 있다.
		
		// 이름 기준 내림차순 정렬
		list.sort((o2, o1) -> o1.getName().compareTo(o2.getName()));

		// 출력코드
		for (int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s\n", ob.getId(), ob.getName());
		}
		System.out.println();
		
	}
}
