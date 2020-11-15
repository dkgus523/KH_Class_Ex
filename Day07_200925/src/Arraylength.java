import java.util.Scanner;

public class Arraylength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("5개의 정수를 입력하세요 >>");
		 
		 for(int i=0; i<intArray.length; i++)
		 { 
			 intArray[i] = scan.nextInt();
		 }
	
		 sum = (intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4]);
		 
		 double avg = sum/5;
		 System.out.println("평균은 : " + avg);
	}

}
