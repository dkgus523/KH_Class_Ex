import java.util.Scanner;
public class BobbleSort {

	public static void bobbleSort(int arr[]) {
	Scanner scanner = new Scanner(System.in);
	//int[] arr = new int[5];
	int sum = 0;

	// 반복문을 통한 입력

	for (int i = 0; i < 5; i++) {

		System.out.print((i + 1) + "번째 숫자 입력 : ");
		arr[i] = scanner.nextInt();
		sum += arr[i];
	}
	
	System.out.println("\n입력한 수의 총 합은 : " + sum);	
	
	// 버블정렬 코드
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];				
				arr[j + 1] = temp;
			}
		}
	}
	
	}
	
	// 출력 코드
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		bobbleSort(arr);
		System.out.print("정렬 결과 : ");	
		for (int i = 0; i < arr.length; i++) {		
			System.out.print(arr[i] + "\t");		
		}	
	}
	
	
	
		
	}