package chap03;

public class Ex29 {

	static int recursiveSum(int n) {
		if (n == 1) { // n�� 1�̸�, �׳� 1�� ��ȯ��.
			return 1;
		}

		return n + recursiveSum(n - 1);
		// n�� 1�� �ƴϸ�, n�� 1���� (n-1)������ �հ� ���� ���� ��ȯ��.
	}

	public static void main(String[] args) {

		int res = recursiveSum(10);
		System.out.println(res);
	}

}
