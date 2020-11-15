package plus_example;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap =0;
		for(int i=1; i<=20; i++) {
			if(i%2 != 0)
				hap += i;
		}
		System.out.printf("1에서 20까지 수 중 홀수의 합계 : %d", hap);
	}

}
