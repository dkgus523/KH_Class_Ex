package plus_all_example;

public class All_Ex01 {

	public static void main(String[] args) {
		int hap = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 != 0 || i%4 != 0) {
				hap += i;	
			}
		}
		System.out.println("гую╨ " + hap);
	}

}
