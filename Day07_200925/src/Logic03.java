
public class Logic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] N = new int[10];
		
		N[0] = 0;
		N[1] = 1;
		int sum = N[0] + N[1];
		
		for(int j = 0; j<N.length; j++) {
			System.out.print(sum + " " );
			sum = N[0] + N[1];
			N[0] = N[1];
			N[1] = sum;
		}
		
	}

}
