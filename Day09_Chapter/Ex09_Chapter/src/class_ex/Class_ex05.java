package class_ex;
class Calculation{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
public class Class_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.sum(10,20,30);
		cal.sum(10, 20);
	}

}
