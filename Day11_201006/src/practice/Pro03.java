package practice;
class Calculation {
	void sum(int a, int b, int c) {
		System.out.println("3개 정수의 합 : " + (a + b + c));
	}
	void sum(int a, int b) {
		System.out.println("2개 정수의 합 : " + (a+b));
	}
}
public class Pro03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		obj.sum(10,20,30);
		obj.sum(10,20);
	}

}
