
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		for(int i =1; i<101; i++) {
			hap += i;	
			if(i % 10 == 0) {
				System.out.println(1 + "~" + i + "합" + hap);
			}
		}
	}
}
