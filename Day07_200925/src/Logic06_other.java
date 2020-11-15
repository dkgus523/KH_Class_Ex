import java.util.Scanner;

public class Logic06_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int[] arr = new int[10];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			//System.out.printf("[%d] 1에서 100사이의 숫자를 입력하세요", i + 1); //
			num = input.nextInt();
			if(num != 0)
				arr[(num-1)/10]++;
			else
				arr[0]++;
		}
		System.out.println("범위 체크상태");
		for (int i=0; i<10; i++) {    
			System.out.printf("%d ~ %d : ",(i*10)+1, (i+1)*10);  //출력하는 범위
			for (int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
