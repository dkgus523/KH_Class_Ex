class Test01{
	int sum(int n, int m) {
		int i = 10;
		System.out.println("sum �޼ҵ� ����");
		return n + m;
	}
	void main() {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
public class Ah01_1 {
	
	public static void main(String[] args) {
		
		Test01 t = new Test01() ;
		t.main();
	}
}

