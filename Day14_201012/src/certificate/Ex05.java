package certificate;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 15, b = 19;
		System.out.printf("%d\n", ~a);  //����
		System.out.printf("%d\n", a^b); //��� ������ 0, ���� �ٸ��� 1
		System.out.printf("%d\n", a&b); //�� ��Ʈ�� ��� 1�϶���, 1
		System.out.printf("%d\n", a|b); //�� ��Ʈ �� �� ��Ʈ�� 1�̸�, 1
	}

}
