package objectclass;

public class Sample05 {

	public static void main(String[] args) {
		String a = "your name";
		String b = "point";
		String c = "your name";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.compareTo(b));  //���ڰ� �ٸ��� ���/����
		System.out.println(a.compareTo(c));  //���ڰ� ������ 0
		

	}

}
