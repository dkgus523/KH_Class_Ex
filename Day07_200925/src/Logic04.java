import java.util.Scanner;

public class Logic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] data = new int[5];
		
		int max = 0;
		int min = 0;
		System.out.println("정수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			data[i] = scanner.nextInt();
			if(i == 0) {
				min = data[i];
			}
			if(data[i] > max) {
				max = data[i];
			} 
			if(data[i] < min){
				min = data[i];
			}
			
		}
		System.out.println("최대값은 " + max + " 최소값은 " + min);
	
	}

}
