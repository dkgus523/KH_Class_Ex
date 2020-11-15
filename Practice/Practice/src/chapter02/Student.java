
// 학생의 성적 기록을 나타낸다

import java.util.Scanner;

public class Student
{
    // 객체 변수들
    String name;			// 이름
    int quizscore;			// 퀴즈 점수
    int midtermscore;		// 중간시험 점수
    int finalscore;			// 기말시험 점수

    // 생성자메소드: 학생의 이름을 넘겨 받아 객체를 생성한다
    public Student(String studentName)
    {
  			// 여기에 코드를 삽입하세요
    }

    // 학생의 이름을 반환한다
    public String getName( )
    {
		return name;
	}

    // 학생의 퀴즈 점수를 반환한다
    public int getQuizScore( )
    {
  			// 여기에 코드를 삽입하세요
    	return quizscore;
	}

    // 학생의 중간시험 점수를 반환한다
    public int getMidtermScore( )
    {
  			// 여기에 코드를 삽입하세요
    	return midtermscore;
	}

    // 학생의 기말시험 점수를 반환한다
    public int getFinalScore( )
    {
  			// 여기에 코드를 삽입하세요
    	return finalscore;
	}

    //   현 Student 객체의 정보에 대한 문자열을 반환한다.
    public String toString ()
    {
		String str = "";
		str += "이름: " + name + "\n";
  			// 여기에 코드를 삽입하세요
		str += "퀴즈 점수 : " + quizscore + "\n"; 
		str += "중간시험 점수 : " + midtermscore + "\n"; 
		return str += "기말시험 점수 : " + finalscore + "\n"; 
    }

	// 이름을 주어진 값으로 변경한다
	public void setName(String Name)
	{
		this.name = Name;
	}

	// 퀴즈 점수를 주어진 값으로 변경한다
	public void setQuizScore(int QuizScore)
	{
  			// 여기에 코드를 삽입하세요
		this.quizscore = QuizScore;
	}

	// 중간시험 점수를 주어진 값으로 변경한다
	public void setMidtermScore(int MidtermScore)
	{
  			// 여기에 코드를 삽입하세요
		this.midtermscore = MidtermScore;
	}

	// 기말시험 점수를 주어진 값으로 변경한다
	public void setFinalScore(int FinalScore)
	{
  			// 여기에 코드를 삽입하세요
		this.finalscore = FinalScore;
	}

    // 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
    // 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
    public void inputGrades( )
    {
		Scanner scan = new Scanner (System.in);
  			// 여기에 코드를 삽입하세요
		System.out.print("이름을 입력하라 >> ");
		name = scan.next();
		System.out.print(name + "의 퀴즈 점수를 입력하라 >> ");
		quizscore = scan.nextInt();
		System.out.print(name + "의 중간시험 점수를 입력하라 >> ");
		midtermscore = scan.nextInt();
		System.out.print(name + "의 기말시험 점수를 입력하라 >> ");
		finalscore = scan.nextInt();
    }

    // 학생의 시험 점수들의 총점을 계산하여 반환한다
   // int hap = 0;
    public int getTotal( ) {
  			// 여기에 코드를 삽입하세요
    	int total = quizscore + midtermscore + finalscore ;
    	return total;
    }
   
    // 학생의 학점을 반환한다
  			// 여기에 메소드드를 삽입하세요
    	private int total;
		private String grade;
		public void getTotal(int total) {
			this.total = total;
		}
   	public String getGrade() {
   		switch(total/30) {
   		case 10:
   		case 9:
   			grade = "A학점";
   			break;
   		case 8:
   			grade = "B학점";
   			break;
   		case 7:
   			grade = "C학점";
   			break;
   		case 6 :
   			grade = "F학점";
   			break;
   		}
   		return grade;
   	}
    
}