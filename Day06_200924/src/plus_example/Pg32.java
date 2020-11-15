package plus_example;

public class Pg32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hap = 0;
		for(int i = 22; i<=76; i++) {
			if(i%2==0) {
				hap += i;
			}
		}
		System.out.printf("그 합 -> %d", hap);
	}

}
