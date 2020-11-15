package book;

public class Sample09 {

	public static void main(String[] args) {
		int value = 124;
		String result = (value % 2 == 0)? "Â¦¼ö": "È¦¼ö";
		
		if(value % 2 == 0) {
			result = "Â¦¼ö";
		} else {
			result = "È¦¼ö";
		}
		System.out.println( value + "´Â " + result + "ÀÌ´Ù.");
	}

}
