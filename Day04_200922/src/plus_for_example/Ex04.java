package plus_for_example;

public class Ex04 {

	public static void main(String[] args) {
		int hap=0;
		for(int i = 1; i<=20; i++) {
			if(i % 2 == 0) {
				hap += i;		
			}
		}
		System.out.printf("1에서 20까지 수 중의 짝수 합계 : %d", hap);
	}

}
