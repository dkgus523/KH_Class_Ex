package practice;
class Calculation2{
	void sum(double a, double b) {
		System.out.println("2개 정수의 합 : " + (a + b));
	}
	void sum(int a, int b) {
		System.out.println("2개 실수의 합 : " + (a + b));
	}
}
public class Pro04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation2 obj = new Calculation2();
		obj.sum(1.12, 2.25);
		obj.sum(10, 20);
	}

}
