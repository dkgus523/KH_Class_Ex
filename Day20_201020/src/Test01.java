
public class Test01 {

	public static void main(String[] args) {
		int i, j = 0; 
		int val = 1;
		int hap = 0;
		
		int[][] Arr = new int[5][5];
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<5; j++) {
				Arr[i][j] = val;								
				if(i>j) {
					hap  += val;
				}
				val++;
			}
		}
		for(i = 0; i<5; i++) {
			for(j = 0; j<5; j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		/*
		 * int hap1 = 0, hap2 = 0, hap3 = 0; for(i = 1; i<5; i++) { hap1 += Arr[i][0]; }
		 * for(i=2; i<5; i++) { hap2 += Arr[i][1]; } for(i=3; i<5; i++) { hap3 +=
		 * Arr[i][2]; } int hap4 = hap1+hap2+hap3+Arr[4][3];
		 */
		System.out.println("음영이 있는 부분의 합은 " + hap + " 입니다.");
	}

}
