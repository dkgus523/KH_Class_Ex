package array_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("시험 응시자 수를 입력 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int [] test = new int[num];
		
		for(int i =0; i<num; i++) {
			System.out.print("점수를 입력: ");
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i=0; i<num; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는  " + test[i]);
		}
	}

}
