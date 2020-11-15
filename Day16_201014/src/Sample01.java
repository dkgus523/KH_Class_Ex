
public class Sample01 {
	int x = 10;
	
	public Sample01() {
		//기본 생성자
	}
	void show() {
		System.out.println("show()");
	}
	public static void main(String[] args) {
		Sample01 s = new Sample01() {
			public void show() {
				System.out.println("까꿍");
			}
		};
		s.show();
		
		Sample02 s2 = new Sample02();
		s2.show();

	}

}
