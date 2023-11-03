package day16;

public class Quiz1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total = kor + eng + math;
	float avg = (float)total / 3;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	Student(){}
	
	
	String info() {
		int total = kor + eng + math;
		float avg = (float)total / 3;
		String form = name +  "," + ban + ","+ no + "," + kor + "," + eng + "," + math + "," + total + "," + avg;
		
//		System.out.printf(form, name, ban, no, kor, eng, math, total, avg); // 메인함수에 println이 있어서 이렇게 할 필요 ㄴㄴ
		
		return form;
	}
	
	public int getTotal(){
		int total = kor + eng + math;
		return total;
		
	}
	
	public float getAverage() {
		int total = kor + eng + math;
//		float avg = String.format(name, null)
//		float avg = Float.valueOf(total)/3;
//		float avg = (float)total / 3;
		
		
		float avg = Float.valueOf(String.format("%.1f", total / 3.0));
		return avg;
	}
	
}
