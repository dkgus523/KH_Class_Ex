import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); //ArrayList Ŭ���� ��ü ����
		
		al.add("gemin");
		al.add("johnharu");
		al.add(new Integer(10));
		System.out.println("ArrayList ��ü : " + al);
		
		int length = al.size();
		System.out.println("ArrayList ���� :" + length);
		
		for(int i=0; i<length; i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.get(2));
	}

}
