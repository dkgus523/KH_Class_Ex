package access.test;

import access.sample.PublicSample;

public class TestPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicSample pbt = new PublicSample();
		
		pbt.num = 10; //public �̹Ƿ� ���� ����
		System.out.println(pbt.num); // ���� ����
	}

}
