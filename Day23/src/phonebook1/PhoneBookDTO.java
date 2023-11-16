package phonebook1;

public class PhoneBookDTO {
	
	private String name;		// 이름
	private String pnum;		// 전화번호
	private int age;			// 나이
	private String favorite;	// 즐겨찾기, (Y 혹은 N을만 넣을 수 있음)
	
	// 출력 서식을 toString으로 오버라이딩
	@Override
	public String toString() {
		String data = String.format("%s : %s, %d, %s",
				name,
				pnum,
				age,
				favorite.equals("Y") ? "★" : "☆");
		return data;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
}
