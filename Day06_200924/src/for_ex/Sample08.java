package for_ex;

public class Sample08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bl = false;
		for(int i=0; i<5; i++) {
			for(int j = 0; j < 5; j++) {
				if(bl == false) {
					System.out.print("*");
					bl = true;
				} else {
					System.out.print("-");
					bl = false;
				}
			}
			System.out.print("\n");
		}

	}

}
