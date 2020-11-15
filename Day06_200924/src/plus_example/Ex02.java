package plus_example;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap =0;
		int i = 1;
		
		while(i<=20) {
			if(i%2 != 0)
				hap += i;
			i++;
		}
		System.out.printf("1에서 20까지의 수 중 홀수 합계 : %d", hap);
	}

}
