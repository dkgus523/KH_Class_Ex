package practice;
class Hello{
	public Hello() {
		System.out.println("Hello()생성자 완료");
	}
	public void helloPrint() {
		System.out.println("Hello Java!");
	}
	@Override
	public String toString() {
		return "Hello 클래스";
	}
	
	
}
//toString 클래스를 설명해주는 아이

public class HelloJava {

	public static void main(String[] args) {
		Hello h = new Hello(); 
		h.helloPrint(); 
		System.out.println(h.toString()); //주소값출력
		//toString 이 있어도 없어도 같은 값이 나옴
	}

}
