package collection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		// Map : 배열 및 List의 index 대신 key라는 값을 이용하여 value에 접근하는 구조
		// key와 value가 1:1 맵핑되어 저장되는 구조
		// key는 중복될 수 없다.
		// value는 중복을 허용한다.
		// key를 알면 value에 접근할 수 있으나, value를 이용하여 역으로 key를 알아낼 수는 없다.
		// key -> value (O), value -> key(X), 단방향 맵핑구조
		
		// Map은 Key의 자료형과 value의 자료형을 모두 지정해야 한다.
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		// Linked를 넣으면 인덱스가 생김.
		// Hash : 값을 보장하기 위해서 일정하게 쪼개서 
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("coconut", "코코넛");
		map.put("durian", "두리안");
		map.put("orange", "델몬트");
		
		System.out.println(map);
		
		System.out.println("map.get(apple) : " + map.get("apple"));
		System.out.println("map.get(사과) : " + map.get("사과"));
		System.out.println();
		
		Set<String> keySet = map.keySet();		// key는 중복될 수 없어서 Set으로 받으면 된다.
		for(String key : keySet) {
			String value = map.get(key);		// key를 알면 value를 구할 수 있다.
			System.out.println(key + " : " + value);
			
		}
		System.out.println();
		
		// 다수의 데이터 중에서 원하는 값을 찾아내는 코드이지만 반복문을 사용하지 않는다.
		// 굳이 반복문을 쓰지 않아도, 인덱스를 기억하지 않아도 키워드만 알고 있으면 바로바로 찾을 수 있다.
		// 양방향으로 매핑이 되는 것이 아니라 1:1로 단방향만 매핑이 가능.
		
		
		Scanner sc = new Scanner(System.in);
		String key;
		String value;
		
		System.out.print("맵에서 찾을 key 입력 : ");
		key = sc.next();
		value = map.get(key);
		System.out.println(key + " : " + value);
		
		sc.close();
		
		// 일반적으로 Map의 구현체를 사용할 때는 HashMap을 사용하지만
		// 순번이 필요하다면 LinkedHashMap을 사용할 수 있고
		// key와 value의 제네릭 타입이 모두 String이며 파일에 저장해서 불러올 경우는
		// Properties 타입을 사용할 수도 있다.
		
		Properties pro = new Properties();
		pro.put("charAt", "인덱스를 전달하여 글자를 char 형태로 반환한다.");
		pro.put("equals", "다른 문자열과 비교하여 내용 일치여부를 boolean으로 반환한다.");
		pro.put("contains", "특정 패턴의 내용이 포함되는지를 boolean으로 반환한다.");
		pro.put("substring", "인덱스를 지정하여 특정 범위의 문자열을 잘라낸다.");
		pro.put("split", "특정 글자를 기준으로 각 내용을 분리하여 String[] 로 변환한다.");
		pro.put("replace", "특정 패턴 글자를 찾아서, 새로운 내용으로 교체한다.");
		
		for(Object k : pro.keySet()) {
			Object v = pro.get(k);
			System.out.println(k + " : " + v);
		}
		
		System.out.println();
		
		File f = new File("pro.txt");
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		pro.store(osw,"String class Function");
		
		// Map의 또 다른 사용용도
		// 여러 값을 묶어서 표현하거나 전달해야 하는데
		// 그에 맞는 클래스를 작성하기 번거롱루 때 (사용빈도가 낮아서)
		// 클래스를 작성하는 대신, Map에 저장하여 한 번에 전달하는 용도로도 사용한다.
		
	}
}
