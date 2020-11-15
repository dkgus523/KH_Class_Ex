package array_ex;

public class Sample07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {80,60,22,50,75};
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i]);
		}
		System.out.println("시험의 응시자 수는  " + test.length + "명");
	}

}
