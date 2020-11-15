interface Show{
	public void show();
	public void count();
}
class Test implements Show{
	public void show() {
		System.out.println("show 실행");
	}
	public void count() {
		System.out.println("count 실행");
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show(); //Test에 있는 show 실행
		t.count(); //Test에 있는 count 실행
		
		Show s = new Show() {
			public void show() {
				System.out.println("무명 클래스 show 실행");
			}
			public void count() {
				System.out.println("실행");
			}
		};
		s.show(); //
		s.count();

	}

}
