package Project01;

import java.util.Scanner;

/*4. 평균을 구하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는것으로 가정한다. 
 * 출력 : 입력된 점수 중 최대값을 제외하세요. 
 * 그 다음 나머지 2명의 점수의 평균을 구하여 출력하시오.
 * 학습정보 : 형변환 반드시 사용할 것!
 */
public class Pro04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생1의 이름을 입력하세요 >>");
		String student1 = scan.next();
		System.out.print("학생1의 성적을 입력하세요 >>");
		int num1 = scan.nextInt();
		
		System.out.print("학생2의 이름을 입력하세요 >>");
		String student2 = scan.next();
		System.out.print("학생2의 성적을 입력하세요 >>");
		int num2 = scan.nextInt();
		
		System.out.print("학생3의 이름을 입력하세요 >>");
		String student3 = scan.next();
		System.out.print("학생3의 성적을 입력하세요 >>");
		int num3 = scan.nextInt();
		
		//if(num1 > 100 && num1 > 100 && num1 > 100 )
		//	System.out.println("성적은 100점 만점입니다. 다시 입력해주세요.");
		//if(num1 == num2 && num1 == num3 && num2 == num3 )
		//	System.out.println("성적은 중복이 되면 안됩니다. 다시 입력해주세요.");
		
		System.out.println("학생1 정보 : " + student1 + " " + num1 );
		System.out.println("학생2 정보 : " + student2 + " " + num2 );
		System.out.println("학생3 정보 : " + student3 + " " + num3 );
		
		int max = num1 > num2 ? num1 : num2;
		max = max > num3 ? max : num3;
		
		double avg = ((double)(num1 + num2 + num3 - max)/2);
		
		System.out.println("최대값을 제외한 나머지 성적의 평균은 " + avg + " 입니다.");
		/*
		if(num1 > num2 && num1 > num3)
			System.out.printf("최대값을 제외한 나머지 성적의 평균은 ?  %4d", ((num2 + num3)/2));
		else if(num2 > num3 && num2 > num1)
			System.out.printf("최대값을 제외한 나머지 성적의 평균은 ? %4d", ((num1 + num3)/2));
		else
			System.out.printf("최대값을 제외한 나머지 성적의 평균은 ? %4d", ((num1 + num2)/2));
			*/
	}

}
