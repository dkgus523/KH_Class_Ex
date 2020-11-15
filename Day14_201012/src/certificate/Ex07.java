package certificate;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j, k, l, result;
		j = 10;
		k = 20;
		l = 30;
		result = j < k ? k++ : --l;
		System.out.printf("%d %d %d\n", result, k, l);
	}

}
