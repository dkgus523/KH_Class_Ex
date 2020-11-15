package Project01;

public class Pro03 {
	private String name;
	private int age;
	
	// 생성자 메소드 - 이름만 초기화한다
	public Pro03(String newName) {
		this(newName, 0);
		System.out.println("----");
	}
	// 생성자 메소드 - 나이만 초기화한다
	public Pro03(int newAge) {
		this(null, newAge);
	}
	// 생성자 메소드 - 이름과 나이를 초기화한다
	public Pro03(String newName, int newAge) {
		setName(newName);
		setAge(newAge);
	}
	// 사람의 이름을 반환한다.
	public String getName() {
		return name;
	}
	// 사람의 나이를 반환한다
	public int getAge() {
		return age;
	}
	// 현 Pro03 객체의 정보에 대한 문자열을 반환한다,
	public String toString() {
		return( name + "\t\t" + age);
	}
	// 사람의 이름을 주어진 값으로 변경한다
	public void setName(String NewName) {
		name = NewName;
	}
	// 사람의 나이를 주어진 값으로 변경한다.
	public void setAge(int NewAge) {
		age = NewAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
