import java.util.Scanner;
public class BobbleSort {

	public static void bobbleSort(int arr[]) {
	Scanner scanner = new Scanner(System.in);
	//int[] arr = new int[5];
	int sum = 0;

	// �ݺ����� ���� �Է�

	for (int i = 0; i < 5; i++) {

		System.out.print((i + 1) + "��° ���� �Է� : ");
		arr[i] = scanner.nextInt();
		sum += arr[i];
	}
	
	System.out.println("\n�Է��� ���� �� ���� : " + sum);	
	
	// �������� �ڵ�
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
	
	// ��� �ڵ�
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		bobbleSort(arr);
		System.out.print("���� ��� : ");	
		for (int i = 0; i < arr.length; i++) {		
			System.out.print(arr[i] + "\t");		
		}	
	}
	
	
	
		
	}