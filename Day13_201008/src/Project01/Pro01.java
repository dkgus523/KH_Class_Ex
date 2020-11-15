package Project01;
//두 가지로 나누기를 구한다.
public class Pro01 {
	//정수형 나누기를 한다.
	static int divide(int a, int b) {
		return a / b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = divide(10,4);
		double result2 = divide(10.0, 4.0);
		
		System.out.println("정수형 나누기 결과: " + result1);
		System.out.println("정수형 나누기 결과: " + result1);
	}

}
