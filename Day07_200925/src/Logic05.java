
public class Logic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data  = {45, 66, 84, 55, 64, 88, 99};
		
		int max = 0;
		int mim = 0;
		int hap = 0;
		
		for(int i = 0; i<data.length; i++) {		
			if( data[i] > max && data[i] < mim)
				hap = hap - (max+mim);
			hap += data[i];
		}
		System.out.println("최대값과 최소값을 제외한 합은 " + hap + "입니다.");
		
	}

}
