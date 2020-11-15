import java.util.Scanner;
class Range {
	private int count = 0;
	void Up() {
		count++;
	}
	int get() {
		return count;
	}
}
public class Logic06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Range[] ranges = new Range[10];        //배열 선언
		for(int i=0; i < ranges.length; i++)
			ranges[i] = new Range();
		int num;
		for(int i=0; i<10; i++) {
			//System.out.printf("%d번째 숫자를 입력하시오 : ", i+1);
			num = input.nextInt();    //입력한 숫자
			if( num < 1 || num > 100) {
				System.out.println("유효값을 벗어났습니다. 다시 입력해주세요.");
				i--;    //범위에서 벗어나면 전에 있는 배열로 간다
			} else {
				num/=10;     //입력한 숫자 10으로 나눈다
				ranges[num].Up();
			}
		}
		for (int i=0; i<10; i++) {    
			System.out.printf("%d ~ %d : ",(i*10)+1, (i+1)*10);  //출력하는 범위
			for (int j=0; j<ranges[i].get(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
