package book;

public class Sample09 {

	public static void main(String[] args) {
		int value = 124;
		String result = (value % 2 == 0)? "¦��": "Ȧ��";
		
		if(value % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		System.out.println( value + "�� " + result + "�̴�.");
	}

}
