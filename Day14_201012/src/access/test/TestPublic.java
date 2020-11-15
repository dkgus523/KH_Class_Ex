package access.test;

import access.sample.PublicSample;

public class TestPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicSample pbt = new PublicSample();
		
		pbt.num = 10; //public 이므로 접근 가능
		System.out.println(pbt.num); // 접근 가능
	}

}
