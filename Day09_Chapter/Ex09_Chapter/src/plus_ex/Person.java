package plus_ex;

public class Person {
	public String lastName;  //성을 나타내는 변수
	public String firstName;  //이름을 나타내는 변수
	
	//접근자 메소드 - 성을 반환한다.
	public String getLastName() {
		return lastName;
	}
	
	//접근자 메소드 - 이름을 반환한다.
	public String getFirstName() {
		return firstName;
	}
	
	//접근자 메소드 - 성과 이름 안에 포함된 문자들의 총 수를 반환한다.
	public int getLength() {
		return lastName.length() + firstName.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
