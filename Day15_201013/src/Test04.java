
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		int value = 1;
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				array[i][j] = value;
				value++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%4d",array[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==1 || i==3) {
					sum += array[i][j];
				}
			}
		}
		
		System.out.println("���� : " + sum);
		
		
	}

}
