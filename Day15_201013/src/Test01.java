

class Scanner{
	public Scanner() {
		System.out.println("���� ���� Scanner");
	}
}
public class Test01 {
//���⿡ Ű����� ���� 2���� �Է¹޾�, �� ���� ���� ���ϴ� ���α׷��� �ۼ����ּ���.
//���� �˻� �ʼ� (���� ��Ű������ ���� �̸� Ŭ���� ����ϱ�)
	Scanner scan = new Scanner();
	java.util.Scanner input = new java.util.Scanner(System.in);
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	
	System.out.println("�� ���� ���� : " + (num1 + num2));

}
