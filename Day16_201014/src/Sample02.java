interface Show{
	public void show();
	public void count();
}
class Test implements Show{
	public void show() {
		System.out.println("show ����");
	}
	public void count() {
		System.out.println("count ����");
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show(); //Test�� �ִ� show ����
		t.count(); //Test�� �ִ� count ����
		
		Show s = new Show() {
			public void show() {
				System.out.println("���� Ŭ���� show ����");
			}
			public void count() {
				System.out.println("����");
			}
		};
		s.show(); //
		s.count();

	}

}
