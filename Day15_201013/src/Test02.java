import java.util.Scanner;
public class Test02 {
	
		public static void main(String[] args) {
			int arr[] = {4,7,3,6,1};
			
			bubbleSort(arr, arr.length);
			
			System.out.println("정렬 결과 :");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			
		}
		static void bubbleSort(int arr[],int n) {
			//Scanner scanner = new Scanner(System.in);
			
			int sum = 0;
			
			for(int i = 0; i<n-1; i++) {
				for(int j=0; j<(n-1)-i; j++) {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			System.out.println("\n입력한 수의 총 합은 :" + sum);
		}
		
	
}

