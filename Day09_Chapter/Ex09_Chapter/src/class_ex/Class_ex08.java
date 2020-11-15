package class_ex;
class Movie {
	int year;
	String title;
	void print() {
		System.out.println(year + "년 " + title);
	}
}
public class Class_ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mv = new Movie();
		mv.year = 2020;
		mv.title = "무슨영화";
		mv.print();

	}

}
