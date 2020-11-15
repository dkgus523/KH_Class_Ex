
public class Logic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[10];
		int B[] = new int[10];
		
		for(int i=0; i<A.length; i++)
			A[i] = i + 1;
		for(int i=0; i<A.length; i++)
			B[i] = A[9-i];
		for(int i=0; i<A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println(" ");
		for(int i=0; i<B.length; i++)
			System.out.print(B[i] + " ");
		
	}

}
