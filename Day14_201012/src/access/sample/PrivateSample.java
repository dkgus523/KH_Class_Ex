package access.sample;

//java파일에는 public클래스가 반드시 존재해야 한다.
//소스파일 이름과 동일한 클래스가 반드시 존재!!! + public
public class PrivateSample {
	//클래스 : 멤버필드, 생성자, 메소드
	private int num; //선언된 클래스 안에서만 접근 가능
	
	public int getNum() { //값 호출을 위한 Getter
		return num;
	}
	
	public void setNum(int num) { //값 대입을 위한 Setter
		this.num = num;
	}	
}
