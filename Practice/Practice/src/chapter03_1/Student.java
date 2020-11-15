package chapter03_1;
//   Student.java: 출석부의 한 학생을 나타낸다.
public class Student
{
    public int number;	// 학번
    public String name;	// 이름

    // -------------------------------------------------------
    //  변수들을 주어진 값들로 초기화하면서 새 Student 객체를 생성한다.
    // -------------------------------------------------------
    public Student(int Number, String Name)
    {
	number = Number;
	name = Name;
    }

    // -------------------------------------------------------
    //   현 Student 객체의 모든 데이터를 문자열로 반환한다.
    // -------------------------------------------------------
    public String toString ()
    {
	return (number + "\t\t" + name);
    }
}