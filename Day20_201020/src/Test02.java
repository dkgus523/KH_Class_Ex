
public class Test02 {

	public static void main(String[] args) {
		int i, j, val = 1;
		int[][] Arr = new int[5][5];
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<5; j++) {
				Arr[i][j] = val;
				if(i+j >= 5) { 
					Arr[i][j] = 0;
				} else 
					val++;		
			}
			/*
			 * val = val-4; val++;
			 */
		}
		
		
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<5; j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
