package class_ex;
class Date{
	int year,month,day;
	void print(){
		System.out.println(year + "." + month + "." + day);
	}
}
public class Class_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date  date = new Date();
		date.year = 2020;
		date.month = 9;
		date.day = 5;
		date.print();
	}

}
