package plus_example;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		for(int i = 1; i<=50; i++) {
			int j = i*3;
			hap += j;		
		}
		System.out.printf("합계 : %d", hap);
	}

}
