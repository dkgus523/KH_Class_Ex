package Project05;

public class Student {
	private String name;  //이름
	private int number;  //번호
	
	//생성자 메소드
	
	//이름만 초기화하면서 새로운 Student 객체를 생성한다
	public Student(String NewName) {
		setName(NewName);
	}
	
	//번호만 초기화하면서 새로운 Student 객체를 생성한다.
	public Student(int NewNumber) {
		setNumber(NewNumber);
	}
	
	//이름과 번호를 초기화하면서 새로운 Student 객체를 생성한다,
	public Student(String NewName, int NewNumber) {
		setName(NewName);
		setNumber(NewNumber);
	}
	
	//접근자 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	

}
