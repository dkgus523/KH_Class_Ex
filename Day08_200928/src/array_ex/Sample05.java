package array_ex;

public class Sample05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test1;
		test1 = new int[3];
		
		test1 [0] = 80;
		test1 [1] = 60;
		test1 [2] = 22;
		int[] test2;
		test2 = test1;
		for(int i=0; i<3; i++) {
			System.out.println("test1" + (i+1) + " " + test1[i]);
		}
		for(int i=0; i<3; i++) {
			System.out.println("test2" + (i+1) + " " + test2[i]);
		}
	}

}
