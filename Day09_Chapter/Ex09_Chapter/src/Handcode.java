
public class Handcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[5];

		int hap = 0;

		for(int i=0; i<5; i++){
			test[i] = (i*10) + 10;
			System.out.println(test[i]);
			hap += test[i];
		} 

		System.out.println("합계는 : " + hap);
	}

}
