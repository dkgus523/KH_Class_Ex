import java.util.Scanner;

public class Ex12_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0 ;
		int name;
		String subject[] = new String[2];
		subject[0] = "java";
		subject[1] = "c언어";
		String stu1[] = new String[3];
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("원하는 메뉴 방식을 선택하세요.");
			System.out.print("  / 1. 학생 이름 추가");
			System.out.print("  / 2. 교과목별 학생 목록 표시");
			System.out.print("  / 3. 프로그램 종료");
			
			choice = scan.nextInt();
			
			if(choice == 1) {     //추가 선택
				
				System.out.println("교과목 선택 : (1) java, (2) c언어");
				name = scan.nextInt();   
				for (int i = 0; i <stu1.length; i++) {
					//if(name == 1) {  
						//for(int j=0; j<stu2.length; j++) {
							System.out.print("학생 이름 : ");
							stu1[i] = scan.next();
							
							//break;
						//}
					//}
				}
				/*
				 * if(name == 2) { for(int j =0 ; j<stu2.length; j++) {
				 * System.out.print("학생 이름 : "); stu2[j] = scan.next(); break; } }
				 */
				//System.out.println(subject[0] + " : " + name[0] );
				//System.out.println(subject[1] + " : " + name[1] );			
			} else if(choice == 2) {   //목록 표시
				for(int i =0; i<subject.length; i++) {
					System.out.println("과목 : " + subject[i]);
				
					for(int j = 0; j<stu1.length; j++) {
						System.out.println("학생 : " + stu1[j]);
					}
				}
					/*
					 * if(stu1[i] != null || stu2[i] != null) { System.out.println("과목 : " +
					 * subject[i]); System.out.println("학생 : " + stu1[i] + stu1[i+1]);
					 * System.out.println("과목 : " + subject[i+1]); System.out.println("학생 : " +
					 * stu2[i] + stu2[i+1]); }
					 */
				
			}
			
			
			
		}while(choice != 3);
			System.out.println("종료");
			
			
		
		
				
		
	}

}
