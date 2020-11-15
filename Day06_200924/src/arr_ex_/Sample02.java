package arr_ex_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시험 응시자 수를 입력 : ");
		String str = br.readLine(); 
		int num = Integer.parseInt(str);    //응시자 수 입력 
		
		int [] test = new int[num];  //입력한 응시자 수에 맞게 점수를 입력할 수 있는 배열 설정
		
		for(int i=0; i<num; i++) {
			System.out.print("점수를 입력 : ");
			str = br.readLine();  
			int tmp = Integer.parseInt(str);  //점수 입력
			test[i] = tmp;  //각 배열에 해당되는 점수 들어감
		}
		for(int i=0; i<num; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i]);  //각 사람당 점수 나열
		}
	}

}
