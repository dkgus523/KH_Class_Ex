package class_ex;
class NumberBox {
	int ivalue;
	float fvalue;
}
public class Class_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberBox nb = new NumberBox();
		
		nb.ivalue = 10;
		nb.fvalue = (float)1.2345;
		
		System.out.println(nb.ivalue);
		System.out.println(nb.fvalue);
	}

}
