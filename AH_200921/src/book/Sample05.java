package book;

public class Sample05 {
	public static void main(String[] args) {
		boolean flag=true;  //참, 거짓 표현 변수
		char grade='A';
		byte value=90;
		short svalue=2500;
		int num=1250000;
		long price=2350L;
		float tax=3.3f;  // f를 붙여주는 이유 8이 4바이트로 바꿔줘서 - 형변환
		double score=99.5;

		System.out.println("변수 공간에 기록된 초기값 확인");
		System.out.println("flag: " + flag);
		System.out.println("grade: " + grade);
		System.out.println("value: " + value);
		System.out.println("svalue: " + svalue);
		System.out.println("num: " + num);
		System.out.println("price: " + price);
		System.out.println("tax: " + tax);
		System.out.println("score: " + score);
	}
}
