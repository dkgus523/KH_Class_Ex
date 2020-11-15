package ex01_method;

public class Ex02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (isPrimeNumber(i))
				System.out.println(i);
		}
	}

	public static boolean isPrimeNumber(int num) {
	 	//소수판별하는 방법
		//소수 : 1 2 3 5 7 11 13 17
		if (num == 1) return false;
		for(int a=2; a<=Math.sqrt(num); a++) {
			if(num % a == 0) return false;
		}
		return true;
	}
}

