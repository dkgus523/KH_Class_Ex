package objectclass;

public class Sample06 {

	public static void main(String[] args) {
		String a = new String("   c#");
		String b = new String(",c++");
		
		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#"));   // ���ڿ��� ���� ����
		
		a = a.concat(b);  // ���ڿ� ����
		System.out.println(a);
		
		a = a.trim();    // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		
		a = a.replace("C#", "Java");  // ���ڿ� ��ġ
		System.out.println(a);

	}

}
